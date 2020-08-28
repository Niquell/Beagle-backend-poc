package com.example.backend.controller

import com.example.backend.service.BeagleScreenService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BeagleScreenController(
        private val beagleScreenService: BeagleScreenService
){
    @CrossOrigin("*")
    @GetMapping("/screen")
    fun getBeagleScreen() = beagleScreenService.createBeagleScreen()
}
