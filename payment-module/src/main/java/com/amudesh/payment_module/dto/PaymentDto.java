package com.amudesh.payment_module.dto;

import java.util.UUID;

public class PaymentDto {
    UUID paymentId;

    public UUID getPaymentId() {
        return paymentId;
    }

    PaymentDto(){

    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }
}
