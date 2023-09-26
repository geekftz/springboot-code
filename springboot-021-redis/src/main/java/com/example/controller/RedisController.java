package com.example.controller;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {


    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/addstring")
    public String addToRedis(String name, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("myname", "lisi");
        return "add string type data to redis";
    }


    @GetMapping("/redis/getk")
    public String getData(String k) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);

        return "key is " + k + ", value is " + v;
    }

    @PostMapping("/redis/{k}/{v}")
    public String addStringKV(@PathVariable  String k, @PathVariable  String v) {
        stringRedisTemplate.opsForValue().set(k, v);

        return "use stringRedisTemplate object";
    }


    @GetMapping("/redis/getstr/{k}")
    public String getStringValue( @PathVariable String k) {
        String v = stringRedisTemplate.opsForValue().get(k);

        return "get value is " + v;
    }
}
