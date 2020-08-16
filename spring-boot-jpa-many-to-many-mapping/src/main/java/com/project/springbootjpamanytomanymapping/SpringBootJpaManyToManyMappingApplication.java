package com.project.springbootjpamanytomanymapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.springbootjpamanytomanymapping.entity.Post;
import com.project.springbootjpamanytomanymapping.entity.Tag;
import com.project.springbootjpamanytomanymapping.repository.PostRepository;
import com.project.springbootjpamanytomanymapping.repository.TagRepository;

@SpringBootApplication
public class SpringBootJpaManyToManyMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaManyToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
	Post post = new Post("Hibernate Many to Many Mapping Example With Spring Boot",
			"Hibernate Many to Many Mapping Example With Spring Boot",
			"Hibernate Many to Many Mapping Example With Spring Boot");
	
	Tag springboot = new Tag("Spring Boot");
	Tag hibernate = new Tag("Hibernate");
	
		
	post.getTags().add(springboot);
	post.getTags().add(hibernate);
	
	springboot.getPosts().add(post);
	hibernate.getPosts().add(post);
	
	this.postRepository.save(post);
	}

}
