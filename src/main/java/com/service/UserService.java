package com.service;

import com.common.payload.BaseResponse;
import com.module.user.payload.AuthRequest;
import com.module.user.payload.LoginRequest;

public interface UserService {
    BaseResponse login(LoginRequest loginRequest);

    BaseResponse loginToken(LoginRequest loginRequest);

    String forgotPassword(String email);

    String resetPassword(String email, String password);

}
