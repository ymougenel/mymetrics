package com.ymougenel.myMetrics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMetricsApplication

fun main(args: Array<String>) {
    runApplication<MyMetricsApplication>(*args)
}
