package co.grandcircus.lab22.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.lab22.model.Product;

@Repository
public class InfoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addUser(String firstName, String lastName, String email, String phoneNumber, String password) {
		String addQuery = "insert into Users (firstName, lastName, email, phoneNum, password) values(?,?,?,?,?)";
		return jdbcTemplate.update(addQuery, firstName, lastName, email, phoneNumber, password);
	}
	
	public List<Product> getAllProducts(){
		return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<Product>(Product.class));
	}
	
	public void addOnetoCart() {
		
	}


}
