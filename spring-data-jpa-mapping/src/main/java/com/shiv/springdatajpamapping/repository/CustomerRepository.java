package com.shiv.springdatajpamapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shiv.springdatajpamapping.dto.OrderResponse;
import com.shiv.springdatajpamapping.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	  @Query("SELECT new com.shiv.springdatajpamapping.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p" )
	  public List<OrderResponse> getJoinInformation();
	 }
