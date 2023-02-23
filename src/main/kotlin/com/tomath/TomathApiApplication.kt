package com.tomath

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TomathApiApplication

fun main(args: Array<String>) {
	runApplication<TomathApiApplication>(*args)
}
