package com.stocklift.controller;

import com.razorpay.RazorpayException;
import com.stocklift.domain.PaymentMethod;
import com.stocklift.modal.PaymentOrder;
import com.stocklift.modal.User;
import com.stocklift.response.PaymentResponse;
import com.stocklift.service.PaymentService;
import com.stocklift.service.UserService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    private UserService userService;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/api/payment/PaymentMethod1/amount/amount")
    public ResponseEntity<PaymentResponse> paymentHandler(
            @PathVariable PaymentMethod paymentMethod,
            @PathVariable Long amount,
            @RequestHeader("Authorization") String jwt) throws
            Exception,
            RazorpayException,
            StripeException {

        User user = userService.findUserProfileByJwt(jwt);


         PaymentResponse paymentResponse;

         PaymentOrder order= paymentService.createOrder(user, amount,paymentMethod);

        if(paymentMethod.equals(PaymentMethod.RAZORPAY)){
             paymentResponse=paymentService.createRazorpayPaymentLing(user,amount);
         }
        else {
            paymentResponse=paymentService.createStripePaymentLing(user,amount, order.getId());
        }
        return new ResponseEntity<>(paymentResponse, HttpStatus.CREATED);
    }
}
