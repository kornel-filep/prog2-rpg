package com.unideb.epam.rpg.domain.monster;

import com.unideb.epam.rpg.domain.Entity;

public abstract class Monster extends Entity {
    private final int XpReward;

    public Monster(String name, int maxHP, int currentHp, int attackDamage, int xpReward) {
        super(name, maxHP, currentHp, attackDamage);
        XpReward = xpReward;
    }

    public int getXpReward() {
        return XpReward;
    }
}
