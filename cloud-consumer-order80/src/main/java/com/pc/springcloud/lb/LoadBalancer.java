package com.pc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author pc
 * @date 2020/5/26 11:22
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
