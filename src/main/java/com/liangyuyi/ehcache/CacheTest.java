package com.liangyuyi.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * ehcache 的demo ， 参考：http://blog.csdn.net/vbirdbest/article/details/72763048
 * Created by liangyuyi on 2018/2/6
 */
public class CacheTest {
    public static void main(String[] args) {
        // 1. 创建缓存管理器
        CacheManager cacheManager = CacheManager.create("./src/main/resources/ehcache.xml");
        // 2. 获取缓存对象
        Cache cache = cacheManager.getCache("HelloWorldCache");
        // 3. 创建元素
        Element element = new Element("key1", "value1");//value的值可以是一个实体
        // 4. 将元素添加到缓存
        cache.put(element);
        // 5. 获取缓存
        Element value = cache.get("key1");
        System.out.println(value);
        System.out.println(value.getObjectValue());
        // 6. 删除元素
        cache.remove("key1");

        // 7. 刷新缓存
        cache.flush();
        // 8. 关闭缓存管理器
        cacheManager.shutdown();
    }
}
