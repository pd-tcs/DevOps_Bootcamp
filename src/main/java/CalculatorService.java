package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/welcome")
	public String welcomeMessage(@RequestParam String name) {
		return "Welcome " + name;
	}
	
	@GetMapping("/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	
	@GetMapping("/subtract")
	public int subtract(@RequestParam int a, @RequestParam int b) {
		return a-b;
	}
	
	@GetMapping("/multiply")
	public int multiply(@RequestParam int a, @RequestParam int b) {
		return a*b;
	}
	
	@GetMapping("/divide")
	public float divide(@RequestParam float a, @RequestParam float b) {
		return a/b;
	}
	
	@GetMapping("/mod")
	public int mod(@RequestParam int a, @RequestParam int b) {
		return a%b;
	}
	
	@GetMapping("/percentage")
	public float percentage(@RequestParam float marksObtained, @RequestParam float totalMarks) {
		return ((marksObtained/totalMarks)*100);
	}
	
	@GetMapping("/squareRoot")
	public double sqrt(@RequestParam double a) {
		return Math.sqrt(a);
	}
	
	@GetMapping("/factorial")
	public long factorial(@RequestParam int number) {
		long fact = 1;
        for(int i = 1; i <= number; ++i) {
            fact *= i;
        }
        return fact;
	}
}