package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Data;
import com.example.demo.ReEntity;

@CrossOrigin("*")
@RestController
public class ReController {

	@PostMapping("/bfhl")
	public ResponseEntity<?> bajaj(@RequestBody Data data) {		 
		
		 String numArray[];
	        String alphabetArray[];
	        StringBuilder numbers = new StringBuilder();
	        StringBuilder alphabets = new StringBuilder();
	        String numbersStr = "0123456789";
	        for (String dataItem : data.getData()) {
	            String item = dataItem.substring(0, 1);
	            if (numbersStr.contains(item)) {
	                numbers.append(dataItem);
	                numbers.append(",");
	            }
	            else {
	                alphabets.append(dataItem);
	                alphabets.append(",");
	            }
	        }

	        numArray = numbers.toString().split(",");
	        alphabetArray = alphabets.toString().split(",");
	        ReEntity entity = new ReEntity();
	        entity.setStatus(true);
	        entity.setEmailId("john@xyz.com");
	        entity.setUserId("john_doe_17091999");
	        entity.setRollNum("ABCD123");
	        entity.setNumArray(numArray);
	        entity.setAlphabetArray(alphabetArray);
	        return ResponseEntity.ok(entity);
	}
}
