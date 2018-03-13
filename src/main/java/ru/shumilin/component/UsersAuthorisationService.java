package ru.shumilin.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shumilin.repository.UsersRepository;

@Service
public class UsersAuthorisationService {
    @Autowired
    UsersRepository usersRepository;

    public boolean isCurrectUser(String login,String password){
        return null != usersRepository.findOneByLoginAndPassword(login,password);
    }
}
