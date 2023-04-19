package com.contactmanager.contactmanager.config;

import com.contactmanager.contactmanager.entity.User;
import com.contactmanager.contactmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =  userRepository.getUserByName(username);
        if (user==null){
            throw new UsernameNotFoundException("User is not found in our system!!!");
        }

        CustomeUserDetail customeUserDetail = new CustomeUserDetail(user);

        return customeUserDetail;
    }
}
