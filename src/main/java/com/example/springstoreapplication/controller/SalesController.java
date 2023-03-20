package com.example.springstoreapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springstoreapplication.data.entity.Sales;
import com.example.springstoreapplication.services.SalesService;

@CrossOrigin( "*" )
@RestController
public class SalesController
{

private final SalesService salesService;

public SalesController( @Autowired SalesService salesService )
{
    this.salesService = salesService;
}

@GetMapping( "/sales/{id}" )
public Sales getSale( @PathVariable String id )
{
    return salesService.getSale( Integer.parseInt( id ) );
}
}