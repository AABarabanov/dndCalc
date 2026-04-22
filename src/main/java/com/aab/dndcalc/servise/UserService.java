package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.User;

public interface UserService {

    User addUser(User newUser);
    User getUserById(Long id);
    User pullUserById(Long id, User userFromRequest);
    void deleteUserById(Long id);

    User registerUser(String username, String password);
    User findUserByUsername(String username);
    boolean checkIfUsernameExists(String username);

}
