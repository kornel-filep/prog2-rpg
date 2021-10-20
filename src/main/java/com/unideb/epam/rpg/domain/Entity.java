package com.unideb.epam.rpg.domain;

public abstract class Entity {
    protected String name;
    protected int maxHP;
    protected int currentHp;
    protected int attackDamage;

    public Entity(String name, int maxHP, int attackDamage) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHp = maxHP;
        this.attackDamage = attackDamage;
    }

    public void attack(Entity toAttackThis) {
        System.out.println(name + " attacks " + toAttackThis.name);
        toAttackThis.setCurrentHp(
                toAttackThis.getCurrentHp() - this.getAttackDamage()
        );
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

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", currentHp=" + currentHp +
                ", attackDamage=" + attackDamage +
                '}';
    }
}
