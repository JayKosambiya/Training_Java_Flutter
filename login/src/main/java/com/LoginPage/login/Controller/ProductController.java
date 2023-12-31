package com.LoginPage.login.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoginPage.login.Dto.StocksDto;
import com.LoginPage.login.Entity.Product;
import com.LoginPage.login.Service.ProductService;


@RestController
@CrossOrigin
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("Products")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
	
	@PostMapping("Products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PatchMapping("Products")
	public ResponseEntity<String> changeAvailableStocks(@RequestBody List<StocksDto> stocksDtoList) {
		
		return productService.changeAvailableStocks(stocksDtoList);
	}
}
