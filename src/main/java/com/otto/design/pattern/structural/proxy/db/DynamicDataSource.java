package com.otto.design.pattern.structural.proxy.db;

import com.otto.design.pattern.structural.proxy.db.DataSourceContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * program: design_pattern
 * description: DynamicDataSource
 * *@author: gqchu
 * create: 2021-07-21 21:09
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
