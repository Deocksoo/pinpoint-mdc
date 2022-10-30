package com.deering.kopringtutorial

import org.slf4j.Logger
import org.springframework.stereotype.Service

@Service
class TestService {
    val log: Logger = org.slf4j.LoggerFactory.getLogger(TestService::class.java)

    fun test(): String {
        log.info("This is service")
        return "Hello World!"
    }
}