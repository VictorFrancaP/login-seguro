package br.pfc.login_seguro.repository;

import br.pfc.login_seguro.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
    User findByEmail(String email);
}
