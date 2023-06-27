package com.supportPortal.site.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432000000; // 5days in milliseconds
    public static final String TOKEN_HEADER = "Bearer";
    public static final String JWS_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String GET_ARRAY_LLC = "Get Arrays, LLC";
    public static final String GET_ARRAY_ADMINISTRATION = "User Management Portal";
    public static final String  AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to login to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You don't have the permission to access this page";
    public static final String OPTION_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login","/user/registration","/user/resetpassword/**","/user/image/**"};
}
// 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