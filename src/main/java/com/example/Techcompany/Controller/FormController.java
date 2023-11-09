package com.example.Techcompany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Techcompany.Model.FormField;
import com.example.Techcompany.Repository.FormFieldRepository;

@RestController
@RequestMapping("/api/form")
public class FormController {
	
	 @Autowired
	    private FormFieldRepository formFieldRepository;
	 
	 
	 
	 	@GetMapping("/fields")
	    public List<FormField> getAllFormFields()
	 	{
	        return formFieldRepository.findAll();
	    }

	@GetMapping("/fields")
	    public String hello()
	 	{
	        return "welcome";
	    }


}
