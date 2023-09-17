package com.balldance.baller.service;

import com.balldance.baller.model.User;
import com.balldance.baller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository mUserRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        mUserRepository = userRepository;
    }

    public User addUser(User user) {
        return mUserRepository.save(user);
    }

    public User getUser(long id) {
        return mUserRepository.findById(id).get();
    }

    public User uppdateUser(User user) {
        if (mUserRepository.existsById(user.getId())) {
            return mUserRepository.save(user);
        }
        return null;
    }

    public void deleteUser(User user) {
        mUserRepository.delete(user);
    }
}
