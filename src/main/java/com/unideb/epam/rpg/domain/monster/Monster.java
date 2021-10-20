package com.unideb.epam.rpg.domain.monster;

import com.unideb.epam.rpg.domain.Entity;

public abstract class Monster extends Entity {
    private final int XpReward;

    public Monster(String name, int maxHP, int attackDamage, int xpReward) {
        super(name, maxHP, attackDamage);
        XpReward = xpReward;
    }

    public int getXpReward() {
        return XpReward;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", currentHp=" + currentHp +
                ", attackDamage=" + attackDamage +
                ", XpReward=" + XpReward +
                '}';
    }
}
