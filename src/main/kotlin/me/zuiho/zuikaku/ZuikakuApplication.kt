package me.zuiho.zuikaku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZuikakuApplication

fun main(args: Array<String>) {
	runApplication<ZuikakuApplication>(*args)
}
