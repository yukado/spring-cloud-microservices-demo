package dev.yukado.product.controller;

import dev.yukado.product.model.Product;
import dev.yukado.product.repo.ProductRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class ProductController {

    private final ProductRepo repository;

    public ProductController(ProductRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/list-products")
    public List<Product> all() {
        return repository.findAll();
    }

    @PostMapping("/create-product")
    public Product create(@RequestBody Product product) {
        return repository.save(product);
    }

    @PostMapping("/update-product")
    public Product update(@RequestBody Product product) {
        return repository.update(product);
    }

    @PostMapping("/delete-product")
    public void delete(@RequestBody Product product){
        repository.delete(product);
    }
}
