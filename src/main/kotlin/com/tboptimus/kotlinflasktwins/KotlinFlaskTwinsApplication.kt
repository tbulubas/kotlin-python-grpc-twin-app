package com.tboptimus.kotlinflasktwins

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinFlaskTwinsApplication

fun main(args: Array<String>) {
	runApplication<KotlinFlaskTwinsApplication>(*args)
}
