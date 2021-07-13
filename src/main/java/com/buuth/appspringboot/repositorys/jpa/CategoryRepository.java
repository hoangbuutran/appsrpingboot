package com.buuth.appspringboot.repositorys.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buuth.appspringboot.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
