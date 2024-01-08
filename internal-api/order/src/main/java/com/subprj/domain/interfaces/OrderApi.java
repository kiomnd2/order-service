package com.subprj.domain.interfaces;

import com.subprj.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/order")
public class OrderApi {

    @PostMapping
    public CommonResponse<OrderDto.ResponseOrder> order(@RequestBody OrderDto.RequestOrder requestOrder) {
        return CommonResponse.ofSuccess(new OrderDto.ResponseOrder("token"));
    }
}
