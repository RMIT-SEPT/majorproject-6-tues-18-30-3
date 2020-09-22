package com.rmit.sept.tues630.group3.majorproject.Repository;

import com.rmit.sept.tues630.group3.majorproject.model.Account;
import com.rmit.sept.tues630.group3.majorproject.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findTeamById(int id);

    @Override
    Iterable<Team> findAll();
}
