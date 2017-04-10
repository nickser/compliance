package com.example.repositories.mongo;

import com.example.entities.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, Long> {
    public List<Player> findByFirstName(String firstName);
    public List<Player> findByLastName(String lastName);
    public Player findById(String id);

//    public Player findPlayer(String lastName);
}
