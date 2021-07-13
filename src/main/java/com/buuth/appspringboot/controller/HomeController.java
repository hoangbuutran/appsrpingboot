/**
 *
 */
package com.buuth.appspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tran Hoang Buu
 *
 */
@Controller
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getRoleByCode() {

        return "hihi";
    }
}
