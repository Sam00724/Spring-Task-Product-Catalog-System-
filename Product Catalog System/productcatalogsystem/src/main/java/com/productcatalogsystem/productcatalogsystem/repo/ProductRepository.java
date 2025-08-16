package com.productcatalogsystem.productcatalogsystem.repo;

import com.productcatalogsystem.productcatalogsystem.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
