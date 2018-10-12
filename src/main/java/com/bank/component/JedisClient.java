package com.bank.component;

public interface JedisClient {
    String set(String key, String value);

    String get(String key);

    Long hset(String key, String item, String value);

    String hget(String key, String item);

    Long hdel(String key, String item);

    Long incr(String key);

    Long derc(String key);

    Long expire(String key, int second);

    Long ttl(String key);



}
