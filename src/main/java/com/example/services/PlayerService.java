package com.example.services;

import com.example.entities.Player;
import com.example.repositories.mongo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    // fetch all customers
    public List<Player> fetchAllPlayers() {
        System.out.println(playerRepository.findAll());
        return playerRepository.findAll();
    }

    public List<Player> findByFirstName(String firstName) {
        List<Player> players = playerRepository.findByFirstName(firstName);
        return players;
    }

    public void updatePlayer(Player player){
        playerRepository.save(player);
    }

    public void deletePlayer(String id){
        Player player = playerRepository.findById(id);
        if(player != null) {
            playerRepository.delete(player);
        }
    }
}
