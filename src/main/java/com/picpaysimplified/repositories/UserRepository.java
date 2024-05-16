package com.picpaysimplified.repositories;

import com.picpaysimplified.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //O método é implementado automaticamente pelo JPA por conta das keyWords "Find" o "Classe" "By" "chave" - Nesse caso Find user By Document
    //O tipo do método é Optional<User> para que, se não houver dado correpondente, o mesmo possa retornar sem erros
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(String document);
}
