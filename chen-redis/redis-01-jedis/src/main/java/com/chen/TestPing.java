package com.chen;

import redis.clients.jedis.Jedis;

/**
 * @ClassName TestPing
 * @Description TODO
 * @Author xiaochen
 * @Date 2021/4/11 14:58
 */
public class TestPing {
    public static void main(String[] args) {
        //1 new Jedis 对象即可
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println(jedis.ping());
    }
}
