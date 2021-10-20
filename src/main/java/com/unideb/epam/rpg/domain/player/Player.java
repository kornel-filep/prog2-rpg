package com.unideb.epam.rpg.domain.player;

import com.unideb.epam.rpg.domain.Entity;

public abstract class Player extends Entity {
    private int xpToLevelUp;
    private int currentXp;
    private int hpRegen;

    public Player(String name, int maxHP, int currentHp, int attackDamage,
                  int xpToLevelUp, int currentXp, int hpRegen) {
        super(name, maxHP, currentHp, attackDamage);
        this.xpToLevelUp = xpToLevelUp;
        this.currentXp = currentXp;
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
}
