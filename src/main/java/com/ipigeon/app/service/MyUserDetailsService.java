package com.ipigeon.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ipigeon.app.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository urepo;
	
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//    	String password = ;
    	
    	
    	
    	UserDetails user = User.withUsername("foo@gmail.com")
                .password(new BCryptPasswordEncoder().encode("foo"))
                .roles("USER").build();
    	
    	return user; 
    	
    }
    
    
}