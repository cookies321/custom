package com.holyrobot.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 赵乐
 * @create 2018-05-0820:18
 * @desc
 **/
@Component
public class JedisUtils {

    @Autowired
    private JedisPool jedisPool;

    /**
     *
     * @Description 放入详情链接用于去重
     * @author 汤玉林
     * @date 2018年3月2日 上午11:31:12
     * @action set
     * @param key
     * @param value
     */
    public void set(String key,String value){
        Jedis resource = jedisPool.getResource();
        resource.set(key, value);
        resource.close();
    }

    /**
     *
     * @Description 获取string值
     * @author 汤玉林
     * @date 2018年3月2日 上午11:35:10
     * @action get
     * @param key
     */
    public String get(String key){
        Jedis resource = jedisPool.getResource();
        String string = resource.get(key);
        resource.close();
        return string;
    }


    /**
     * @Description 查询
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:05:31
     * @action lrange
     * @return List<String>
     */
    public List<Object> lrange(String key, int start, int end) {
        Jedis resource = jedisPool.getResource();
        List<byte[]> list = resource.lrange(key.getBytes(), start, end);
        List<Object> obj = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            byte[] bs = list.get(i);
            Object unserizlize = this.unserizlize(bs);
            obj.add(unserizlize);
        }
        resource.close();
        return obj;
    }

    /**
     *
     * @Description 添加list key,value是string
     * @author 赵乐
     * @date 2017年12月8日 上午11:21:25
     * @action addStr
     * @param @param
     *            Key
     * @param @param
     *            url
     * @return void
     */
    public void addStr(String Key, String url) {
        Jedis resource = jedisPool.getResource();
        resource.lpush(Key, url);
        resource.close();
    }

    /**
     *
     * @Description list中获取str
     * @author 赵乐
     * @date 2017年12月8日 上午11:25:55
     * @action poll
     * @param @param
     *            key
     * @param @return
     * @return String
     */
    public String pollStr(String key) {
        Jedis resource = jedisPool.getResource();
        String rpop = resource.rpop(key);
        resource.close();
        return rpop;
    }

    /**
     * @Description 添加list
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:05:22
     * @action add
     * @return void
     */
    public void add(String Key, Object obj) {
        Jedis resource = jedisPool.getResource();
        resource.lpush(Key.getBytes(), this.serialize(obj));
        resource.close();
    }

    /**
     * @Description list中获取
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:05:03
     * @action poll
     * @return String
     */
    public Object poll(String key) {
        Jedis resource = jedisPool.getResource();
        byte[] rpop = resource.rpop(key.getBytes());
        Object unserizlize = null;
        if (Objects.nonNull(rpop)) {
            unserizlize = this.unserizlize(rpop);
        }
        resource.close();
        jedisPool.close();
        return unserizlize;
    }

    /**
     * @Description 添加set
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:04:57
     * @action addSet
     * @return void
     */
    public void addSet(String Key, String value) {
        Jedis resource = jedisPool.getResource();
        resource.sadd(Key, value);
        resource.close();
    }

    /**
     * @Description 随机获取Set 值
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:04:50
     * @action getSet
     * @return String
     */
    public String getSet(String key) {
        Jedis resource = jedisPool.getResource();
        String value = resource.srandmember(key);
        resource.close();
        return value;
    }

    /**
     * @Description 删除Set 随机值
     * @author 徐仁杰
     * @date 2017年11月30日 上午10:04:42
     * @action deleteSet
     * @return void
     */
    public void deleteSet(String key, String value) {
        Jedis resource = jedisPool.getResource();
        resource.srem(key, value);
        resource.close();
    }

    /**
     * @Description 序列化
     * @author 徐仁杰
     * @date 2017年11月17日 上午10:46:19
     * @action serialize
     * @return byte[]
     */
    public byte[] serialize(Object obj) {
        ObjectOutputStream obi = null;
        ByteArrayOutputStream bai = null;
        try {
            bai = new ByteArrayOutputStream();
            obi = new ObjectOutputStream(bai);
            obi.writeObject(obj);
            byte[] byt = bai.toByteArray();
            return byt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Description 反序列化
     * @author 徐仁杰
     * @date 2017年11月17日 上午10:46:27
     * @action unserizlize
     * @return Object
     */
    public Object unserizlize(byte[] byt) {
        ObjectInputStream oii = null;
        ByteArrayInputStream bis = null;
        bis = new ByteArrayInputStream(byt);
        try {
            oii = new ObjectInputStream(bis);
            Object obj = oii.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 根据key删除单条记录
    public long del(String key) {
        Jedis jedis = jedisPool.getResource();
        Boolean exists = jedis.exists(key);
        if(exists){
            Long result = jedis.del(key);
            jedis.close();
            return result;
        }else{
            jedis.close();
            return 0;
        }

    }

    public Jedis getJedis() {
        Jedis resource = jedisPool.getResource();
        return resource;
    }


    public static void main(String[] args) {
        JedisUtils jedisUtils = new JedisUtils();
        jedisUtils.set("sss","sss");
    }



}
