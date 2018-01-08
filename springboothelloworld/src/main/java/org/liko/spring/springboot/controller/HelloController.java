package org.liko.spring.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 可以被SpringMVC用来处理web请求
 * RequestMapping 请求路径
 *
 * RestController 结合@Controller 和@ResponseBody 导致web请求返回数据而不是试图
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
