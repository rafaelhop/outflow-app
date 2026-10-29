package br.com.rafaelhop.outflow_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OutflowAppApplication

fun main(args: Array<String>) {
	runApplication<OutflowAppApplication>(*args)
}
