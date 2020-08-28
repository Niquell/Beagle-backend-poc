package com.example.backend.service

import com.example.backend.builder.BeagleScreenBuilder
import org.springframework.stereotype.Service

@Service
class BeagleScreenService {
    fun createBeagleScreen() = BeagleScreenBuilder
}
