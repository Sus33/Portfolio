package am.bank.banksystem.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class CurrentUser extends User {

    private am.bank.banksystem.model.User user;

    public CurrentUser( am.bank.banksystem.model.User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user = user;
    }

    public am.bank.banksystem.model.User  getUser() {
        return user;
    }

    public int getId() {
        return user.getId();
    }
}
