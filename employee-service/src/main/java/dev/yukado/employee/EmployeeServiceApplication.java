package dev.yukado.employee;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}
