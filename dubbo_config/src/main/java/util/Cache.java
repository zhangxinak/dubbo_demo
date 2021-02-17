package util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class Cache {

    @Autowired
    private  RedisTemplate redisTemplate;

    public  void setString(String key, String value) {
//        Jedis jedis = RedisUtil.pool.getResource();
//        jedis.set(key, value);

        redisTemplate.opsForValue().set(key,value);
    }


    public  String getString(String key) {
//        Jedis jedis = RedisUtil.pool.getResource();
//        return jedis.get(key);

        return (String)redisTemplate.opsForValue().get(key) ;
    }


}



