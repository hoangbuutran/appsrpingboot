/**
 *
 */
package com.buuth.appspringboot.service.command.category;

import org.springframework.stereotype.Service;

import com.buuth.appspringboot.service.command.category.dto.CreateCategoryCommand;

/**
 * @author Tran Hoang Buu
 *
 */
@Service
public interface CategoryCommandService {

    void handle(CreateCategoryCommand cmd);
}
