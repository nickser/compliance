package com.example.repositories.jpa;

import com.example.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    public Equipment findByEquipId(int id);
}
