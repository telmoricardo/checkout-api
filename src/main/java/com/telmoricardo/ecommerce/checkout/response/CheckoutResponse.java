package com.telmoricardo.ecommerce.checkout.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CheckoutResponse {
    private String code;
}
