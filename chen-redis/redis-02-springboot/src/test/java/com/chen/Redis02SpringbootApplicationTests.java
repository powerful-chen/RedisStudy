package com.chen;

import com.chen.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Qualifier("RedisTemplate")
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("myKey","关注小陈公众号");
        System.out.println(redisTemplate.opsForValue().get("myKey"));

    }

    @Test
    public void test() throws JsonProcessingException {
        //真实的开发一般使用json来传递对象
        User user = new User("小陈说Java", 18);
        //String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));

    }

}
