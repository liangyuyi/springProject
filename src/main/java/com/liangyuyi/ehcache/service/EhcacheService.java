package com.liangyuyi.ehcache.service;

/**
 * Created by liangyuyi on 2018/2/7
 */
public interface EhcacheService {
    // 测试失效情况，有效期为5秒
    public String getTimestamp(String param);

    public String getDataFromDB(String key);

    public void removeDataAtDB(String key);

    public String refreshData(String key);


    public boolean isReserved(String userId);

    public void removeUser(String userId);

    public void removeAllUser();
}
