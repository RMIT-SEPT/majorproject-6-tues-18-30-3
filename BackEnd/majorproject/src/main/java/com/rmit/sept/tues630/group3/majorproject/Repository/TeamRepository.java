package com.rmit.sept.tues630.group3.majorproject.Repository;


import com.rmit.sept.tues630.group3.majorproject.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findTeamById(int id);

    @Override
    Iterable<Team> findAll();
}