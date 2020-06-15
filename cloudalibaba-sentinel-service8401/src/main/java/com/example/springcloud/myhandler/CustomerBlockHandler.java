package com.example.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;

public class CustomerBlockHandler {

    public static CommonResult  handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义, global handlerException------1",new Payment(2020L,"serial003"));
    }

    public static CommonResult  handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义, global handlerException------2",new Payment(2020L,"serial003"));
    }
}
