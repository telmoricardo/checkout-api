package com.telmoricardo.ecommerce.checkout.resource;

import com.telmoricardo.ecommerce.checkout.entity.Checkout;
import com.telmoricardo.ecommerce.checkout.request.CheckoutRequest;
import com.telmoricardo.ecommerce.checkout.response.CheckoutResponse;
import com.telmoricardo.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create(CheckoutRequest request){
        final Checkout checkout = checkoutService.create(request).orElseThrow();
        final CheckoutResponse response = CheckoutResponse.builder()
                .code(checkout.getCode())
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
