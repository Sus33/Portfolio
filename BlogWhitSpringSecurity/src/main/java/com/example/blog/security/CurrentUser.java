package com.example.blog.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User {

    private com.example.blog.model.User user;

    public CurrentUser(com.example.blog.model.User user) {
        super (user.getEmail (), user.getPassword (), AuthorityUtils.createAuthorityList (user.getUserType ().name ()));
        this.user = user;
    }

    public com.example.blog.model.User getUser() {
        return user;
    }

    public int getId() {
        return user.getId ();
    }
}
