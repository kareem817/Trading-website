package com.stocklift.service;

import com.stocklift.domain.VerificationType;
import com.stocklift.modal.ForgotPasswordToken;
import com.stocklift.modal.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user,
                                    String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);
}
