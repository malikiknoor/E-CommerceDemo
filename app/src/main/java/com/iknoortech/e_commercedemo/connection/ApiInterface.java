package com.iknoortech.e_commercedemo.connection;

import com.iknoortech.e_commercedemo.model.cart.CartPojo;
import com.iknoortech.e_commercedemo.model.cartUpdate.CartUpdatePojo;
import com.iknoortech.e_commercedemo.model.cityList.CityListPojo;
import com.iknoortech.e_commercedemo.model.home.HomePojo;
import com.iknoortech.e_commercedemo.model.invoice.InvoicePojo;
import com.iknoortech.e_commercedemo.model.login.LoginPojo;
import com.iknoortech.e_commercedemo.model.orderDetail.MyOrderDetailPojo;
import com.iknoortech.e_commercedemo.model.orderList.MyOrderPojo;
import com.iknoortech.e_commercedemo.model.otp.OtpPojo;
import com.iknoortech.e_commercedemo.model.paymentRequest.PaymentRequestPojo;
import com.iknoortech.e_commercedemo.model.productData.ProductDataPojo;
import com.iknoortech.e_commercedemo.model.productDetail.ProductDetailPojo;
import com.iknoortech.e_commercedemo.model.profile.ProfilePojo;
import com.iknoortech.e_commercedemo.model.search.SearchCategoryPojo;
import com.iknoortech.e_commercedemo.model.search.SearchProductPojo;
import com.iknoortech.e_commercedemo.model.shippingAddress.ShippingAddressPojo;
import com.iknoortech.e_commercedemo.model.stateList.StateListPojo;
import com.iknoortech.e_commercedemo.model.wishList.WishListPojo;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    /*Login user*/
    @POST("login.php")
    Call<LoginPojo> loginUser(@Query("data") JSONObject jsonObject);

    /*Social login user*/
    @POST("social-check.php")
    Call<LoginPojo> checkSocialUser(@Query("data") JSONObject jsonObject);

    /*Register user*/
    @POST("sign-up.php")
    Call<LoginPojo> registerUser(@Query("data") JSONObject jsonObject);

    /*forgot password*/
    @FormUrlEncoded
    @POST("forgotpassword.php")
    Call<OtpPojo> sendForgotOtp(@Field("EmailMobile") String Mobile);

    /*Mobile verification*/
    @FormUrlEncoded
    @POST("OtpUser.php")
    Call<OtpPojo> sendVerificationOtp(@Field("Mobile") String Mobile);

    /*update password after forgot password this api will call for update user new password*/
    @POST("updatePassword.php")
    Call<LoginPojo> updatePassword(@Query("data") JSONObject jsonObject);

    /*Home content*/
    @POST("HomeData.php")
    Call<HomePojo> getHomeContent();

    /*product data*/
    @FormUrlEncoded
    @POST("ProductData.php")
    Call<ProductDataPojo> getProductData(@Field("CateID") String CateID, @Field("UserId") String UserId);

    /*Product Detail Page*/
    @FormUrlEncoded
    @POST("ProductDetail.php")
    Call<ProductDetailPojo> getProductDetail(@Field("UserId") String UserId, @Field("ProductId") String ProductId);

    /*Product Add or Delete in cart*/
    @FormUrlEncoded
    @POST("AddToCart.php")
    Call<CartUpdatePojo> updateCart(@Field("UserId") String UserId, @Field("ProductId") String ProductId,
                                    @Field("ProductQuantity") String ProductQuantity, @Field("Type") String Type);

    /*wishlist add or delete*/
    @FormUrlEncoded
    @POST("WishList.php")
    Call<OtpPojo> updateWishList(@Field("UserId") String UserId, @Field("ProductId") String ProductId,
                                 @Field("Type") String Type);

    /*get wishList*/
    @FormUrlEncoded
    @POST("wishlistview.php")
    Call<WishListPojo> getWishList(@Field("UserId") String UserId);

    /*get cart list*/
    @FormUrlEncoded
    @POST("GetCartDetail.php")
    Call<CartPojo> getCartData(@Field("UserID") String UserId);

    /*get user profile*/
    @FormUrlEncoded
    @POST("UserDetail.php")
    Call<ProfilePojo> getUserProfile(@Field("UserID") String UserID);

    /*Chnage password*/
    @POST("changePassword.php")
    Call<ProfilePojo> changePassword(@Query("data") JSONObject jsonObject);

    /*get state list*/
    @POST("StateListing.php")
    Call<StateListPojo> getStateListFromService();

    /*get city list*/
    @FormUrlEncoded
    @POST("CityListing.php")
    Call<CityListPojo> getCityListFromService(@Field("state_id") String state_id);

    /*update user profile*/
    @POST("UpdateProfile.php")
    Call<ProfilePojo> updateUserProfile(@Query("data") JSONObject jsonObject);

    /*Add new shipping address*/
    @POST("newAddress.php")
    Call<ShippingAddressPojo> addNewShippingAddress(@Query("data") JSONObject jsonObject);

    /*shipping address listing*/
    @FormUrlEncoded
    @POST("addListing.php")
    Call<ShippingAddressPojo> getAllShippingAddress(@Field("UserId") String UserId);

    /*edit shipping address*/
    @POST("editAddress.php")
    Call<ShippingAddressPojo> editShippingAddress(@Query("data") JSONObject jsonObject);

    /*delete shipping address*/
    @POST("deleteAddress.php")
    Call<ShippingAddressPojo> deleteShippingAddress(@Query("data") JSONObject jsonObject);

    /*get search category list*/
    @FormUrlEncoded
    @POST("SearchProduct.php")
    Call<SearchCategoryPojo> getSearchCategoryList(@Field("searchtype") String searchtype);

    /*get search product list*/
    @FormUrlEncoded
    @POST("SearchProduct.php")
    Call<SearchProductPojo> getSearchProductList(@Field("CatId") String CatId, @Field("searchtype") String searchtype);

    /*get My Order List*/
    @FormUrlEncoded
    @POST("orderList.php")
    Call<MyOrderPojo> getOrderList(@Field("UserID") String UserID);

    /*get Order information*/
    @FormUrlEncoded
    @POST("orderDetail.php")
    Call<MyOrderDetailPojo> getOrderDetails(@Field("order_id") String order_id);

    /*send invoice on mail*/
    @FormUrlEncoded
    @POST("emailInvoice.php")
    Call<InvoicePojo> sendInvoice(@Field("order_id") String order_id, @Field("userEmail") String userEmail);

    /*create access token for payment*/
    @POST("getAcessAuthToken.php")


    Call<PaymentRequestPojo> createAccessToken();

    /*create payment id*/
    @FormUrlEncoded
    @POST("payment.php")
    Call<PaymentRequestPojo> createIdForPayment(@Field("amount") String amount, @Field("name") String name, @Field("email") String email, @Field("address_id") String address_id,
                                                @Field("UserID") String UserID, @Field("access_token") String access_token, @Field("phone") String phone);

    /*create payment order id*/
    @FormUrlEncoded
    @POST("payment_request.php")
    Call<PaymentRequestPojo> createOrderId(@Field("order_id") String order_id, @Field("access_token") String access_token);

    /*create payment order id*/
    @FormUrlEncoded
    @POST("OrderPunch.php")
    Call<InvoicePojo> punchOrder(@Field("UserId") String UserId, @Field("AddressId") String AddressId, @Field("TransactionID") String TransactionID,
                                 @Field("PaymentMethod") String PaymentMethod, @Field("OrderTotalAmount") String OrderTotalAmount);

    /*change default address*/
    @FormUrlEncoded
    @POST("Defaultaddress.php")
    Call<InvoicePojo> changeDefaultAddress(@Field("UserID") String UserID, @Field("AddressId") String AddressId);

}
