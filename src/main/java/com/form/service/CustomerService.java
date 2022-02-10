package com.form.service;

import java.util.List;

import com.form.entity.FormEntity;
import com.form.model.Form;

public interface CustomerService {
 List<FormEntity> getFormData();
 
 String addAForm(Form form);
}
