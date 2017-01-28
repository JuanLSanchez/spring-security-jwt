package es.juanlsanchez.springsecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.juanlsanchez.springsecurityjwt.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

  public Optional<User> findOneByLogin(String login);

}
