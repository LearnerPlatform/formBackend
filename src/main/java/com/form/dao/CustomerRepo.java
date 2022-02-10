package com.form.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.entity.FormEntity;

@Repository
public interface CustomerRepo extends JpaRepository<FormEntity,String>{

}
