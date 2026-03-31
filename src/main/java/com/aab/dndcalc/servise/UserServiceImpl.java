package com.aab.dndcalc.servise;

import com.aab.dndcalc.model.User;
import com.aab.dndcalc.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;

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
}
