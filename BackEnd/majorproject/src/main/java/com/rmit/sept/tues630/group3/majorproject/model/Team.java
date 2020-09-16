package com.rmit.sept.tues630.group3.majorproject.model;

import com.rmit.sept.tues630.group3.majorproject.model.Account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String firstName;//Set workers' first name as the primary key for the entity
    private String lastName;
    private String phoneNumber;
    private String email;

    public Team( String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Team(){

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


}
