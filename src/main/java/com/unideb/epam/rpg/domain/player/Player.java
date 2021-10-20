package com.unideb.epam.rpg.domain.player;

import com.unideb.epam.rpg.domain.Entity;

public abstract class Player extends Entity {
    private int xpToLevelUp;
    private int currentXp;
    private int hpRegen;

    public Player(String name, int maxHP, int attackDamage, int hpRegen) {
        super(name, maxHP, attackDamage);
        this.xpToLevelUp = 100;
        this.currentXp = 0;
        this.hpRegen = hpRegen;
    }

    public int getXpToLevelUp() {
        return xpToLevelUp;
    }

    public void setXpToLevelUp(int xpToLevelUp) {
        this.xpToLevelUp = xpToLevelUp;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(int currentXp) {
        this.currentXp = currentXp;
    }

    public int getHpRegen() {
        return hpRegen;
    }

    public void setHpRegen(int hpRegen) {
        this.hpRegen = hpRegen;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", currentHp=" + currentHp +
                ", attackDamage=" + attackDamage +
                ", xpToLevelUp=" + xpToLevelUp +
                ", currentXp=" + currentXp +
                ", hpRegen=" + hpRegen +
                '}';
    }
}
