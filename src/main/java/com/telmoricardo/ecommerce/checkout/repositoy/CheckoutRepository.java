package com.telmoricardo.ecommerce.checkout.repositoy;

import com.telmoricardo.ecommerce.checkout.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
}
