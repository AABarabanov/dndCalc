package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.User;
import com.aab.dndcalc.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User addUser(User newUser) {
        return repository.save(newUser);
    }

    @Override
    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User pullUserById(Long id, User userFromRequest) {
        return repository.save(userFromRequest);
    }

    @Override
    public void deleteUserById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User registerUser(String username, String password) {
        if (checkIfUsernameExists(username)) {
            throw new RuntimeException("Username already exists");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        return repository.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return repository.findByUsername(username).orElse(null);
    }

    @Override
    public boolean checkIfUsernameExists(String username) {
        return repository.findByUsername(username).isPresent();
    }
}
