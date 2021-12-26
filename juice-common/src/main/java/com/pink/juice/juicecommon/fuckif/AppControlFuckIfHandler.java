package com.pink.juice.juicecommon.fuckif;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author yuqingyu
 */
@FuckIfType(type = "fuck1")
@Component
public class AppControlFuckIfHandler implements FuckIfHandler {
    @Override
    public Object invokeModelAndView(Map<String, Object> params) {
        return "fuck1";
    }
}
