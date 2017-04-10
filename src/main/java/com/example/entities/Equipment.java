package com.example.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int equipId;
    private String type;
    private Date installDate;
    private String color;
    private Integer working;
    private String location;

    public Equipment() {
    }

    public Equipment(String type, Date installDate, String color, Integer working, String location) {
        this.type = type;
        this.installDate = installDate;
        this.color = color;
        this.working = working;
        this.location = location;
    }

    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWorking() {
        return working;
    }

    public void setWorking(Integer working) {
        this.working = working;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        if (equipId != equipment.equipId) return false;
        if (type != null ? !type.equals(equipment.type) : equipment.type != null) return false;
        if (installDate != null ? !installDate.equals(equipment.installDate) : equipment.installDate != null)
            return false;
        if (color != null ? !color.equals(equipment.color) : equipment.color != null) return false;
        if (working != null ? !working.equals(equipment.working) : equipment.working != null) return false;
        if (location != null ? !location.equals(equipment.location) : equipment.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = equipId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (installDate != null ? installDate.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (working != null ? working.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format(
                "Equipment[equipId=%s, type='%s', installDate='%s', color='%s', working='%s', location='%s']",
                equipId, type, installDate, color, working, location);
    }
}
