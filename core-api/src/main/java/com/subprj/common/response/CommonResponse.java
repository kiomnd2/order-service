package com.subprj.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommonResponse <T>{
    private String code;
    private String message;
    private T body;

    public static <T> CommonResponse<T> ofSuccess(T body) {
        return new CommonResponse<T>("0000", "처리되었습니다", body);
    }
}
