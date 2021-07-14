/**
 *
 */
package com.buuth.appspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buuth.appspringboot.service.command.category.CategoryCommandService;
import com.buuth.appspringboot.service.command.category.dto.CreateCategoryCommand;
import com.buuth.appspringboot.service.query.category.CategoryQueryService;
import com.buuth.appspringboot.service.query.category.dto.CategoryQueryList;
import com.buuth.appspringboot.service.query.category.dto.ListCategoryDto;

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
    @Autowired
    private CategoryCommandService categoryCommandService;

    @GetMapping
    public ResponseEntity<ListCategoryDto> getRoleByCode() {
        CategoryQueryList query = CategoryQueryList.builder()
            .build();
        ListCategoryDto content = categoryQueryService.handle(query);
        return ResponseEntity.ok().body(content);
    }

    @PostMapping
    public void create(@RequestBody CreateCategoryCommand cmd) {
        categoryCommandService.handle(cmd);
    }
}
