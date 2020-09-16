package com.rmit.sept.tues630.group3.majorproject.Repository;



import com.rmit.sept.tues630.group3.majorproject.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    @Override
    Iterable<Account> findAllById(Iterable<Long> iterable);
}
