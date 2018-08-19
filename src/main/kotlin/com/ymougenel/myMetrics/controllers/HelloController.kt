package com.ymougenel.myMetrics.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun sayHello(): String {
        return "hello"
    }
}
