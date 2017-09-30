package com.ismail.hutbro.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismail.hutbro.domain.Category;
import com.ismail.hutbro.domain.Image;
import com.ismail.hutbro.domain.Product;
import com.ismail.hutbro.repository.CategoryRepository;
import com.ismail.hutbro.repository.ImageRepository;
import com.ismail.hutbro.repository.ProductRepository;

@Service
public class PorductServiceImpl implements ProductService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ImageRepository imageRepository;
	@Autowired
	private ProductRepository productRepositroy;
	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	@Override
	public List<Image> getImages() {
		// TODO Auto-generated method stub
		
	/*	List<Image> images = new ArrayList<Image>();
		Image image = new Image();
		image.setImageTitle("Title");
		image.setImgLocationUrl("url");
		images.add(image);
		Product prodcut = new Product();
		prodcut.setImages(images);
		prodcut.setPorductName("test Product");
		productRepositroy.saveAndFlush(prodcut);*/
		System.out.println("successfully inserted");
		return imageRepository.findAll();
	}
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepositroy.findAll();
	}
	@Override
	public List<Image> getProductImages(Long productId) {
		// TODO Auto-generated method stub
		if(productRepositroy.findOne(productId) == null)
			return new ArrayList<Image>();
		return productRepositroy.findOne(productId).getImages();
	}
	@Override
	public List<Product> getProductByCategory(Long categoryId) {
		// TODO Auto-generated method stub
		if(categoryRepository.findOne(categoryId) == null)
			return new ArrayList<Product>();
		
		return categoryRepository.findOne(categoryId).getProducts();
	}

}
