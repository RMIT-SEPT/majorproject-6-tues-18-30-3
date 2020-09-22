package com.rmit.sept.tues630.group3.majorproject.model;

import javax.persistence.*;


@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "first_name")
    private String firstName;//Set workers' first name as the primary key for the entity

    @Column(name = "last_name")
    private String lastName;
    private long phoneNumber;
    private String email;
    private boolean availability;

    public Team( String firstName, String lastName, long phoneNumber, String email, boolean availability){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.availability = availability;
    }
    public Team(){

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


}
