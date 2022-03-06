package com.cydeo.banksimulation.service;

import com.cydeo.banksimulation.entity.Account;
import com.cydeo.banksimulation.enums.AccountType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    Account createNewAccount(BigDecimal balanca, Date creationDate, AccountType accountType, Long userId);
    List<Account> listAllAccount();
}
