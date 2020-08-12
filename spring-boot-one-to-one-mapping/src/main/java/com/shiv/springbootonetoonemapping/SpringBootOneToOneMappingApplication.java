package com.shiv.springbootonetoonemapping;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shiv.springbootonetoonemapping.entity.Gender;
import com.shiv.springbootonetoonemapping.entity.User;
import com.shiv.springbootonetoonemapping.entity.UserProfile;
import com.shiv.springbootonetoonemapping.repository.UserProfileRepository;
import com.shiv.springbootonetoonemapping.repository.UserRepository;

@SpringBootApplication
public class SpringBootOneToOneMappingApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Nagu"); 
		user.setEmail("nagu@gmail.com");
		 
		
		UserProfile userprofile = new UserProfile();
		
	      userprofile.setAddress("Hydrabad"); 
	      userprofile.setBirthOfDate(LocalDate.of(1999, 02, 12));
	      userprofile.setGender(Gender.MALE);
		  userprofile.setPhoneNumber("9535465789");

		 user.setUserProfile(userprofile);
		 userprofile.setUser(user);
		
		 userRepository.save(user);
	}
}
