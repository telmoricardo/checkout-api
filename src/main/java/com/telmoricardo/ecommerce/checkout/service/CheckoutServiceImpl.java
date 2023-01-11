package com.telmoricardo.ecommerce.checkout.service;

import com.telmoricardo.ecommerce.checkout.entity.Checkout;
import com.telmoricardo.ecommerce.checkout.repositoy.CheckoutRepository;
import com.telmoricardo.ecommerce.checkout.request.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<Checkout> create(CheckoutRequest request) {
        final Checkout checkout = Checkout.builder()
                .code(UUID.randomUUID().toString())
                .status(Checkout.Status.CREATED)
                .build();
        return Optional.of(checkoutRepository.save(checkout));
    }
}
