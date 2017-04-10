package com.example.controllers;

import com.example.entities.Equipment;
import com.example.entities.Player;
import com.example.services.EquipmentService;
import com.example.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommonController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private EquipmentService equipmentService;

    /**
     * Fetch all players
     */
    @RequestMapping("/players")
    public List<Player> retrievePlayers()
    {
        return playerService.fetchAllPlayers();
    }

    /**
     * Fetch players by first name
     */
    @RequestMapping(method = RequestMethod.GET, path = "/player/{firstName}")
    public List<Player> getPlayersByFirstName(@PathVariable String firstName){
        return playerService.findByFirstName(firstName);
    }

    /**
     * Save player
     */
    @RequestMapping(method = RequestMethod.POST, value = "/player/update")
    public void updatePlayer(@ModelAttribute("input") Player input) {
        playerService.updatePlayer(input);
    }

    /**
     * Remove player
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/player/{id}")
    public void deletePlayer(@PathVariable String id) {
        playerService.deletePlayer(id);
    }

    /**
     * Fetch all equipments
     */
    @RequestMapping("/equipments")
    public List<Equipment> fetchAllEquipments()
    {
        return equipmentService.fetchAllEquipments();
    }

    /**
     * Save equipment
     */
    @RequestMapping(method = RequestMethod.POST, value = "/equipment/update")
    public void updatePlayer(@ModelAttribute("input") Equipment input) {
        equipmentService.updateEquipment(input);
    }

    /**
     * Remove equipment
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/equipment/{id}")
    public void deleteEquipment(@PathVariable int id) {
        equipmentService.deleteEquipment(id);
    }
}
