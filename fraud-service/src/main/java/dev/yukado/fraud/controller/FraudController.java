package dev.yukado.fraud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fraud")
public class FraudController {

    @GetMapping("/check/{employeeId}")
    public FraudResponse check(@PathVariable Long employeeId) {
        // Dummy-Logik: jeder zweite Mitarbeiter gilt als verdächtig
        boolean isFraudulent = employeeId % 2 == 0;
        return new FraudResponse(employeeId, isFraudulent);
    }
}

