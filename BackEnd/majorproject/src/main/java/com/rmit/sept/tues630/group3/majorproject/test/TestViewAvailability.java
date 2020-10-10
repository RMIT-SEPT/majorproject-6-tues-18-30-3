package com.rmit.sept.tues630.group3.majorproject.test;


import com.rmit.sept.tues630.group3.majorproject.model.Team;
import com.rmit.sept.tues630.group3.majorproject.services.TeamManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestViewAvailability {
    Team account1;
    Team account2;
    TeamManagement ma = new TeamManagement();
    @BeforeEach
    public void setup(){
        account1 = new Team(1,"Alan","Du", 123123, "000", true);
        account2 = new Team(2,"Tommy","Ao", 111111, "123", false);
    }

    @Test
    public void Test_Success_CheckingTheAvailabilityOfWorkers(){
        Assertions.assertEquals(true, ma.Is_Available(account1));
    }
    @Test
    public void Test_Success_CheckingUnavailableWorker(){
        Assertions.assertEquals(false, ma.Is_Available(account2));
    }

}
