package ru.shumilin.repository;

import org.springframework.data.repository.CrudRepository;
import ru.shumilin.entity.User;

public interface UsersRepository extends CrudRepository<User,Long> {
    User findOneByLoginAndPassword(String login,String password);
}
