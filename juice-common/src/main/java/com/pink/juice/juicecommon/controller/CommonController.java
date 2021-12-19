package com.pink.juice.juicecommon.controller;

import com.pink.juice.juicecommon.dto.RedisParam;
import com.pink.juice.juicecommon.service.RedisService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yuqingyu
 */
@Slf4j
@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private RedisService redisService;

    @PostMapping(value = "set")
    @ApiOperation(value = "set")
    public String set(HttpServletRequest request,
                      @RequestBody RedisParam param) {
        log.info("param: {}", param);
        redisService.set(String.valueOf(param.userId), param);
        return "ok";
    }

    @PostMapping(value = "get")
    @ApiOperation(value = "get")
    public String get(HttpServletRequest request,
                      @RequestBody RedisParam param) {
        RedisParam param1 = (RedisParam) redisService.get(String.valueOf(param.userId));
        log.info("param: {}", param1);
        return "ok";
    }
}
