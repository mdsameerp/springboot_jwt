package com.ipigeon.app.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ipigeon.app.models.AuthenticationRequest;
import com.ipigeon.app.models.AuthenticationResponse;
import com.ipigeon.app.service.MyUserDetailsService;
import com.ipigeon.app.util.JwtUtil;

@RestController
class HelloWorldController {

	

	@RequestMapping({ "/hello" })
	public String firstPage() {
		
		return "Hello World";
	}

	

}