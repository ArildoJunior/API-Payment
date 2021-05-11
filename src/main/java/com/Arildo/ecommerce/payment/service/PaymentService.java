package com.arildo.ecommerce.payment.service;

import com.arildo.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.arildo.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
