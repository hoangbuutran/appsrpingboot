/**
 *
 */
package com.buuth.appspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buuth.appspringboot.service.query.category.CategoryQueryService;
import com.buuth.appspringboot.service.query.category.dto.CategoryQueryList;
import com.buuth.appspringboot.service.query.category.dto.ListCategoryDto;
import com.buuth.appspringboot.service.query.dto.BaseListContentDto;
import com.buuth.appspringboot.service.query.dto.QueryItem;

/**
 * @author Tran Hoang Buu
 *
 */
@Controller
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryQueryService categoryQueryService;

    @GetMapping
    public ResponseEntity<BaseListContentDto> getRoleByCode() {
        CategoryQueryList query = CategoryQueryList.builder()
            .build();
        ListCategoryDto content = categoryQueryService.handle(query);
        BaseListContentDto result = BaseListContentDto.builder()
            .content((List<QueryItem>) content)
            .total(1000l)
            .build();
        return ResponseEntity.ok().body(result);
    }
}
