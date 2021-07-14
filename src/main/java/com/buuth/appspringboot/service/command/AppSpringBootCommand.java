/**
 *
 */
package com.buuth.appspringboot.service.command;

import org.springframework.beans.factory.annotation.Autowired;

import com.buuth.appspringboot.repositoris.jpa.CategoryRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tran Hoang Buu
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AppSpringBootCommand {

    @Autowired
    protected CategoryRepository categoryRepository;
}
