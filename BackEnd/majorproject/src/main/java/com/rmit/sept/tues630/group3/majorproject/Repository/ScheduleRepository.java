package com.rmit.sept.tues630.group3.majorproject.Repository;


import com.rmit.sept.tues630.group3.majorproject.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    Schedule findScheduleById(int id);
    @Override
    Iterable<Schedule> findAll();
}
