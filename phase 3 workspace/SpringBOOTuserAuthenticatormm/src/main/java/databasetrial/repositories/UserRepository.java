package databasetrial.repositories;

import org.springframework.data.repository.CrudRepository;

import databasetrial.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}