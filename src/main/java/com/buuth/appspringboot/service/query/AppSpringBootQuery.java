/**
 *
 */
package com.buuth.appspringboot.service.query;

import org.springframework.beans.factory.annotation.Autowired;

import com.buuth.appspringboot.repositoris.mapper.CategoryMapper;

/**
 * @author Tran Hoang Buu
 *
 */
public abstract class AppSpringBootQuery {

    @Autowired
    protected CategoryMapper categoryMapper;
}
