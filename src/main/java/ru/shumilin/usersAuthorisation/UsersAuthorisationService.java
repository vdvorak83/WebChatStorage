package ru.shumilin.usersAuthorisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.shumilin.repository.UsersRepository;

@Service
public class UsersAuthorisationService implements UserDetailsService{
    @Autowired
    UsersRepository usersRepository;

//    public boolean loadUserByLogin(String login){
//        return null != usersRepository.findByLogin(login);
//    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return usersRepository.findByLogin(login);
    }
}
