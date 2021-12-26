package com.pink.juice.juicecommon.fuckif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * fuck if 服务
 *
 * @author yuqingyu
 * @date 2021/12/26
 */
@Service
public class FuckIfService {

    @Autowired
    ApplicationContext applicationContext;

    public Map<String, FuckIfHandler> fuckHandlerMap = new HashMap<String, FuckIfHandler>();

    @PostConstruct
    public void buildSysHandlerMap() {
        Map<String, Object> map = applicationContext.getBeansWithAnnotation(FuckIfType.class);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Class<FuckIfHandler> sysHandlerClass = (Class<FuckIfHandler>) entry.getValue().getClass();
            String type = sysHandlerClass.getAnnotation(FuckIfType.class).type();
            fuckHandlerMap.put(type, applicationContext.getBean(sysHandlerClass));
        }
    }
}
