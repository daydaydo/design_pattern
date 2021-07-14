package com.otto.design.pattern.creational.singleton;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * program: design_pattern
 * description: ContainerSingleton
 * *@author: gqchu
 * create: 2021-07-14 22:29
 **/
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<>();
    public static void putInstance(String key,Object instance) {
        if (StringUtils.isNotBlank(key) && instance!=null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

    private ContainerSingleton() {

    }
}