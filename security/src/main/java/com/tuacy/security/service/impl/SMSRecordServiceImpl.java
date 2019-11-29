package com.tuacy.security.service.impl;

import com.tuacy.security.config.CacheManagerConfig;
import com.tuacy.security.service.SMSRecordService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @name: SMSRecordServiceImpl
 * @author: tuacy.
 * @date: 2019/11/29.
 * @version: 1.0
 * @Description:
 */
@CacheConfig(cacheNames = CacheManagerConfig.EhCacheNames.CACHE_10MINS)
@Service
public class SMSRecordServiceImpl implements SMSRecordService {

    @CachePut()
    @Override
    public void saveSMSCode(String userName, String smsCode) {

    }

    /**
     * Cacheable 注解会先查询是否已经有缓存，有会使用缓存，没有则会执行方法并缓存
     * 如果没有指定key则默认使用参数作为key
     */
    @Cacheable()
    @Override
    public String getSMSCode(String userName) {
        return null;
    }

    @CacheEvict(beforeInvocation = true)
    @Override
    public void clearSMSCode(String userName) {

    }
}
