package com.shiv.Springbootmanytomanymapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shiv.Springbootmanytomanymapping.entity.Delegate;
import com.shiv.Springbootmanytomanymapping.entity.Event;
import com.shiv.Springbootmanytomanymapping.repository.EventRepository;

@SpringBootApplication
public class SpringBootManyToManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootManyToManyMappingApplication.class, args);
	}
	
	
	  @Autowired 
	  private EventRepository eventRepository;
	 
	@Override 
	public void run(String... args) throws Exception { 
	  Event event=new Event(); 
	  event.setEventName("Java - 101"); event.setEventName("c++ - 101");
	  
	  Delegate delegate=new Delegate(); 
	  delegate.setDelegateName("Alex Rod");
	  Delegate delegate1=new Delegate(); 
	  delegate1.setDelegateName("Linda Berry");
	  
	  event.getDelegates().add(delegate); 
	  event.getDelegates().add(delegate1);
	  delegate.getEvent().add(event); 
	  delegate1.getEvent().add(event);
	  
	  
	  eventRepository.save(event); }
	 
}
