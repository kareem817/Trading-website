package com.stocklift.service;

import com.stocklift.modal.User;
import com.stocklift.modal.Withdrawal;

import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(long amount, User user);

    Withdrawal proceedWithdrawal(long withdrawalId, boolean accept) throws Exception;

    List<Withdrawal> getUsersWithdrawalHistory(User user);

    List<Withdrawal> getAllWithdrawalRequest();
}
