package com.subprj.common.utils;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class TokenGenerateUtil {

    public static String generateToken() {
        return UUID.randomUUID().toString();
    }
}
