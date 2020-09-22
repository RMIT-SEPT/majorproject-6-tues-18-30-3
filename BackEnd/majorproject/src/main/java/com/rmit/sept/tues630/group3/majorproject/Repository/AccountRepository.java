package com.rmit.sept.tues630.group3.majorproject.Repository;



import com.rmit.sept.tues630.group3.majorproject.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    static Account findAccountByUsername(String username);
    @Override
    Iterable<Account> findAll();
}
