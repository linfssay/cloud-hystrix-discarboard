package com.github.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fallback 是实现本类的一个错误实现。
 * Created by leolin on 7/10/2018.
 */

@FeignClient(value = "SERVICE-HELLO" ,fallback = HelloFallBackService.class)
public interface HelloService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
