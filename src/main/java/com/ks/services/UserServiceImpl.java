package com.ks.services;

import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

//import com.ks.entities.UserRole;
import com.ks.entities.Users;
import com.ks.model.UserRequest;
import com.ks.repositories.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    PasswordEncoder passwordEncoder;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        // TODO Auto-generated method stub
//        return null;
//    }

    @Override
    public void saveUser(UserRequest userRequest) {

        Optional<Users> oUsers = userRepository.findByUsername(userRequest.getUsername());
        if (oUsers.isPresent()) {
            throw new RuntimeException("Username alreaddy exist");
        }
        Users user = new Users();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setRole(userRequest.getRole());
//        user.setRole(userRequest.getRoles().stream().map(role -> {
//            UserRole uRole = new UserRole();
//            uRole.setRole(role);
//            uRole.setUsers(user);
//            return uRole;
//        }).collect(Collectors.toSet()));
        userRepository.save(user);
    }

    @Override
    public void resetPassowr(String username, String newPassword) {

    }

    @Override
    public List<Users> getUsers() {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public Users getUser(String username, String password) {
		Users user = userRepository.findByUsernameAndPassword(username, password);
		return user;
	}

}
