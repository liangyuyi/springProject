package com.liangyuyi.ehcache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by liangyuyi on 2018/2/7
 */
@Service
public class EhcacheServiceImpl implements EhcacheService {
    /**
     * @Cacheable
     * 表明所修饰的方法是可以缓存的：当第一次调用这个方法时，它的结果会被缓存下来，在缓存的有效时间内，以后访问这个方法都直接返回缓存结果，不再执行方法中的代码段。
     这个注解可以用condition属性来设置条件，如果不满足条件，就不使用缓存能力，直接执行方法。
     可以使用key属性来指定key的生成规则。
     */
    // value的值和ehcache.xml中的配置保持一致
    @Cacheable(value="HelloWorldCache", key="#param")
    @Override
    public String getTimestamp(String param) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString();
    }

    @Cacheable(value="HelloWorldCache", key="#key")
    @Override
    public String getDataFromDB(String key) {
        System.out.println("从数据库中获取数据...");
        return key + ":" + String.valueOf(Math.round(Math.random()*1000000));
    }

    /**
     * @CacheEvict与@Cacheable不同，@CachePut不仅会缓存方法的结果，还会执行方法的代码段。它支持的属性和用法都与@Cacheable一致。
     * @param key
     */
    @CacheEvict(value="HelloWorldCache", key="#key")
    @Override
    public void removeDataAtDB(String key) {
        System.out.println("从数据库中删除数据");
    }

    @CachePut(value="HelloWorldCache", key="#key")
    @Override
    public String refreshData(String key) {
        System.out.println("模拟从数据库中加载数据");
        return key + "::" + String.valueOf(Math.round(Math.random()*1000000));
    }
    // 将缓存保存进UserCache中，并当参数userId的长度小于12时才保存进缓存，默认使用参数值及类型作为缓存的key
    // 保存缓存需要指定key，value， value的数据类型，不指定key默认和参数名一样如："1"
    @Cacheable(value="UserCache", condition="#userId.length()<12")
    public boolean isReserved(String userId) {
        System.out.println("UserCache:"+userId);
        return false;
    }

    //清除掉UserCache中某个指定key的缓存
    @CacheEvict(value="UserCache",key="'user:' + #userId")
    public void removeUser(String userId) {
        System.out.println("UserCache remove:"+ userId);
    }

    //清除掉UserCache中全部的缓存
    @CacheEvict(value="UserCache", allEntries=true)
    public void removeAllUser() {
        System.out.println("UserCache delete all");
    }
}
