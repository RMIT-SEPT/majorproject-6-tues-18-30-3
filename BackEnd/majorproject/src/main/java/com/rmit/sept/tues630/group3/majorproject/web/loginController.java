//package com.rmit.sept.tues630.group3.majorproject.web;
//
//import com.rmit.sept.tues630.group3.majorproject.Repository.AccountRepository;
//import com.rmit.sept.tues630.group3.majorproject.model.Account;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/login")
//@CrossOrigin
//public class loginController {
//
//    @PostMapping(value = "",headers = "accept=application/json")
//    public ResponseEntity<?> loginAccount(@Valid @RequestBody Account account, BindingResult result){
//        if (result.hasErrors()){
//            Map<String, String> errorMap = new HashMap<>();
//            for(FieldError error : result.getFieldErrors()) {
//                return new ResponseEntity<List<FieldError>>(result.getFieldErrors(), HttpStatus.BAD_REQUEST);
//            }
//        }
//        Account account1 = AccountRepository.findAccountByUsername(account.getUsername());
//        if (account1!=null) {
//            return new ResponseEntity<Account>(account1, HttpStatus.OK);
//        }
//        else {
//            return new ResponseEntity<Account>(account1, HttpStatusatus.BAD_REQUEST);
//        }
//    }
//}
