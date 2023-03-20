package com.example.springstoreapplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springstoreapplication.data.entity.Sales;

public interface SalesRepository extends CrudRepository<Sales, Integer>{

}
