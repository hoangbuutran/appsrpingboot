/**
 *
 */
package com.buuth.appspringboot.service.query.category.dto;

import java.util.List;

import com.buuth.appspringboot.entity.Category;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tran Hoang Buu
 *
 */
@Data
@Builder
public class ListCategoryDto {

    @JsonProperty("content")
    private List<Category> content;
}
