package com.ismail.hutbro.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ismail.hutbro.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
