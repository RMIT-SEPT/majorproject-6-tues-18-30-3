package com.rmit.sept.tues630.group3.majorproject;

import com.rmit.sept.tues630.group3.majorproject.Repository.TeamRepository;
import com.rmit.sept.tues630.group3.majorproject.model.Team;
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
    private TeamRepository teamRepository;
    @Override
    public void run(String... args) throws Exception {
        this.teamRepository.save(new Team(1,"alan","du",123456,"213@asd.com",true));
        this.teamRepository.save(new Team(2,"Bob","cc",53421,"red@gmail.com",true));
        this.teamRepository.save(new Team(3,"Lina","Wayne",64532,"lina@gmail.com",false));
    }
}
