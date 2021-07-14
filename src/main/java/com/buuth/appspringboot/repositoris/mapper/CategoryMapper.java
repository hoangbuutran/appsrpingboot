package com.buuth.appspringboot.repositoris.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.buuth.appspringboot.entity.Category;

@Mapper
public interface CategoryMapper {

    public List<Category> getCategorys();
}
