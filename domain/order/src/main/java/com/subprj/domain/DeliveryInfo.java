package com.subprj.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class DeliveryInfo {
    private String receiverName;
    private String receiverPhoneNumber;
    private String zipCode;
    private String address1;
    private String address2;

    @Builder
    public DeliveryInfo(String receiverName, String receiverPhoneNumber, String zipCode, String address1, String address2) {
        this.receiverName = receiverName;
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
    }
}
