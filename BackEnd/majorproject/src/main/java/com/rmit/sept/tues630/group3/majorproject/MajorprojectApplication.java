package com.rmit.sept.tues630.group3.majorproject;

import com.rmit.sept.tues630.group3.majorproject.Repository.UserRepository;
import com.rmit.sept.tues630.group3.majorproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MajorprojectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MajorprojectApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Andhika","Rakha","Melbourne","andhika@gmail.com"));
        this.userRepository.save(new User("Red","Clovervield","Sydney","red@gmail.com"));
        this.userRepository.save(new User("Lina","Wayne","addelaide","lina@gmail.com"));

    }

}
