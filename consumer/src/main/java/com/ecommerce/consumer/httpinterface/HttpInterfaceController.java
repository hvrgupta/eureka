package com.ecommerce.consumer.httpinterface;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/http-interface/")
public class HttpInterfaceController {
    private final ProviderHttpInterface providerHttpInterface;

    @GetMapping("/instance")
    public String getInstanceDetails() {
        return providerHttpInterface.getInstanceInfo();
    }
}
