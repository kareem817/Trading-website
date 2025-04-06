package com.stocklift.service;

import com.stocklift.domain.VerificationType;
import com.stocklift.modal.User;
import com.stocklift.modal.VerificationCode;

public interface VerificationCodeService {
    VerificationCode sendVerificationCode(User user, VerificationType verificationType);

    VerificationCode getVerificationCodeById(Long id) throws Exception;

    VerificationCode getVerificationCodeByUser(Long userId);



    void deleteVerificationCodeById(VerificationCode verificationCode);
}
