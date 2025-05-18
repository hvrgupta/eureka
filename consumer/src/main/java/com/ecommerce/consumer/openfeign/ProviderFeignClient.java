package com.ecommerce.consumer.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider")
public interface ProviderFeignClient {
    @GetMapping("/instance-info")
    String getInstanceInfo();
}
