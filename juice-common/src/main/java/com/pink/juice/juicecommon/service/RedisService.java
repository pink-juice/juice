package com.pink.juice.juicecommon.service;

public interface RedisService {

    void set(String key, Object value);

    Object get(String key);
}
