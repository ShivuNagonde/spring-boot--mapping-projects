package com.shiv.springdatajpamapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiv.springdatajpamapping.dto.OrderRequest;
import com.shiv.springdatajpamapping.dto.OrderResponse;
import com.shiv.springdatajpamapping.entity.Customer;
import com.shiv.springdatajpamapping.repository.CustomerRepository;
import com.shiv.springdatajpamapping.repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request ) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
	return customerRepository.findAll();
	}
	
	
	  @GetMapping("/findInfo") 
	  public List<OrderResponse> getJoinInformation(){
	  return customerRepository.getJoinInformation(); }
	 }
