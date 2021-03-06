/**
 *
 */
package com.buuth.appspringboot.service.query.category;

import org.springframework.stereotype.Service;

import com.buuth.appspringboot.service.query.AppSpringBootQuery;
import com.buuth.appspringboot.service.query.category.dto.CategoryQueryList;
import com.buuth.appspringboot.service.query.category.dto.ListCategoryDto;

/**
 * @author Tran Hoang Buu
 *
 */
@Service
public class CategoryQueryServiceImpl extends AppSpringBootQuery implements CategoryQueryService {

    @Override
    public ListCategoryDto handle(CategoryQueryList query) {

        return ListCategoryDto.builder()
            .content(categoryMapper.getCategorys())
        .build();
    }
}
