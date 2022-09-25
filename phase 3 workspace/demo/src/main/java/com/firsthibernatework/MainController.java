package com.firsthibernatework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	//@RequestMapping(value="Hello",method="get")
	@GetMapping("/Hello")
	public String message(){
	return "Hello All";
	}
	
@GetMapping("/Product/{id}")
public static String getProduct(@PathVariable("id")String id) {
	if(id.equals("1"))
		throw new ProductException();
	else
		return "Product found";
}
}
