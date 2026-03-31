package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.User;

public interface UserService {

    User addUser(User newUser);
    User getUserById(Long id);
    User pullUserById(Long id, User userFromRequest);
    void deleteUserById(Long id);

}
