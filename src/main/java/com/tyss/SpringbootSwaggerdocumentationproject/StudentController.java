package com.tyss.SpringbootSwaggerdocumentationproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class StudentController {
	
	@Operation(description = "User Object Will be Saved...", summary = "To Save User Object to Database...")
	@ApiResponses(value = { @ApiResponse(description = "User Saved Successfully", responseCode = "201"),
			@ApiResponse(description = "Unable To Save User To Database", responseCode = "409") })
	@GetMapping("/hii")
	public String saveUser()
	{
		return "Hello World";
	}

}
