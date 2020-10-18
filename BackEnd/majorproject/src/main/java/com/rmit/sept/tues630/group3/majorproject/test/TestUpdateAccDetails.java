package com.rmit.sept.tues630.group3.majorproject.test;
import com.rmit.sept.tues630.group3.majorproject.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestUpdateAccDetails {
    Account account1;
    Account account2;
    @BeforeEach
    public void setup(){
        account1 = new Account("Alan","Du", "2215518450", "000", "0342242343", "banking",20.00,4);
        account2 = new Account("Tommy","Ao", "caramel", "000", "0484135441","Banking");

    }
    @Test
    public void Test_Success_UpdatesWorkerDetails(){
        //Updates A worker account
        account1.updateWorkerDetails("Zoom","J", "2215518450", "000", "0000000", "banking",20.00,4);
        Assertions.assertEquals("Zoom",account1.getFirstName());
        Assertions.assertEquals("0000000",account1.getPhoneNumber());
    }
    @Test
    public void Test_Success_UpdatesCustomerDetails(){
        //Updates A customer account
        account2.updateAccountDetails("Arthur","Shelby", "caramel", "000", "0253451312","Banking");
        Assertions.assertEquals("Arthur",account2.getFirstName());
        Assertions.assertEquals("0253451312",account2.getPhoneNumber());
    }
}