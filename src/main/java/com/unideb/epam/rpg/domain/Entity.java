package com.unideb.epam.rpg.domain;

public abstract class Entity {
    private String name;
    private int maxHP;
    private int currentHp;
    private int attackDamage;

    public Entity(String name, int maxHP, int currentHp, int attackDamage) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHp = currentHp;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
}
