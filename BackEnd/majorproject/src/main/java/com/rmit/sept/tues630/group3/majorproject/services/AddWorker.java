package com.rmit.sept.tues630.group3.majorproject.services;

import com.rmit.sept.tues630.group3.majorproject.model.Account;

import java.util.ArrayList;
import java.util.Collection;

public class AddWorker {
    private ArrayList<Account> teamMembers = new ArrayList<>();

    public AddWorker(Account account){
        teamMembers = new ArrayList<Account>();

    }

    public AddWorker() {

    }

    //Add worker accounts to teamMembers array.
    public void addWorker(Account account){
       if(account == null){
                return;
            }
            else if(account.getAc_type() == "Worker"){
                teamMembers.add(account);
            }else{
                return;
            }

    }
    //Print a hard copy of all workers
    public ArrayList<Account> getAllWorker(){
        ArrayList<Account> workerCopy = new ArrayList<Account>();
        workerCopy.addAll(teamMembers);
        return workerCopy;
    }
}
