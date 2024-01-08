package com.subprj.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class PaymentInfo {
    private String payer;
    private PaymentMethod paymentMethod;

    @Getter
    @RequiredArgsConstructor
    public enum PaymentMethod {
        KAKAO_PAY("카카오페이"), NAVER_PAY("네이버페이");

        private final String description;
    }

    @Builder
    public PaymentInfo(String payer, PaymentMethod paymentMethod) {
        this.payer = payer;
        this.paymentMethod = paymentMethod;
    }
}
