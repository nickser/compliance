package com.example.services;

import com.example.entities.Equipment;
import com.example.repositories.jpa.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    public List<Equipment> fetchAllEquipments() {
        return equipmentRepository.findAll();
    }

    public Equipment getEquipmentById(){
        Equipment equipment = equipmentRepository.findByEquipId(3);
        return equipment;
    }


    public void updateEquipment(Equipment equipment){
        equipmentRepository.save(equipment);
    }

    public void deleteEquipment(int id){
        Equipment equipment = equipmentRepository.findByEquipId(id);
        if(equipment != null) {
            equipmentRepository.delete(equipment);
        }
    }
}
