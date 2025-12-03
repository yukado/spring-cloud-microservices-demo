package dev.yukado.fraud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fraud-service")
public interface FraudClient {
    @GetMapping("/fraud/check/{employeeId}")
    FraudResponse checkEmployee(@PathVariable("employeeId") Long employeeId);
}

