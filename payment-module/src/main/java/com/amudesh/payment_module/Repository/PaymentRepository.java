package com.amudesh.payment_module.Repository;

import com.amudesh.payment_module.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID> {

    Payment findPaymentByCustomerId(UUID customerId);
}
