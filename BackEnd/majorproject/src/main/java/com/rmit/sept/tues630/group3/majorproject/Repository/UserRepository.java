package com.rmit.sept.tues630.group3.majorproject.Repository;



import com.rmit.sept.tues630.group3.majorproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}