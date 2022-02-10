package com.form.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.dao.CustomerRepo;
import com.form.entity.FormEntity;
import com.form.model.Form;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo custRepo;
	

	@Override
	public List<FormEntity> getFormData() {
		List<FormEntity> fE=custRepo.findAll();
	
		
		return fE;
	}


	@Override
	public String addAForm(Form form) {
		
		FormEntity formE= new FormEntity();
		formE.setCustomerName(form.getCustomerName());
		custRepo.saveAndFlush(formE);
		return "Form successfully addedd";
	}
	
	}
	
	
	

