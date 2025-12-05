package dev.yukado.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ProductServiceApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ProductServiceApplication.class, args);
    }
}