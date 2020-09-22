package com.rmit.sept.tues630.group3.majorproject.services;


import com.rmit.sept.tues630.group3.majorproject.Repository.AccountRepository;

import com.rmit.sept.tues630.group3.majorproject.Repository.ScheduleRepository;
import com.rmit.sept.tues630.group3.majorproject.Repository.TeamRepository;
import com.rmit.sept.tues630.group3.majorproject.model.Account;
import com.rmit.sept.tues630.group3.majorproject.model.Schedule;
import com.rmit.sept.tues630.group3.majorproject.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;

    public Account saveOrUpdateAccount(Account account){

        //Business logic

        return accountRepository.save(account);
    }
    public Team saveOrUpdateAcount(Team team){

        return (Team) teamRepository.save(team);
    }

    public Schedule saveOrUpdateSchedule(Schedule schedule){

        return (Schedule) scheduleRepository.save(schedule);
    }
}
