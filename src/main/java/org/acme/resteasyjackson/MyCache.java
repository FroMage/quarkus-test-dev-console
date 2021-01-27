package org.acme.resteasyjackson;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.cache.CacheResult;

@ApplicationScoped
public class MyCache {

    @CacheResult(cacheName = "stuff") 
    public String getStuff() {
        return "FroMage";
    }
}