package com.rmit.sept.tues630.group3.majorproject.Repository;


import com.rmit.sept.tues630.group3.majorproject.model.Account;
import com.rmit.sept.tues630.group3.majorproject.model.Schedule;
import com.rmit.sept.tues630.group3.majorproject.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    Schedule findScheduleById(int id);
    @Override
    Iterable<Schedule> findAll();
}
