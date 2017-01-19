package com.greenfox.jasper.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Verőci Ádám on 2017.01.19..
 */
@Entity
@Table(name = "building")
public class Building {

    @Id
    protected String buildingType;

    protected Integer level;
    protected Integer hp;
    protected Integer buildingGenTime;

    public Building() {
    }

    public Building(String buildingType, Integer level, Integer hp, Integer buildingGenTime) {
        this.buildingType = buildingType;
        this.level = level;
        this.hp = hp;
        this.buildingGenTime = buildingGenTime;
    }

    public Integer getBuildingGenTime() {
        return buildingGenTime;
    }

    public void setBuildingGenTime(Integer buildingGenTime) {
        this.buildingGenTime = buildingGenTime;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }
}
