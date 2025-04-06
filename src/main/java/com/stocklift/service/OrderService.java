package com.stocklift.service;

import com.stocklift.domain.OrderType;
import com.stocklift.modal.Coin;
import com.stocklift.modal.Order;
import com.stocklift.modal.OrderItem;
import com.stocklift.modal.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrdersOfUser(Long userId,OrderType orderType,String assetSymbol);

    Order processOrder(Coin coin, double quantity,OrderType orderType,User user) throws Exception;
}
