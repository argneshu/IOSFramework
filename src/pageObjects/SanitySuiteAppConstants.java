package pageObjects;

public interface SanitySuiteAppConstants {

//	String buildType = ".staging";
	String buildType = "";
	String MyAccountFirstFavouriteProductName_id = "com.zopperapp" + buildType + ":id/tv_similar_product_name";
	String Google_SignInId = "com.zopperapp" + buildType + ":id/login_button_google";
	String GoooglePlus_SignInButton_name = "ic gplus";
	String NavDrawer_Login_button_name = "Login";
	String NavDrawer_Login_Title_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]";
	String Lets_Go_Shopping_Id = "com.zopperapp" + buildType + ":id/tv_boarding_page_done";
	String Home_Menu_Id = "com.zopperapp" + buildType + ":id/tv_drawer_list_row_title";
	String Android_phones_id = "com.zopperapp" + buildType + ":id/iv_popular_cat1";
	String Cart_xpath = " //UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]";
	String MyAccountFirstFavouriteProduct_id = "com.zopperapp" + buildType + ":id/iv_similar_product";
	String MyAccountTabsParent_class = "android.widget.ScrollView";
	String MyAccountTabsChilld_class = "android.widget.RelativeLayout";
	String NavDrawerCategories_id = "com.zopperapp" + buildType + ":id/tv_drawer_list_row_title";
	String NavDrawerMobilesAndTablets_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]";
	String SignUp_FullName_Edit_Id = "com.zopperapp" + buildType + ":id/et_signup_name";
	String SignUp_Email_Edit_Id = "com.zopperapp" + buildType + ":id/et_signup_email";
	String SignUp_ContactNo_Edit_Id = "com.zopperapp" + buildType + ":id/et_contact";
	String SignUp_Password_Edit_Id = "com.zopperapp" + buildType + ":id/et_signup_password";
	String SignUp_RefferalCode_Edit_Id = "com.zopperapp" + buildType + ":id/et_referral_code";
	String SignUp_SignUp_Button_Id = "com.zopperapp" + buildType + ":id/button_sign_up";
	String OTP_PopUp_Edit_Id = "com.zopperapp" + buildType + ":id/number_otp";
	String OTP_PopUp_Submit_Button_Id = "com.zopperapp" + buildType + ":id/generate_otp";
	String OTP_OTP_Edit_Id = "com.zopperapp" + buildType + ":id/enter_otp";
	String OTP_Verify_Button_Id = "com.zopperapp" + buildType + ":id/verify_otp";
	String Login_LoggedIn_User_Id = "com.zopperapp" + buildType + ":id/name_profile";
	String Shipping_FullName_Id = "com.zopperapp" + buildType + ":id/et_full_name";
	String Shipping_Address_Id = "com.zopperapp" + buildType + ":id/et_address";
	String Shipping_Pincode_Id = "com.zopperapp" + buildType + ":id/et_address_pincode";
	String Shipping_SaveButton_name = "Save";
	String FresdeskUsername_id = "user_session_email";
	String FreshdsekPassword_id = "user_session_password";
	String FreshdeskButton_xpath = "//button[contains(.,'Login')]";
	String zoppertest_link = "Argneshu99";
	String MyProfile_Wallent_Amount_Id = "com.zopperapp" + buildType + ":id/wallet_count";
	String AllPaymentMode_id = "com.zopperapp" + buildType + ":id/tv_payment_mode_text";
	String Product_Price_id = "com.zopperapp" + buildType + ":id/tv_product_price";
	String ProductList_Product_Id = "com.zopperapp" + buildType + ":id/tv_similar_product_name";
	String ViewOrder_id = "com.zopperapp" + buildType + ":id/tv_view_order";
	String OrderStatus_id = "com.zopperapp" + buildType + ":id/tv_product_item_status";
	String MyAccount_Wallet_Id = "com.zopperapp" + buildType + ":id/wallet_heading";
	String Wallet_RefferalAmount_Id = "com.zopperapp" + buildType + ":id/tv_referral_amount";
	String Wallet_Refferal_Date_Id = "com.zopperapp" + buildType + ":id/tv_conversion_date";
	
	//fake caller
	
	String Caller_Name_Id="com.popularapp.fakecall:id/name";
	String Caller_Number_Id="com.popularapp.fakecall:id/number";
	String Caller_SaveButton_Id="com.popularapp.fakecall:id/save";
	String Caller_TimeSet_Text="Set time";
	String Caller_TimeInMinutes_Text="30 seconds later";
	
	//Wallet
	 String Wallet_Layout_Id="com.zopperapp" + buildType + ":id/rv_wallet";
     String Wallet_Relative_Layout_Class="android.widget.RelativeLayout";
     String Wallet_Card_Title_Id="com.zopperapp" + buildType + ":id/tv_wallet_card_title";
     String Wallet_ValidityDate_Id="com.zopperapp" + buildType + ":id/tv_validity_date";
     
     //Homepage
     
     String LFRStore_id = "com.zopperapp"+ buildType+":id/cat_tile";
     String PartnersStorestext_name = "Our Partner Chain Stores";
     String HomeIcon_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[1]";
     String SelectedLocation_xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIAButton[2]";
     String SearchButtontextbox_xpath = "//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[2]/UIASearchBar[1]";
     String HomeSearchButton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]";
     String SearchHomepagetextbox_name = "Search from trusted local stores";
     String MyAccountbutton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[4]";
     String Cartbutton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]";
     
	
     //OLA
     
     String OlaNavDrawer = "com.olacabs.customer:id/button_navigation_drawer";
     String OlaWalletMoney = "com.olacabs.customer:id/item_value";
     String UtilizeOlaWalletMoney = "com.olacabs.customer:id/ola_use_balance";
     
     //Shopping Cart
     String CloseButton_name = "close";
     
     //Android Phone page
     
     String AndroidPhoneslist_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/*";
     
     //facebook
     String FacebookOkButton_xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]";
     
     //peoplechoice
     String PeopleChoice_name = "People's Choice";
     
     //myaccount page
     String MyAccountTitle_name = "My Account";
     String FavouritesButton_xpath = "//UIATableCell[starts-with(@name,'Favourites')]";
     
     //ProductDetails
     String FeatureButton_name = "Features";
     String ReviewButton_name = "Reviews";
     String Warrantytext = "WARRANTY";
     String WriteaReview_name = "Write a Review";
     String StoresButton_name = "Stores";
     
     //ReviewProduct
     String RatingStar_xpath = "//UIAStaticText[@name='Rate this Product']/following-sibling::UIAButton[5]";
     String Title_xpath = "//UIATextField[@value='Review Title']";
     String Description_xpath = "//UIATextView[@value='How did you like the product']";
     
     //Login Page
     String LoginCloseButton_name = "ic close blue";
     
     //PowerBank listing
     String PowerBankFirstproduct_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]";
     String PowerBankSecondtproduct_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]";
     String PowerBankThirdproduct_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]";
     String PowerBankFourthproduct_xpath = "//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[4]";
     
     //SearchKeyboard
     String SearchButton_name = "Search";

     


}
