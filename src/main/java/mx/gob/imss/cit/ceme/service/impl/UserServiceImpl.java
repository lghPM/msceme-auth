package mx.gob.imss.cit.ceme.service.impl;

import mx.gob.imss.cit.ceme.repository.UserRepository;
import mx.gob.imss.cit.ceme.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
    private final UserRepository userRepository;
    
    @Override
    public UserDetailsService userDetailsService() {
    	
        return new UserDetailsService() {
        	
            @Override
            public UserDetails loadUserByUsername(String username) {
            	
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }
}
