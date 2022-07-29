package com.ironhack.edgeservice.service.impl;

import com.ironhack.edgeservice.model.User;
import com.ironhack.edgeservice.repository.interfaces.EdgeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private EdgeUserRepository edgeUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> optionalUser = edgeUserRepository.findByUsername(username);

        if(!optionalUser.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }

        return optionalUser.get();
    }

}
