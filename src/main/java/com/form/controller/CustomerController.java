package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.form.entity.FormEntity;
import com.form.model.Form;
import com.form.service.CustomerServiceImpl;

@RestController
@RequestMapping("api/va1/")
public class CustomerController {



	@Autowired
	CustomerServiceImpl customerServiceImpl;

/*
 * Get Method
 */
	@GetMapping("/formData")
	public List<FormEntity> getAllFormDetails()
	{
		List<FormEntity> resp=customerServiceImpl.getFormData();
		return	resp;


	}
/*
 * Post Method
 */
	@RequestMapping(value="/addFormData",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
					
	public String addFormDetails(@RequestBody Form form)
	{
		String resp	=customerServiceImpl.addAForm(form);
		return	resp;


	}
}
