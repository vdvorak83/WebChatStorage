package ru.shumilin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import ru.shumilin.entity.User;

import java.util.List;

//public interface UsersRepository extends CrudRepository<User,Long> {
//    User findOneByLoginAndPassword(String login,String password);
//}
public interface UsersRepository extends JpaRepository<User,Long> {
//    UserDetails findByLogin(String login);
    UserDetails findByLogin(String login);
}
