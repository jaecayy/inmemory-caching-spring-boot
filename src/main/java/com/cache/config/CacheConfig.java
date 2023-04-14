package com.cache.config;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {
    @Bean
    CacheManagerCustomizer<ConcurrentMapCacheManager> customizer(){
        return new ConcurrentCustomizer();
    }

    private class ConcurrentCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {


        @Override
        public void customize(ConcurrentMapCacheManager cacheManager) {
            cacheManager.setStoreByValue(true);
            cacheManager.setAllowNullValues(false);
        }
    }
}
