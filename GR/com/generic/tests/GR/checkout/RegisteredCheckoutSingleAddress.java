package com.generic.tests.GR.checkout;

import java.text.MessageFormat;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

import com.generic.page.Cart;
import com.generic.page.CheckOut;
import com.generic.page.Registration;
import com.generic.setup.ExceptionMsg;
import com.generic.setup.GlobalVariables;
import com.generic.setup.LoggingMsg;
import com.generic.setup.SelTestCase;
import com.generic.util.RandomUtilities;

public class RegisteredCheckoutSingleAddress extends SelTestCase {

	public static void startTest(int productsCount, LinkedHashMap<String, String> addressDetails,
			LinkedHashMap<String, String> paymentDetails, LinkedHashMap<String, String> userDetalis) throws Exception {

		try {
			getCurrentFunctionName(true);

			String orderSubTotal;
			String orderTax;
			String orderShipping;

			String fName = "FirstVisa";
			String lName = "LastVisa";
			String userMail = RandomUtilities.getRandomEmail();
			String userPassword = "TestITG226";

			int productsCountStepTWO = 0;

			// Perform login
			Registration.registerFreshUser(userMail, userPassword, fName, lName);

			// Add products to cart
			CheckOut.addRandomProductTocart(productsCount);
			
			// Navigating to Cart by URL
			CheckOut.navigatetoCart();
			
			Thread.sleep(3500);

			Cart.closeGWPIfExsist();

			// Clicking begin secure checkout
			CheckOut.clickBeginSecureCheckoutButton();

			if (!CheckOut.checkIfInStepTwo()) {
				// Proceed to step 2
				CheckOut.proceedToStepTwo();
			}

			Thread.sleep(1000);

			// Check number of products in step 2
			sassert().assertTrue(CheckOut.checkProductsinStepTwo() >= productsCount,
					"Some products are missing in step 2 ");
			productsCountStepTWO = CheckOut.checkProductsinStepTwo();

			Thread.sleep(2500);

			// Proceed to step 3
			CheckOut.proceedToStepThree();

			Thread.sleep(1000);

			// Proceed to step 4
			CheckOut.proceedToStepFour();
			
			Thread.sleep(3500);
			
			// Current PWA issue
			if (!CheckOut.checkIfinStepFour()) {
				CheckOut.proceedToStepFour();

			}

			Thread.sleep(1000);

			CheckOut.clickCreditCardPayment();

			// Saving tax and shipping costs to compare them in the confirmation page
			orderShipping = CheckOut.getShippingCosts();
			orderTax = CheckOut.getTaxCosts(GlobalVariables.GR_TAX_CART);
			orderSubTotal = CheckOut.getSubTotal();

			logs.debug(MessageFormat.format(LoggingMsg.SEL_TEXT, "Shippping cost is: " + orderShipping
					+ " ---- Tax cost is:" + orderTax + " ---- Subtotal is:" + orderSubTotal));

			// Fill payment details in the last step
			CheckOut.fillPayment(paymentDetails);

			// Click place order button
			CheckOut.placeOrder();
			
			if (isMobile())
				Thread.sleep(GlobalVariables.deley.placeOrderDelay);
			
			if (isMobile() && !CheckOut.checkIfOrderPlaced() ) {

				// Fill payment details in the last step
				CheckOut.fillPayment(paymentDetails);

				// Click place order button
				CheckOut.placeOrder();

			}

			Thread.sleep(3500);
			CheckOut.printOrderIDtoLogs();

			CheckOut.checkOrderValuesGR(productsCount,orderShipping, orderTax,orderSubTotal );

			getCurrentFunctionName(false);

		} catch (NoSuchElementException e) {
			logs.debug(MessageFormat.format(ExceptionMsg.PageFunctionFailed, new Object() {
			}.getClass().getEnclosingMethod().getName()));
			throw e;
		}

	}

}
