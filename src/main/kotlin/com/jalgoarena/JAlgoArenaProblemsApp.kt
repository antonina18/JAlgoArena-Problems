package com.jalgoarena

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableEurekaClient
@Configuration
@EnableSwagger2
open class JAlgoArenaProblemsApp {
    @Bean
    open fun restTemplate() = RestTemplate()
}

fun main(args: Array<String>) {
    SpringApplication.run(JAlgoArenaProblemsApp::class.java, *args)
}
