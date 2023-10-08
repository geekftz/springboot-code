package com.example.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {


    @Resource
    private RedisTemplate redisTemplate;

    // @Resource
    // private StringRedisTemplate stringRedisTemplate;
    //
    // @PostMapping("/redis/addstring")
    // public String addToRedis(String name, String value) {
    //     ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
    //     valueOperations.set("myname", "lisi");
    //     return "add string type data to redis";
    // }
    //
    //
    // @GetMapping("/redis/getk")
    // public String getData(String k) {
    //     ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
    //     Object v = valueOperations.get(k);
    //
    //     return "key is " + k + ", value is " + v;
    // }
    //
    // @PostMapping("/redis/{k}/{v}")
    // public String addStringKV(@PathVariable  String k, @PathVariable  String v) {
    //     stringRedisTemplate.opsForValue().set(k, v);
    //
    //     return "use stringRedisTemplate object";
    // }
    //
    //
    // @GetMapping("/redis/getstr/{k}")
    // public String getStringValue( @PathVariable String k) {
    //     String v = stringRedisTemplate.opsForValue().get(k);
    //
    //     return "get value is " + v;
    // }
    //
    // @PostMapping("/redis/addstr")
    // public String addString(String k, String v) {
    //     redisTemplate.setKeySerializer(new StringRedisSerializer());
    //     redisTemplate.setValueSerializer(new StringRedisSerializer());
    //
    //     redisTemplate.opsForValue().set(k, v);
    //
    //     return "define redisTemplate object's key and value, for serializer";
    // }


    @PostMapping("/redis/addjson")
    public String addjson() {
        Student student = new Student();
        student.setAge(11);
        student.setName("hah");
        student.setId(44444);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        redisTemplate.opsForValue().set("mystudent", student);


        return "json";
    }

    @PostMapping("/redis/getjson")
    public String getjson() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //

        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        Object student = redisTemplate.opsForValue().get("mystudent");





        // return "json = " + student;
        return "json =" + student;
    }
}
