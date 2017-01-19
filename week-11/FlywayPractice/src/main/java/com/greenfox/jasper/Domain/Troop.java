package com.greenfox.jasper.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Verőci Ádám on 2017.01.19..
 */
@Entity
@Table(name = "troop")
public class Troop {
    @Id
    protected String troopType;

    protected Integer hp;
    protected Integer attackPw;
    protected Integer defendPw;
    protected Integer generationTime;
    protected boolean isAlive;

    public Troop() {
    }

    public Troop(String troopType, Integer hp, Integer attackPw, Integer defendPw, Integer generationTime) {
        this.troopType = troopType;
        this.hp = hp;
        this.attackPw = attackPw;
        this.defendPw = defendPw;
        this.generationTime = generationTime;
    }

    public String getTroopType() {
        return troopType;
    }

    public void setTroopType(String troopType) {
        this.troopType = troopType;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttackPw() {
        return attackPw;
    }

    public void setAttackPw(Integer attackPw) {
        this.attackPw = attackPw;
    }

    public Integer getDefendPw() {
        return defendPw;
    }

    public void setDefendPw(Integer defendPw) {
        this.defendPw = defendPw;
    }

    public Integer getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(Integer generationTime) {
        this.generationTime = generationTime;
    }
}

