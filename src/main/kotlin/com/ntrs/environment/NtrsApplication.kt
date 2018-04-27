package com.ntrs.environment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NtrsApplication

fun main(args: Array<String>) {
    runApplication<NtrsApplication>(*args)
}