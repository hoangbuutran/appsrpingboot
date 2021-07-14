/**
 *
 */
package com.buuth.appspringboot.service.command.category;

import org.springframework.stereotype.Service;

import com.buuth.appspringboot.entity.Category;
import com.buuth.appspringboot.service.command.AppSpringBootCommand;
import com.buuth.appspringboot.service.command.category.dto.CreateCategoryCommand;

/**
 * @author Tran Hoang Buu
 *
 */
@Service
public class CategoryCommandServiceImpl extends AppSpringBootCommand implements CategoryCommandService {

    @Override
    public void handle(CreateCategoryCommand cmd) {
        Category category = Category.builder()
            .name(cmd.getName())
            .build();
        this.categoryRepository.save(category);
    }
}
