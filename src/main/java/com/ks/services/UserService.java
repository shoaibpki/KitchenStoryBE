package com.ks.services;

import java.util.List;

import com.ks.entities.Users;
import com.ks.model.UserRequest;

public interface UserService {

    void saveUser(UserRequest userRequest);

    void resetPassowr(String username, String newPassword);

    List<Users> getUsers();
    
    Users getUser(String username, String password);

	void changeUserPass(Long id, String newPassword);


}
