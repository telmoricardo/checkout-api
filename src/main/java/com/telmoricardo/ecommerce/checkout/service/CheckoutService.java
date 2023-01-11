package com.telmoricardo.ecommerce.checkout.service;

import com.telmoricardo.ecommerce.checkout.entity.Checkout;
import com.telmoricardo.ecommerce.checkout.request.CheckoutRequest;

import java.util.Optional;


public interface CheckoutService {

    Optional<Checkout> create(CheckoutRequest request);
}
