package com.ismail.hutbro.service;

import java.util.List;

import com.ismail.hutbro.domain.Category;
import com.ismail.hutbro.domain.Image;
import com.ismail.hutbro.domain.Product;

public interface ProductService {
	
public List<Category> getCategories();
public List<Image> getImages();
public List<Product> getProducts();

public List<Image> getProductImages(Long productId);

public List<Product> getProductByCategory(Long categoryId);

}
