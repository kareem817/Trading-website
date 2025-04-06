package com.stocklift.service;

import com.razorpay.RazorpayException;
import com.stocklift.domain.PaymentMethod;
import com.stocklift.modal.PaymentOrder;
import com.stocklift.modal.User;
import com.stocklift.response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
    PaymentOrder createOrder(User user, Long amount,
                             PaymentMethod paymentMethod);
    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder(PaymentOrder paymentOrder, String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLing(User user, Long amount) throws RazorpayException;

    PaymentResponse createStripePaymentLing(User user, Long amount,Long orderId) throws StripeException;



}
