package com.arildo.ecommerce.payment.repository;

import com.arildo.ecommerce.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
