package com.stocklift.request;

import com.stocklift.domain.OrderType;
import lombok.Data;

@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
