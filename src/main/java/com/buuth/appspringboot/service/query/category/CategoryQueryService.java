/**
 *
 */
package com.buuth.appspringboot.service.query.category;

import org.springframework.stereotype.Service;

import com.buuth.appspringboot.service.query.category.dto.CategoryQueryList;
import com.buuth.appspringboot.service.query.category.dto.ListCategoryDto;

/**
 * @author Tran Hoang Buu
 *
 */
@Service
public interface CategoryQueryService {

    ListCategoryDto handle(CategoryQueryList query);

}
