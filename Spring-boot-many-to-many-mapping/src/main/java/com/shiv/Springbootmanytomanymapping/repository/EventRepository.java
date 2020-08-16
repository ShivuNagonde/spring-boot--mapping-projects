package com.shiv.Springbootmanytomanymapping.repository;
  
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.shiv.Springbootmanytomanymapping.entity.Event;
  
@Repository 
public interface EventRepository extends JpaRepository<Event,Integer>{
  
  }
 
