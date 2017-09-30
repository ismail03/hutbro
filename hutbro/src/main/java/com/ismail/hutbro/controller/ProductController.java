package com.ismail.hutbro.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismail.hutbro.domain.Category;
import com.ismail.hutbro.domain.Image;
import com.ismail.hutbro.domain.Product;
import com.ismail.hutbro.service.ProductService;

@Component 
@Path("/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Path("/getCategoies")
	@GET
	@Produces("application/json")
	public List<Category> getCategoires(){
		return productService.getCategories();
	}
	
	@Path("/getImages")
	@GET
	@Produces("application/json")
	public List<Image> getImages(){
		return productService.getImages();
	}
	
	@Path("/getProducts")
	@GET
	@Produces("application/json")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@Path("/getProductImages/{productId}")
	@GET
	@Produces("application/json")
	public List<Image> getProductImages(@PathParam("productId") Long productId){
		return productService.getProductImages(productId);
	}
	@Path("/getProductByCategory/{categoryId}")
	@GET
	@Produces("application/json")
	public List<Product> getProductByCategory(@PathParam("categoryId") Long categoryId){
		return productService.getProductByCategory(categoryId);
	}
}
