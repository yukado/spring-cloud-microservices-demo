package dev.yukado.product.repo;

import dev.yukado.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product update(Product product);
    Product save(Product product);
    Product findById(long id);
    Product deleteById(long id);
    Product findByName(String name);
     default List<Product> findAllProducts() {
        return findAll();
    }

}
