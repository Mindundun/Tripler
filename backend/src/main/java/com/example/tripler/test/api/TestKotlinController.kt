package com.example.tripler.test.api

import com.example.tripler.test.service.TestKotlinService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestKotlinController(
	private val testKotlinService: TestKotlinService
) {

	@GetMapping("/test-kotlin")
	fun getTestKotlinController(): ResponseEntity<String> {
		val response = testKotlinService.getTestKotlinService()
		return ResponseEntity.ok(response)
	}
}