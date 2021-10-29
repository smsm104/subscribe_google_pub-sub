package com.sm.subscribe_google_pubsub.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class MainController {

    @RequestMapping("")
    fun main(): String {

        return "aa";
    }

}