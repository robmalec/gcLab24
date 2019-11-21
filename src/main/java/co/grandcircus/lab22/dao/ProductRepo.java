package co.grandcircus.lab22.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.lab22.model.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer>{
	Product findByName(String name);

}
