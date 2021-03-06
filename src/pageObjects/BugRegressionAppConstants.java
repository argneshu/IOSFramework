package pageObjects;

import java.io.File;
import java.io.FileInputStream;

import bugRegressionSuite.BaseTestBugRegression;


//This interface hold all the objects of consumer application

public interface BugRegressionAppConstants {
	// Lets go shopping button on first time application launch
	

//	String buildType = ".staging";
    String buildType = "";
    
	//POPUP
	String NotificationPopUP_name = "OK";
	String LocationPopUp_name = "Allow";
	// Quick Tour

	String LetsGoShopping_text = "LET'S GO SHOPPING";
	String LetGoShopping_Id = "com.zopperapp:id/tv_boarding_page_done";
	// Shop The Zopper Way
	String ShopTheZopperWayMobile_id = "com.zopperapp.dev:id/iv_smart_cat";
	String ShopTheZopperWayTablet_id = "com.zopperapp.dev:id/iv_smart_cat1";
	String PageSpinner_id = "com.zopperapp.dev:id/pb_location_parent";

	// Gmail

	String Mail_To_id = "com.google.android.gm:id/to";
	String Mail_To_xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout[@index=1]/android.widget.MultiAutoCompleteTextView";
	String Mail_Subject_id = "com.google.android.gm:id/subject";
	String Mail_Send_id = "com.google.android.gm:id/send";

	// String Mail_From_id="com.google.android.gm:id/body";
	String Mail_From_id = "com.google.android.gm:id/from_account_name";
	String Gmail_name = "Gmail";

	// Find the right Mobiles

	String STZWSkip_text = "SKIP";
	String STZWGaming_xpath = "//android.widget.FrameLayout /android.view.View /android.view.View /android.view.View /android.view.View[1]";
	String STZWPhotos_xpath = "//android.widget.FrameLayout /android.view.View /android.view.View /android.view.View /android.view.View[2]";
	String STZWBusiness_xpath = "//android.widget.FrameLayout /android.view.View /android.view.View /android.view.View /android.view.View[3]";
	String STZWCalling_xpath = "//android.widget.FrameLayout /android.view.View /android.view.View /android.view.View /android.view.View[4]";

	// Mobiles for You

	String STZWFirstMobileProduct_text = "//android.widget.FrameLayout /android.support.v7.widget.RecyclerView /android.widget.RelativeLayout[1] /android.widget.TextView[1]";
	String STZWSecondMobileproduct_text = "//android.widget.FrameLayout /android.support.v7.widget.RecyclerView /android.widget.RelativeLayout[2] /android.widget.TextView[1]";

	// Welcome Page
	String Lets_Go_Shopping_Id = "com.zopperapp.staging:id/tv_boarding_page_done";
	String Prod_Lets_Go_Shopping_Id = "LET'S GO SHOPPING";
	String LetsGoShopping_name = "LET'S GO SHOPPING";

	// Home page
	String Prod_Home_Menu_Id = "com.zopperapp:id/tv_drawer_list_row_title";
	String Home_ExcitingCategory = "com.zopperapp" + buildType + ":id/cat_name";
	String Prod_Cart_Id = "com.zopperapp" + buildType + ":id/iv_cart";
	String ProductionCart_id = "com.zopperapp" + buildType + ":id/action_cart";
	String TrendingProducts_ID = "com.zopperapp" + buildType + ":id/tv_home_popular_products_title";
	String RecentlyViewedFirstProduct_id = "com.zopperapp" + buildType + ":id/iv_product_image_first";
	String RecentlyViewedSecondProduct_id = "com.zopperapp" + buildType + ":id/iv_product_image_second";
	String ConnectionErrorPage_id = "com.zopperapp" + buildType + ":id/tv_error_label";
	String NoItemInCart_name = "No Item in Cart";
	String Home_RecentltViewed_name = "Recently Viewed";
	String ConnectionErrorPage_name = "Connection timeout";
	String AutoSuggestSearch_id = "com.zopperapp" + buildType + ":id/tv_auto_suggest";
	String Home_SearchEditBox_name = "Search Products";
	String HomeSearchtextbox_id = "com.zopperapp" + buildType + ":id/home_search";
	String HomeSpinner_id = "com.zopperapp.staging:id/pb_home";
	String SearchSuggestionlist_id = "com.zopperapp" + buildType + ":id/lv_auto_suggest";
	String CartGoHome_name = "Go to Home";
	String CartDeleteButton_name = "ic closepopup";
	String CartDeletePopup_xpath = "//UIAButton[@name='Delete']";
	// String SearchIcon_id = "com.zopperapp:id/action_search";

	String HomeRecentlyViewedHeader_Text = "Your Recent Interests";
	String recentlyViewedProduct_id = "com.zopperapp:id/rl_products";
	String HomePageExploreExcitingCategories_text = "Explore Exciting Categories";

	String ExploreExcitingMobileAndTablets_xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/"
			+ "android.widget.ScrollView/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index=0]";
	String CategoryHeader_Xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/"
			+ "android.widget.FrameLayout/android.widget.TextView[@index=1]";

	String AddWarrantyFromHome_id = "com.zopperapp" + buildType + ":id/save_invoice";
	String AddWarrantyFromHome_Text = "Save Purchase Invoice For Brand Warranty";
	String HomePageExchange_Text = "Exchange";
	String HomePageExchangeCategory_xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/"
			+ "android.widget.ScrollView/android.widget.LinearLayout[@index=29]";
	String ExchangeCategoryHeader_xpath = "//android.widget.FrameLayout/android.widget.TextView[@index=1]";

	// Rediffmail selenium scenario

	String Rediff_LoginUser_id = "txtlogin";
	String Rediff_ContinueButton_id = "btn_go";
	String Rediff_Password_id = "pass_box";
	String Rediff_LoginButton_xpath = "//input[@type='submit' and @value='Login']";
	String Rediff_MailBox_xpath = "//a[@class='curhand' and @title='Lightning fast free email']//u[contains(text(),'rediffmail')]";
	String Rediff_ResetMail_xpath = "//*[@id='mailList']//a[contains(text(),'no-reply@zopper.com')]";
	String Rediff_ResetLinkInMail_xpath = "//*[@id='mailMsgBody']/a";
	String Rediff_NewPassword_id = "password";
	String Rediff_ConfirmPassword_id = "confirm_password";
	String Rediff_Submit_id = "changePWD";
	String Rediff_SuccessMsg_id = "successMessage";
	String SignUpIcon_id = "com.zopperapp" + buildType + ":id/iv_drawer_signup_icon";

	// Nav drawer category list

	String Category_List_Id = "com.zopperapp.staging:id/tv_drawer_list_row_title";
	// Navigation Drawer

	String Skip_button = "android.widget.Button";
	// String Skip_button = "android.widget.TextView";
	String skip_button_text = "Skip";
	//String Open_Navigation_Drawer = "com.zopperapp" + buildType + ":id/home_navigation";
	String Open_Navigation_Drawer_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[2]";
	String OpenNavigationDrawerForMobAndTabPage = "android.widget.ImageButton";
	String NavDrawer_Mobile_tablets_link = "Mobiles & Tablets";
	String MTtext_xpath ="//UIAStaticText[@name='Mobiles & Tablets']";
	String KPtext_xpath ="//UIAStaticText[@name='Kitchen Appliances']";
	String HPtext_xpath ="//UIAStaticText[@name='Home Appliances']";
	String THtext_xpath ="//UIAStaticText[@name='TV & Home Entertainment']";
	String CAtext_xpath ="//UIAStaticText[@name='Computers & Accessories']";
	String ATtext_xpath ="//UIAStaticText[@name='Automotive & Tyres']";
	String PCtext_xpath ="//UIAStaticText[@name='Personal Care & Health']";
	String NavDrawer_Kitchen_Appliances_link = "Kitchen Appliances";
	String NavDrawer_Home_Appliances_link = "Home Appliances";
	String NavDrawer_TV_VideoPlayer_link = "TV & Video Player";
	String NavDrawer_Login_button_id = "com.zopperapp.staging:id/tv_drawer_signup_title";
	String NavDrawer_Location_text = "Delhi";
	String NavDrawer_SubLocation_id = "com.zopperapp.staging:id/tv_drawer_location_child";

	// Navigation Drawer

	String Homelink_id = "com.zopperapp" + buildType + ":id/tv_drawer_home_title";
	String Hometext_name = "Home";
	String NavDrawerLocation_id = "com.zopperapp.staging:id/tv_drawer_location_title";

	String NavDrawer_Mobile_tablets_xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[@index=0]/"
			+ "android.widget.ListView/android.widget.RelativeLayout[@index=1]/android.widget.TextView";

	String NavDrawer_TV_Home_Entertainment_link = "TV & Home Entertainment";
	String NavDrawerComputerAccessorieslink_name = "Computers & Accessories";
	String NavDrawerPersonalCare_name = "Personal Care & Health";
	String NavDrawerAutomotive_name = "Automotive & Tyres";

	String NavDrawerLocationChild_id = "com.zopperapp" + buildType + ":id/tv_drawer_location_child";
	String NavDrawerLocationIcon_id = "com.zopperapp" + buildType + ":id/iv_drawer_location_icon";
	String Location_xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[2]";
	String Locationtext_xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
	String NavDrawerLocationTitle_id = "com.zopperapp" + buildType + ":id/tv_drawer_location_title";
	String NavDrawer_loginbutton_name = "Login or Sign up";
	String NavDrawerHomeIcon_id = "com.zopperapp" + buildType + ":id/iv_drawer_home_icon";
	String Login_UserName_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]";
	String Login_Password_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]";
	String Login_Button_name = "LOG IN";
	String Homelink_Prod_id = "com.zopperapp" + buildType + ":id/tv_drawer_home_title";
	String addWarranty_id = "com.zopperapp" + buildType + ":id/layout_drawer_warranty";
	String Add_Product_For_Warranty_Text = "Add product for Warranty";
	String Add_Product_For_Warranty_id = "com.zopperapp" + buildType + ":id/iv_drawer_warranty_icon";

	// Home page

	String Home_Menu_Id = "com.zopperapp" + buildType + ":id/tv_drawer_list_row_title";
	String Home_Mobiles_Tablets_id = "com.zopperapp.dev:id/iv_root_cat_full1";
	String Home_Kitchen_Appliances_id = "com.zopperapp.dev:id/iv_root_cat_full2";
	String Home_Appliances_id = "com.zopperapp.dev:id/iv_root_cat_full3";
	String Home_TV_Video_Player_id = "com.zopperapp.dev:id/iv_root_cat";
	String Home_search_button_id = "com.zopperapp" + buildType + ":id/home_search";
	String InnerPage_search_button_id = "com.zopperapp" + buildType + ":id/action_search";
	String Search_Bar_textbar_text = "Best Products from Trusted Local Stores";
	String Search_Bar_textbar_id = "com.zopperapp.staging:id/et_search_product";
	String Cart_id = "com.zopperapp.staging:id/action_cart";
	String Home_name = "Home";
	String HomeOverflow_name = "More options";
	String first_product_id = "com.zopperapp.dev:id/rl_first_product_block";
	String second_product_id = "com.zopperapp.dev:id/rl_second_product_block";
	String third_product_id = "com.zopperapp.dev:id/rl_third_product_block";
	String fourth_product_id = "com.zopperapp.staging:id/rl_fourth_product_block";
	String Home_search_button_xpath = "//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.TextView[2]";
	String Home_Search_box_id = "com.zopperapp.staging:id/home_search";
	String Home_Search_TextBox_Id = "com.zopperapp" + buildType + ":id/home_search";

	// Login page
	String Login_text = "LOG IN";
	String Facebook_button_name = "Log in";
	String Facebook_button_xpath = "//android.widget.FrameLayout/ android.widget.Button[2]";
	String Google_button_xpath = "//android.widget.FrameLayout/ android.widget.Button[3]";
	String Gmail_account_id_option1_xpath = "//android.widget.CheckedTextView[@index=0]";
	String Gmail_account_ok_button = "android:id/button2";
	String Google_SignIn_link = "Sign in";
	String Email_name = "E-mail ID";
	String Password_xpath = "//android.widget.FrameLayout/ android.widget.EditText[2]";
	String LoginButton_name = "LOGIN";
	String StagingLoginButton_name = "Login";
	String LoginPageButton_name = "LOG IN";
	String SignUP_name = "sign up";
	String SkipButton_id = "com.zopperapp.dev:id/item_skip";
	String login_passwd_id = "com.zopperapp.staging:id/et_login_password";
	String Forgot_password_id = "com.zopperapp.staging:id/tv_forgot_password";
	String Gmail_account_id_option2_xpath = "//android.widget.CheckedTextView[@index=0]";
	String Login_Button_Id = "com.zopperapp.staging:id/button_login";
	String Google_SignInId = "com.zopperapp.staging:id/login_button_google";
	String Forgot_Password_Link_name = "Forgot Password?";
	String FB_User_Password_Id = "android.widget.EditText";
	String FB_Login_Button_Id = "android.widget.Button";
	String Logout_PopUp_Yes_Id = "com.zopperapp" + buildType + ":id/logout_yes";
	String FacebookUserName_xpath = "//UIATextField[@value='Email address or phone number']";
	String FacebookPassword_xpath = "//UIASecureTextField[@value='Facebook password']";
	String FacebookLoginButton_name = "//UIAButton[@label='Log In']";
	
	//Google+
	
	String GoogleAllow_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]";

	// Forgot Password Page
	String Forgot_password_text = "Forgot Password";
	String submit_button_text = "SUBMIT";
	String Email_id_text = "E-mail ID";

	// Shopping Cart

	String ShoppingCartDeleteButton_id = "com.zopperapp.staging:id/iv_cart_delete_product";
	String ShoppingCart_Text = "Shopping Cart";
	String NoItemInCartLabel_id = "com.zopperapp.staging:id/tv_error_label";
	String CheckoutButton_id = "com.zopperapp"+buildType+":id/tv_checkout";
	String ContinueButton_id = "com.zopperapp.staging:id/tv_checkout";
	String CashOnDelivery_id = "com.zopperapp.staging:id/tv_payment_mode_cod";
	String CashOnDelivery_Name = "CASH ON DELIVERY";
	String PlaceOrder_id = "com.zopperapp.staging:id/tv_checkout";
	String CouponTextbox_id = "com.zopperapp.staging:id/et_coupon_value";
	String CouponApplyButton_id = "com.zopperapp.staging:id/tv_apply_coupon";
	String CouponError_id = "com.zopperapp.staging:id/tv_apply_coupon_error";
	String NameValidation_text = "Please enter your full name";
	String EmailValidation_text = "Please enter a valid email ID";
	String MobileNumber_text = "Please enter a 10 digit mobile number";
	String AddNewAdress_id = "com.zopperapp.staging:id/saved_address";
	String CouponCode_id = "com.zopperapp.staging:id/et_coupon_value";
	String ApplyCoupon_id = "com.zopperapp.staging:id/tv_apply_coupon";
	String PlaceOrderButton_id = "com.zopperapp.dev:id/tv_checkout";
	String ShopMoreButton_id = "com.zopperapp.dev:id/tv_payment_next_step";
	String AddToCartButton_id = "com.zopperapp"+buildType+":id/tv_buy";
	String ContinueToCart_name ="CONTINUE TO CART";
	String LargeImageBuyNowButton_id = "com.zopperapp"+ buildType +"id/tv_gallery_buy";

	String CouponErrorMessage_id = "com.zopperapp.dev:id/tv_apply_coupon_error";
	String Prod_CartDeleteButton_name = "ic closepopup";

	String ProductionCheckoutButton_name = "CHECKOUT";
	String ProductionContinueButton_name = "CONTINUE";
	String ProductionCashOnDelivery_id = "com.zopperapp" + buildType + ":id/tv_payment_mode_cod";
	String CashOnDelievery_name = "CASH ON DELIVERY";
	String OlaMoneyIcon_name = "OLA MONEY";
	String ProductionPlaceOrder_id = "com.zopperapp" + buildType + ":id/tv_checkout";
	String ViewStore_id = "com.zopperapp" + buildType + ":id/tv_cart_view_store";
	String StoreTitle_id = "com.zopperapp" + buildType + ":id/tv_store_title";
	String StoreTitle_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIAStaticText[1]";

	String StoreLocality_id = "com.zopperapp" + buildType + ":id/tv_store_locality";
	String StoreLocality_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIAStaticText[1]";

	// Shipping Address Page

	String AddressPageFullName_id = "com.zopperapp.staging:id/et_full_name";
	String AddressPageEmail_id = "com.zopperapp.staging:id/et_email";
	String AddressPageContactNumber_id = "com.zopperapp.staging:id/et_contact";

	// Sign UP Page

	String Fullname_Name = "Full Name";
	String EmailID_Name = "E-mail ID";
	String Password_id = "com.zopperapp.dev:id/et_signup_password";
	String Sign_Up_button_name = "Sign Up";
	String signUp_id = "com.zopperapp.dev:id/tv_sign_up";
	String signUp_fullname_id = "com.zopperapp.dev:id/et_signup_name";
	String signUp_emailId_id = "com.zopperapp.dev:id/et_signup_email";
	String signUp_Contact_no_id = "com.zopperapp.dev:id/et_contact";
	String signUp_password_id = "com.zopperapp.dev:id/et_signup_password";
	String signUp_referral_id = "com.zopperapp.dev:id/et_referral_code";
	String signUp_button_id = "com.zopperapp.dev:id/button_sign_up";
	String SignUp_already_have_acc_id = "com.zopperapp.staging:id/tv_have_account";
	String Olamoney_id = "com.zopperapp:id/tv_payment_mode_ola";

	// OLA Page

	String OLADEBITCREDITCARDS_name = "DEBIT/CREDIT CARDS";
	String OLANETBANKING_name = "NET BANKING";
	String OLAAmount_id = "com.olacabs.customer:id/ola_total_amount_value";
	String OLABalance_id = "com.olacabs.customer:id/ola_use_balance";

	// My Account page
	String Myaccount_text = "My Account";
	String Logout_button_id = "com.zopperapp" + buildType + ":id/log_out";
	String MyAccountSearchIcon_xpath = "//android.widget.FrameLayout /android.widget.TextView[2]";
	String UserEmailtext_xpath= "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]";
	String MyProfileOrderLink_id = "com.zopperapp" + buildType + ":id/profile_order";
	String MyAccount_OrderMenu_Id = "com.zopperapp" + buildType + ":id/order_heading";
	String OrderID_id = "com.zopperapp" + buildType + ":id/tv_order_id";
	String MyAccountFavouritesButton_xpath = "//android.widget.RelativeLayout[@index=0]"; // android.widget.FrameLayout/android.widget.ScrollView/android.widget.ImageView[@index=2]";
	String MyAccountWarrantyButton_xpath = "//android.widget.RelativeLayout[@index=3]";
	String Logout_button_Prod_name= "Logout";
	String MyAccountAddProduct_id = "com.zopperapp" + buildType + ":id/tv_add_product";
	String MyAccountTabs = "com.zopperapp" + buildType + ":id/image_tab";
	String myAccount_FavouriteList_id = "com.zopperapp" + buildType + ":id/fav_heading";
	String myAccount_Warranty_name = "Warranty";
	String myAccount_LogOutPopupMessage_xpath = "//UIACollectionCell[@name='Logout']";
	String Back_Arrow_ClassName = "android.widget.ImageButton";
	String ProfileName_id = "com.zopperapp.staging:id/tv_drawer_signup_title";
	String MyAccountEmail_id = "com.zopperapp:id/name_email";

	// Add Products
	String AddProductsContacts_id = "com.zopperapp:id/et_add_product_contact";
	String AddProductsSelectProducts_id = "com.zopperapp:id/et_add_product_product";
	String AddProductsCategories_name = "LCD/LED/Plasma";
	String AddProductsSearchtextbox_id = "com.zopperapp:id/et_search_product";
	String AddProductsFirstProduct_id = "com.zopperapp:id/iv_warranty_product";
	String AddProductSelectOption_id = "com.zopperapp:id/tv_select";
	String AddProductSerialNumber_id = "com.zopperapp:id/et_add_product_serial_number";
	String AddProductPrice_id = "com.zopperapp:id/et_add_product_price";
	String AddProductDate_id = "com.zopperapp:id/tv_add_product_date";
	String AddProductsSet_name = "Set";
	String AddProductInvoice_id = "com.zopperapp:id/tv_add_product_invoice_action";
	String TakePhoto_id = "com.zopperapp:id/tv_add_product_invoice_action";
	String Uploadfile = "com.zopperapp:id/gallery";
	String AddProductSubmit_id = "com.zopperapp:id/submit_warrenty";
	String AddProductProductName_id = "com.zopperapp:id/tv_product_name";

	// Mobile and Tablets page
	String Android_phones_id = "com.zopperapp.staging:id/iv_popular_cat1";
	String iphone_id = "com.zopperapp.staging:id/iv_popular_cat2";
	String iPad_id = "com.zopperapp.dev:id/iv_popular_cat3";
	String Windows_phones_id = "com.zopperapp.dev:id/iv_popular_cat4";
	String Prod_Android_phones_id = "com.zopperapp:id/iv_popular_cat1";
	String MobileAndTablets_text = "Mobiles and Tablets";
	String MoreCategories_id = "com.zopperapp" + buildType + ":id/tv_other_categories_title";
	String PopularCategories_id = "com.zopperapp" + buildType + ":id/tv_popular_categories_title";
	String OtherCategores_id = "com.zopperapp" + buildType + ":id/tv_other_categories_title";
	String ProductionAndroid_phones_id = "com.zopperapp" + buildType + ":id/iv_popular_cat1";
	String Productioniphone_id = "com.zopperapp" + buildType + ":id/iv_popular_cat2";
	String ProductioniPad_id = "com.zopperapp:id/iv_popular_cat3";
	String ProductionWindows_phones_id = "com.zopperapp:id/iv_popular_cat4";
	String HeadphoneHeadset_text = "Headphone & Headset";
	String BackButton_name = "Back";

	// Home Appliances page
	String HomeAppliances_text = "Home Appliances";
	String STZWAC_name = "Air Conditioners";
	String STZWWashingMachine_name = "Washing Machines";
	String STZWReferigerator_name = "Refrigerators";

	// Tv and Video player page
	String tv_player_text = "TV & Video Player";

	// Android phones page
	String MyAccountFirstFavouriteProduct_id = "com.zopperapp.staging:id/iv_similar_product";
	String first_android_phone_xpath ="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]"; //"//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[2]";
	String second_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[2]/ android.widget.TextView";
	String third_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[3]/ android.widget.TextView";
	String fourth_android_phone_xpath = "//android.widget.FrameLayout/ android.support.v7.widget.RecyclerView/ android.widget.RelativeLayout[4]/ android.widget.TextView";
	String AndroidPhonesSortingButton_id = "com.zopperapp.staging:id/layout_product_sort";
	String PriceOfFirstProduct_id = "com.zopperapp.staging:id/tv_product_listing_price";
	String AndroidPhonesSortingButton_name = "Sort By";
	String Android_Phone_text = "Android Phones";
	String AndroidPhoneGoAhead_id = "com.zopperapp:id/tv_smart_cat_go_ahead";
	String AndroidPhonesShuffle_id = "com.zopperapp:id/shuffle";
	String AndroidPhonesShuffle_xpath = "//android.widget.FrameLayout /android.widget.ImageView[2]";
	String Filter_name = "  Filter";
	String FilerApplybutton_name = "Apply";
	String AndroidPhones_name = "Android Phones";
	String PowerBank_name = "Tablets";
	String TabletsPage_name = "Tablets ⌄";
	String Tablets_name = "Power Bank";
	String ProductionAndroidPhonesSortingButton_name = "  Sort By";
	String ProductionPriceOfFirstProduct_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[4]";
	String ProductionPriceOfFirstProduct2_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAStaticText[4]";
	// Calling tablet page
	String CallingTabletTitle_text = "Tablets";
	String CallingTbalets_text = "Tablets";

	// Filter
	String IntexFilter_name = "Intex";
	String ClearSelected_name = "Clear Selected";
	String ClearAll_name = "Clear All";

	// Forget Password Page
	String Forgot_Email_xpath = "//UIATextField[@valid='true']";
	String Forgot_Submit_name = "SUBMIT";

	// Product details page

	String BuyNow_button_text = "Buy Now";
	String BuyNow_Button_Text_Upper = "BUY NOW";
	String BuyNow_id = "com.zopperapp.staging:id/tv_buy";
	String Product_details_page_text = "Product Details";
	String SecondViewDetailsLink_xpath = "//android.widget.FrameLayout /android.widget.ScrollView /android.widget.RelativeLayout[1] /android.widget.TextView[1]";
	String SamsungProductSimilarProductIssue_text = "Samsung Galaxy Grand Neo 8GB Black";
	String SamsungProductSimilarProductIssue_text1 = "Samsung Z1 Dual Sim Red";
	String EurekaForbesEasyCleanVacuumCleaner_text = "Eureka Forbes Easy Clean Vacuum Cleaner";
	String FirstSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_first";
	String SecondSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_second";
	String ThirdSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_third";
	String FourthSimilarProduct_id = "com.zopperapp.dev:id/iv_product_image_fourth";
	String FirstProductSimilarName_id = "com.zopperapp" + buildType + ":id/tv_first_product_name";
	String SecondProductSimilarName_id = "com.zopperapp" + buildType + ":id/tv_second_product_name";
	String ThirdProductSimilarName_id = "com.zopperapp" + buildType + ":id/tv_third_product_name";
	String FourthProductSimilarName_id = "com.zopperapp" + buildType + ":id/tv_fourth_product_name";
	String ProductDetailsBackbutton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[1]";
	String ProductDetailsBigBuyNow_id = "com.zopperapp:id/tv_item_buy";
	String ProductDetailsSmallBuyNow_id = "com.zopperapp:id/tv_buy_ab";
	String FirstSimilarProductPagination_id = "com.zopperapp.dev:id/tv_product_title";
	String GetPricesButton_id = "com.zopperapp.dev:id/tv_get_prices";
	String BuyNow_xpath = "//android.widget.FrameLayout /android.widget.TextView[10]";
	String SubmitReview_id = "com.zopperapp" + buildType + ":id/tv_product_reviews_all";
	String ProductionProductTitleOnProductDetails_id = "com.zopperapp" + buildType + ":id/tv_product_title";
	String ProductionProductTitle_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]";
	String ProductionGetPricesButton_id = "com.zopperapp" + buildType + ":id/tv_get_prices";
	String ProductImage_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]";
	String EnlargedImage_BuyNow_Id="com.zopperapp" + buildType + ":id/tv_gallery_buy";
	String ProductLargeImage_id = "com.zopperapp" + buildType + ":id/pager_product_gallery";
	String OperatingSystem_name = "Operating System";
	String ProductDetailsPageFirstViewAll_id = "com.zopperapp" + buildType + ":id/tv_product_features_view_all";
	String ProductDetailsPageFirstViewAll_Text = "VIEW ALL SPECIFICATIONS";
	String BookmarkButton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]/preceding::UIAButton[position()=1]";//"//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/*[5]";

	String RefrigratorType_text = "Refrigerator Type";
	String type_name = "Warranty Valid For";
	String ProductPrice_id = "com.zopperapp" + buildType + ":id/tv_product_price";
	String SimilarProduct_id = "com.zopperapp" + buildType + ":id/iv_similar_product";
	String ImageCloseButton_id = "com.zopperapp" + buildType + ":id/ib_product_gallery_close";
	String ZSP_Price_xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.widget.TextView[@index=4]";
	String SP_Price_xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.widget.TextView[@index=7]";
	String MRP_Price_xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.widget.TextView[@index=10]";
	String Product_Store_Name_id = "com.zopperapp" + buildType + ":id/tv_product_store_title";
	String View_More_Sellers_Id = "com.zopperapp" + buildType + ":id/tv_product_store_view_all";
	String More_Sellers_Store_Name_Id = "com.zopperapp" + buildType + ":id/tv_item_product_store_title";
	String ProductPriceOnPrdctDetails_id = "com.zopperapp" + buildType + ":id/tv_product_price";
	String ProductDetailsBuyNow_xpath = "BUY NOW";//UIAApplication[1]/UIAWindow[1]/UIAButton[5]";
	String ProductDescription_xpath = "//UIAStaticText[@name='Product Description']";
	String ProductDescriptionReadMore_name = "Read More";
	String ProductDescriptiontext_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[1]";
	String CartPlus_name = "+";
	String CartItemCount_xpath ="//UIAStaticText[@name='Quantity: 5']";//"//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[5]";

	// Product Features
	String GeneralFeatureSet_text = "GENERAL FEATURE SET";
	String ProductFeature_Text = "Product Features";

	// Product Reviews Page
	String BackButton_class = "android.widget.ImageButton";
	String ProductionProductReviewsPencilIcon_id = "com.zopperapp" + buildType + ":id/menu_write_review";
	String ProductReviewsPencilIcon_id = "com.zopperapp.staging:id/menu_write_review";
	String ProductReviewsAddedTitle_id = "com.zopperapp.dev:id/review_title";
	String ProductReviewsBackbutton_class = "android.widget.ImageButton";
	String WriteAReview_Id = "com.zopperapp.staging:id/tv_write_review";

	// Review Product Page
	String ReviewProductFiveStarRating_text = "5";
	String ReviewProductText = "Product Reviews";
	String ReviewProductSubmitButton = "SUBMIT";
	String ReviewProductSubmitButton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[1]/UIAButton[6]";
	String ReviewProductTitle_ID = "com.zopperapp.staging:id/review_title";
	String ReviewProductDescription_ID = "com.zopperapp.staging:id/review_content";
	String ReadAllReviews_Id = "com.zopperapp.staging:id/tv_product_reviews_all";
	String ReviewText_Id = "com.zopperapp.staging:id/review_text";
	String ProductionReviewProductTitle_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIATextView[1]";
	String ProductionReviewProductDescription_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[6]/UIATextView[1]";
    
	// Search page
	String Search_product_text = "Search Product";
	String SuggestedProductForSubmitReviewScenario = "//android.widget.FrameLayout /android.widget.ListView /android.widget.LinearLayout /android.widget.TextView";
	String Search_list_view = "android.widget.ListView";
	String SearchSuggestedFirstProduct_xpath = "//android.widget.FrameLayout /android.widget.ListView /android.widget.LinearLayout /android.widget.TextView";
	String ListView_class = "android.widget.ListView";
	String TextView_class = "android.widget.TextView";
	
    String SearchList_id = "com.zopperapp" + buildType + ":id/lv_auto_suggest";
    String SearchLinearLayout_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/*";

	// Select Location
	String DetectAutomatically_name = "Detect Automatically";
	String DetectAutomaticallyDisabled_popup_cancelButton_id = "android:id/button2";
	String SelectLocation_text = "Select Location";
	String DelhiLocation_xpath="Delhi"; //"//UIATableCell[@name='Delhi']";
	String BangaloreLocation_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[5]";
	String BTMLocation_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]";
	String BTMlocationtext_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]";
	String AyaNagar_xpath = "Alaknanda";
	String AbsentCity_name = "Don't see your city in the list ?";
	String OopsPrompt_id = "android" + buildType + ":id/alertTitle";
	String Citylocality_id = "com.zopperapp" + buildType + ":id/tv_location_child_name";
	String EmailIdTextBox_Id = "com.zopperapp" + buildType + ":id/et_email";
	String YourCityTextBox_Id = "com.zopperapp" + buildType + ":id/et_city";
	String OkButton_Id = "android:id/button1";
	String Location_CitiesNames_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/*";
	String Location_Sub_City_Id="com.zopperapp" + buildType + ":id/tv_locality_name";
	String DelhiLocation_text = "Delhi";
	String DelhiSubLocation_AnandLok_text = "Anand Lok";
	String LocatioCity_id = "com.zopperapp" + buildType + ":id/tv_location_parent_name";
	String Oops_name = "OOPS !";

	// Excel path
	String Path_TestData = "D:\\Zopper\\ConsumerAppBugRegression\\src\\TestData\\";
	String File_TestData = "TestData.xlsx";

	// Prompt

	String DeleteCartItemPrompt_id = "android:id/button1";
	String LocationChangeCartPrompt_name = "OK";

	// Overflow menu
	String OFMyOrders_name = "My Orders";
	String MyProfileText = "My Profile";
	String MyProfile_name = "My Profile";
	String ShareApp_name = "Share App";
	String ContactUs_name = "Contact us";
	String FAQ_name = "FAQ's";

	// Order Success page

	String ProductionShopMore_id = "com.zopperapp" + buildType + ":id/tv_payment_next_step";
	String ShopMore_id = "com.zopperapp.dev:id/tv_payment_next_step";

	// Constant other than app

	String WhatsApp_name = "WhatsApp";
	String FaceBook_Name = "Facebook";
	String JustOnceButton_id = "android:id/button1";

	// Sort By prompt
	String LTH = "Prices: Low to High";
	String HTL = "Prices: High to Low";
	String Relevance_text = "●  Relevance";

	// Android Settings

	String Android_Location_Setting_Id = "com.android.systemui:id/settings_button";

	// Verify Order Page
	String VerifyOrderPageOrderId_id = "com.zopperapp" + buildType + ":id/tv_order_status_order_id";

	// Contact us Page
	String SelectNatureofFeedback_name = "What can we help you with?";
	String PaymentRelated_name = "Payment Related";
	String HowAreYouFeeling_name = "How are you feeling?";
	String Happy_name = "Happy";
	String Product_Radio_Text="Product";
	String Fullname_xpath = "//UIATextField[@value='Full Name']";
	String EmailID_xpath = "//UIATextField[@value='Contact Email ID']";
	String WriteAfeedback_xpath = "//UIATextField[@value='Write a Feedback']";
	String SubmitButton_name = "Submit";
	String OkButton_name = "OK";
	String wecarelink_xpath = "//UIAButton[@label='wecare@zopper.com']";
	String NewMessage_xpath = "//UIAStaticText[@name='New Message']";

	// warrenty scanerio

	String AddWarrantyPageHeader_xpath = "//android.widget.FrameLayout/android.widget.TextView[@index=1]";
	String Add_Product_name = "+ Add a Product";
	String Add_Product_Name_name = "Enter Your Product Name";
	String Warranty_Product_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[1]";
	String Select_name = "Select";
	String Camera_name = "ic take photo";
	String CameraButton_name = "PhotoCapture";
	String CameraUsePhoto_name = "Use Photo";
	String Next_Add_Warrenty_One_name = "NEXT";
	String Warranty_Valid_For_name = "Warranty Valid For";
	String Warranty_Purchase_Date_name = "Purchase Date";
	String WarrantyValidFor_date_xpath = "//android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index=1]/android.widget.TextView[@index=2]";
	String Next_Add_Warrenty_Two_id = "NEXT";
	String EditWarrantySubmitButton_Id = "com.zopperapp" + buildType + ":id/next_add_warrenty_three";
	String Warrant_Product_name = "CLAIM";
	String ClaimWarrantyPageClaimButton_name = "Claim";
	//"//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]";
	String Warranty_Product_Category_name = "Washing Machine";
	String Warranty_Date_Done_name = "DONE";
	String WarrantyListFirstProduct_xpath = "//android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index=1]";
	String WarrantyReason_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIATextView[1]";
	String WarrantyContactNo_id = "com.zopperapp" + buildType + ":id/et_contact";
	String WarrantyClaimButton_id = "com.zopperapp" + buildType + ":id/w_claim";
	String WarrantyRequestConfirmationPage_text = "BROWSE PRODUCTS";
	String WarrantyClaimID_xpath = "//android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index=1]/"
			+ "android.widget.TextView[@index=3]";
	String WarrantyClaimID_text = "Warranty claim id :";
	String WarrantyViewInvoice_xpath = "//android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[@index=1]/"
			+ "android.widget.TextView[@index=5]";

	String ImageShareButton_Id = "com.zopperapp" + buildType + ":id/tv_share";

	String ImageShareButton_Text = "Share";

	String ClaimWarrantyPageHeader_xpath = "//android.widget.FrameLayout/android.widget.TextView[@index=1]";
	String WarrantyEditPageDate_id = "com.zopperapp" + buildType + ":id/ed_warranty_duration";
	String WarrantyDate_text = "2 years";
	String EditPageContactNo_Id = "com.zopperapp" + buildType + ":id/tv_add_user_contact";
	String WarrantyPage_Valid_For_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]";
	String Claim_Warranty_Header_Text = "Claim";
	String Warranty_ClaimId_Id = "com.zopperapp" + buildType + ":id/tv_claim_id_value";
	String Warranty_ClaimUnderProcess_Id = "com.zopperapp:" + buildType + "id/tv_claim_status";
	String Warranty_ClaimStatus_name = "Claim Under Process";
	String View_Warranty_Invoice_Id = "com.zopperapp" + buildType + ":id/tv_show_invoice";
	String Add_Product_Header_Text = "Add Product";
	String ClaimWarrantyPencil_id = "com.zopperapp" + buildType + ":id/w_address_edit";

	// Play store

	String Play_Store_SignIn_xpath = "//a[contains(text(),'Sign in')]";
	String Play_Store_AndroidApp_Download_id = "and-app";
	String Play_Store_Email_id = "Email";
	String Play_Store_Next_id = "next";
	String Play_Store_Password_id = "Passwd";
	String Play_Store_Login_id = "signIn";
	String Play_Store_Installed_xpath = "//span[@class='consume-label']/button[contains(text(),'Installed')]";
	String Play_Store_DropDown_xpath = ".//*[@id='device-selector-container']/div/button";
	String Play_Store_Device_xpath = "//button[contains(.,'Airtel Samsung SM-N750')]";
	String Play_Store_InstallButton_id = "purchase-ok-button";
	String Play_Store_CongratulationMessage_xpath = "//div[@class='purchase-complete-container']//div[contains(text(),'Congratulations')]";
	String Play_Store_CongratulationMessage_Ok_id = "close-dialog-button";

	// Mobile Notification

	String Mobile_Notification_Class = "android.widget.TextView";

	// FAQs page
	String FAQsList_id = "com.zopperapp:id/wv_smart_cat";
	String WarrantyFAQsHeaders_xpath = "//android.widget.FrameLayout/android.view.View/android.view.View[@index=2]";
	String WarrantyFAQsHeader_xpath = "//UIAStaticText[@name='Warranty FAQ']";

	// Payment Mode
	String AllPaymentMode_id = "com.zopperapp" + buildType + ":id/tv_payment_mode_text";
	String PaytmpageCancel_name = "Cancel";
	String PaymentPaytm_name = "Paytm";

	// Banners
	String Banners_id = "com.zopperapp" + buildType + ":id/daimajia_slider_image";
	String VadodaraCity = "Vadodara";
	String Akotalocation = "Akota";

	// More Sellers
	String MoreSellersBuyNow_id = "com.zopperapp" + buildType + ":id/tv_item_buy";
	String MoreSellersBuyNow_Text = "BUY NOW";

	// Branded Stores
	String BrandedStorestext_id = "com.zopperapp" + buildType + ":id/branded_store_heading";
	String BrandedStoresViewPricelink_id = "com.zopperapp" + buildType + ":id/branded_view_store";
	String BrandedStoresProductTitle_id = "com.zopperapp" + buildType + ":id/product_title";
	String BrandedStoresProductImage_id = "com.zopperapp" + buildType + ":id/product_image";
	String BrandedStoresProductPrice_id = "com.zopperapp" + buildType + ":id/tv_product_price";
	String BrandedStoresStoreAddress_id = "com.zopperapp" + buildType + ":id/branded_tv_product_store_distance";
	String BrandedStoresCloseOption_id = "com.zopperapp" + buildType + ":id/ib_product_gallery_close";
	String BrandedStoresBuyNow_id = "com.zopperapp" + buildType + ":id/tv_buy";
	String BrandedStoresLogo_id = "com.zopperapp" + buildType + ":id/branded_store_logo";
	String BrandedStoresLocationtext_id = "com.zopperapp" + buildType + ":id/branded_tv_product_store_address";
	String BrandedStoresdistancevalue_id = "com.zopperapp" + buildType + ":id/branded_tv_product_store_distance";

	// AutoDetectLocationToast

	String AutoLocationToast_id = "com.zopperapp" + buildType + ":id/snackbar_text";
	String AutoLocationChangetext_id = "com.zopperapp" + buildType + ":id/snackbar_action";
	String AutolocationChangetext_name = "CHANGE";

	// Orderdetails

	String OrderPlaced_id = "com.zopperapp" + buildType + ":id/status_text";
	
	//Camera
	String LollipopCameraSaveButton_id = "com.sec.android.app.camera:id/save";
	
	//Gmail Web Scenrios
    String GMail_User_Id="Email";
    String Gmail_Next_Id="next";
    String Gmail_Password_Id="Passwd";
    String Gmail_SignIn_Button_Id="signIn";
    String Gmail_MailList_User_Id="//b[contains(text(),'Zopper account password reset')]";
    String Gmail_ChangePassword_LinkText="//a[contains(.,'Reset Password')]";
//a[@rel='noreferrer'];
    		//"https://api.zopper.com/forgot-password";
    String Gmail_NewPassword_Id="password";
    String Gmail_ConfirmPassword_Id="confirm_password";
    String Gmail_ChangePWDButton="changePWD";
    String Gmail_PwdChangeSuccessMsg_Id="successMessage";
    String Gmail_Signout_Xpath="//div[@id='gb']/div/div/div[2]/div[4]/div/a/span";
    String Gmail_SignOut_Button_Link="Sign out";
}