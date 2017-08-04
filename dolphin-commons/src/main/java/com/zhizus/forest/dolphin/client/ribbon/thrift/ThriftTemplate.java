package com.zhizus.forest.dolphin.client.ribbon.thrift;

import com.zhizus.forest.dolphin.client.AbstractTemplate;
import org.apache.thrift.TServiceClient;

/**
 * Created by dempezheng on 2017/8/4.
 */
public class ThriftTemplate<T extends TServiceClient> extends AbstractTemplate<T> {


    public ThriftTemplate(String serviceName, Class<T> type) {
        super(serviceName, type);
    }

}
