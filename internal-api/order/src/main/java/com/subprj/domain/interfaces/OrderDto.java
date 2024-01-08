package com.subprj.domain.interfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class OrderDto {

    @Getter
    @Setter
    @ToString
    public static class RequestOrder {
        private String orderName;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class ResponseOrder {
        private String token;

    }
}
