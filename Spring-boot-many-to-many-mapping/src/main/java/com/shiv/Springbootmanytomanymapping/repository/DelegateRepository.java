package com.shiv.Springbootmanytomanymapping.repository;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.shiv.Springbootmanytomanymapping.entity.Delegate;
  
@Repository 
public interface DelegateRepository extends JpaRepository<Delegate, Integer>{
  
  }
 
