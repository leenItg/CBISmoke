package com.generic.setup;

public class LoggingMsg {

	public static final String CHECKOUTDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}<br><b>case proprties:</b><br>- {3}<br>- {4}<br>- {5}";
	public static final String REGISTRATIONDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}<br><b>fields to validate:</b><br>- {3}<br>";
	public static final String CARTDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}<br><b>case proprties:</b><br>- {3}<br>- coupon: {4}<br>- new QTY: {5}";
	public static final String PDPDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}<br><b>case proprties:</b><br>- {3}";
	public static final String TEST_CASE_DESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Description: </b>{2}<br>";
	public static String CLICKING_CART_BUTTON = "clicking on {0} btn from cart";
	public static String NUMBER_OF_PRODUCTS = "number of products: {0}";
	public static String NUMBER_OF_ORDERS = "number of orders: {0}";
	public static String ORDER_TOTAL = "Order Total: {0}";
	public static String ORDER_SUBTOTAL = "Order subtotal: {0}";
	public static String APPLYING_COUPON = "{0} Coupon {1}" ;
	public static String SEL_TEXT = "{0}";
	public static String COUPON_MSG = "The coupon msg is : {0}";
	public static String ERROR_MSG ="Error message is: {0}";
	public static String EMPTY_CART_ERROR_MSG = "Cart is not empty: {0}";
	public static String REMOVE_ALL_ITEMS_FROM_CART = "removing all items from cart";
	public static String NO_ITEMS_TO_BE_REMOVED = "No items to be removed";
	public static String SELECTING_ELEMENT_VALUE = "Selecting {0} {1}";
	public static String TYPING_ELEMENT_VALUE = "typing {0} {1}";
	public static String SAVING_ADDRESS = "Saving Address";
	public static String CLICKING_SHIPPING_NEXT_BTN = "clicking next in shipping address form";
	public static String GET_ELEMENT_BY_LOCATOR = "get element by locator {0}";
	public static String TERMINATING_SESSION = "Terminating session";
	public static String WRITING_TO_SEL = "{0}Writing {1} to: {2}";
	public static String CLICK_ELEMENT_SEL = "Click element {0}";
	public static String BROWSER_NAME = "Case Browser: {0}";
	public static String INVALID_BROWSER_ERROR_MSG = "Invalid browser. Check the config file";
	public static String TEST_ENVIRONMENT_NAME = "Test environment is: {0}";
	public static String ENABLE_BLOCK_FOR_FUTURE = "Please enable this block for future";
	public static String WAIT_FOR_TIME = "wait for {0}";
	public static String CURRENT_URL = "Current URL: {0}";
	public static String FUNCTION_NAME = "{0}";
	public static String EXPECTED_TEXT = "Expected Text: {0}";
	public static String ACTUAL_TEXT = "ACTUAL TEXT IS: {0}";
	public static String WAIT_SECONDS = "Wait: {0} Sec";
	public static String ACTUAL_EXPECTED_ERROR = "Error -> Actual: {0} Expected: {1}";
	public static String KILLING_PROCESS = "Killing {0} process";
	public static String NOT_RUNNING_PROCESS_ERROR_MSG = "{0} process is not running. Starting Scripts execution on {1}";
	public static String NULL_FILE_PATH_ERROR_MSG = "The {0} file path is null, then generating it";
	public static String READING_DATA_FROM_SHEET = "reading data from sheet: {0} row: {1}";
	public static String STARTING_THREAD = "<font color='green'>>>> Starting {0} >>> </font>";
	public static String ENDING_THREAD = "<font color='green'><<< Ending {0} <<< </font>";
	public static String COUNTER_VALUE = "The value of the counter is: {0}";
	public static String EXECUTE_TEST_CASE = "Execute test case {0}";
	public static String DEBUGGING_TEXT = "{0}";
	public static String TERMINATING_DRIVERS = "terminating {0} drivers";
	public static String TEST_CASE_STATUS = "#########--> \nTest {0} was: {1} \n<--######### \n";
	public static String IGNORE_CASES = "total of ignored cases: {0} ";
	public static String ADDING_PRODUCT = "Adding product {0}";
	public static String VALIDATION_DIVIDER = "==============> Validation <================";
	public static String FORM_FIELDS_WITH_VALUES = "{0}: {1}";
	public static String FINISHED_MSG = "FINISHED";
	public static String RANDOM_EMAIL_MSG = "The random email is: {0}";
	public static String WRITING_INDEX_FILE_ERROR_MSG = "Error in writing index file";
	public static String ADDING_STATUS_CASE_TO_REPORT = "Adding a {0} case to report";
	public static String IN_SELECTOR_TYPE = "in {0}";
	public static String VALID_SEL_MSG = "Found a valid selector: {0}";
	public static String NO_VALID_SEL_ERROR_MSG = "XXX>> NO Valid Selector Found <<XXX";
	public static String DEFAULT_ACTION_MSG = "Returning the default action";
	public static String SEL_TYPE = "selector type is {0}";
	public static String CLICKING_SEL = "clicking on {0}";
	public static String CHECKBOX_SEL_VAL = "check box {0} {1}";
	public static String CHECKING_UNCHECKING_MSG = "{0}checking the check box- check box status is {1}checked";
	public static String GETTING_SEL = "getting {0} from {1}";
	public static String FAILED_ACTION_MSG = "Failed to {0}";
	public static String TRY_ALT_WAY_MSG = "Try alternative way: ";
	public static String SELECTED_INDEX = "selected index is {0}";
	public static String ERROR_VERIFICATION_SEL_MSG = "The {0} is found and has correct error msg";
	public static String FORMATTED_ERROR_MSG = "<font color='red'>ERROR >>>-->>> </font>: {0}";
	public static String FINISHED_ACTION_ON_ELEMENTS_MSG = "<font color='blue'>FINISHED</font> doing correct action on elements: {0}";
	public static String SENDING_MAIL_TO = "sending mail to: {0}";
	public static String SUCCESSFULLY_SENT_MSG = "message sent successfully...";
	public static String FAILED_SENDING_MSG = "Fail to send message";
	public static String CLEAR_LOGS_MSG = "Clearing logs file{0}";
	public static String EXECUTE_REPORT_SETUP = "Execute reportSetup";
	public static String REPORT_DIR = "Reports dir.: {0}";
	public static String MAIN_DIR_EXISTANCE_MSG = "the main directory you are searching {0} exist: {1}";
	public static String FAILED_REPORT_FOLDERS_CREATION_MSG = "FAILS TO CREATE REPORT FOLDERS";
	public static String TEST_NAME = "Reading sheet Name -- {0}";
	public static String ADDED_ENVIRONMENT_NAME = "adding environment: {0}";
	public static String REPORT_TCID_MSG = "Report test case ID is: {0}";
	public static String SHEET_NAME_LOCATION_TO_WRITE = "writing data to sheet: {0} location: {1}/{2} data: {3}";
	public static String NOT_EXIST_MSG = "{0} is not exist";
	public static String COL_INDEX_MSG = "Col index is: {0}";
	public static String PLP_SELECTED_SORT_VALUES = "{0} is: {1} and {2} is: {3}";
	public static String PLP_PRODUCT_PRICE = "productPrice is: {0}";
	public static String PLP_CHANGE_LOCATION_LINK_FUNCTIONALITY_MSG = "change location link didn't work well";
	public static String PLP_SELECTED_FILTER_COUNT = "selected {0} count: {1}";
	public static String PLP_FILTER_FUNCTIONALITY = "Filter is {0}applied correctly";
	public static String CLICKING_MYACCOUNT_BUTTON = "clicking on {0} btn from Home page";
	public static String CLICKING_ADDRESS_BOOK_BUTTON = "clicking on {0} btn from Home page";
	public static String CLICKING_SETASDEFAULT_BUTTON = "clicking on {0} btn from address book";
	public static String CLICKING_REMOVE_BUTTON = "clicking on {0} btn from address book";
	public static String CLICKING_Edit_BUTTON = "clicking on {0} btn from address book";
	public static String ADDRESS_DETAIL = "Address Detail: {0}";
	public static String OLD_ADDRESS_DETAIL = "Old Address: {0}";
	public static String CLICKING_ADD_ADDRESS_BUTTON = "clicking on {0} btn from address book";
	public static String CLICKING_SAVE_ADDRESS_BUTTON = "clicking on {0} btn from add address";
	public static String CLICKING_MAKE_THIS_MY_DEFAULT_ADDRESS_CHECKBOX = "clicking on {0} btn from add address";
	public static String CLICKING_DELETE_BUTTON = "clicking on {0} btn from delete confirmatiom modal";
	public static String NUMBER_OF_ADDRESSES = "number of addresses: {0}";
	public static String CLICKING_BACK_TO_ADDRESSES_BUTTON = "clicking on {0} btn from add address";
	public static String DEFAULT_ADDRESS_UPDATE_MESSAGE = "Address update message: {0}";
	public static String PAMENT_DETAILS = "Payment Dtails: {0}";
	public static String PAYMENT_CARD_REMOVED_MESSAGE = "Remove card message: {0}";
	public static String REFRESH_SESSION = "REFRESH_SESSION";
	public static String RETURNING_TO_PREVIOUS_PAGE= "BACK TO PREVIOUS PAGE";
	public static String ORDER_HISTORY_NO_ORDERS = "No Orders";
	public static final String ADDRESSPOOKDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}";
	public static final String PAYMENTDESC = "<b>Case ID: </b>{0} <br><b>File of execution:</b> {1}<br><b>Decrption: </b>{2}";
	public static String GETTING_TEXT = "Getting text of : {0}";
	public static String REGISTRATION_FIELDS_ERRORS = "Verifying {0} Message";
	public static String PROPERTY_ERROR_MSG = "The following property: {0} is not found";
	public static String SearchResulstHeader_Search_Empty = "0 items found for keyword {0}";
	public static String SearchResulstHeader_Search = "You searched for {0}{1}{2}";
	public static String NUMBER_OF_MENUE_ITEMS = "Number of menue itesms is: {0}";
	public static String NUMBER_OF_ACTIVE_STARS = "Nnumber of active stars {0}";
	public static String NUMBER_OF_ACTIVE_VARIANTS =  "Nnumber of active variants {0}";
	public static String NUMBER_OF_ACTIVE_SIZES = "Nnumber of active sizes {0}";
	public static String APPLIED_FILTER_COUNT ="Number of applied filters count is: {0}";
	public static String USER_IS_NOT_LOGGED_IN_SUCCESSFULLY = "Your username or password was incorrect";
	public static String CHECKOUT_RESULT = "<b>TestResults:</b><br>- Emailused {0}<br>- Order ID: {1}<br>- Ordertotal: {2}<br>- Ordersubtotal: {3}<br>- OrderTax: {4}<br>- Ordershipping: {5}"; 
}
