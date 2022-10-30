package com.deering.kopringtutorial

import org.slf4j.Logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val testService: TestService
) {
    val log: Logger = org.slf4j.LoggerFactory.getLogger(TestController::class.java)

    @GetMapping("/api/test")
    fun test(): String {
        log.info("This is controller")
        return testService.test()
    }
}