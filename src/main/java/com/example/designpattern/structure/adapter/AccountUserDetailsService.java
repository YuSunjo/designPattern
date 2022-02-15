package com.example.designpattern.structure.adapter;

public class AccountUserDetailsService implements UserDetailService{

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        accountService.findAccountByUsername(username);
        return null;
    }
}
