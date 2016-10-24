package com.example.bruno.tableless_rpg.activity.models;

/**
 * Created by bruno on 24/10/16.
 */
public class Base {
    private int strength;
    private int dexterity;
    private int constitution;
    private int inteligence;
    private int wisdom;
    private int charisma;
    private int initiative;
    private int hitPoints;
    private int armorClass;
    private int touchArmorClass;
    private int flatFootedArmorClass;
    private int fortitude;
    private int reflexes;
    private int will;
    private int spellResistence;
    private int baseAtackBonus;
    private int grapple;

    public Base(int strength, int dexterity, int constitution, int inteligence, int wisdom, int charisma, int initiative, int hitPoints, int armorClass, int touchArmorClass, int flatFootedArmorClass, int fortitude, int reflexes, int will, int spellResistence, int baseAtackBonus, int grapple) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.inteligence = inteligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.initiative = initiative;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.touchArmorClass = touchArmorClass;
        this.flatFootedArmorClass = flatFootedArmorClass;
        this.fortitude = fortitude;
        this.reflexes = reflexes;
        this.will = will;
        this.spellResistence = spellResistence;
        this.baseAtackBonus = baseAtackBonus;
        this.grapple = grapple;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getTouchArmorClass() {
        return touchArmorClass;
    }

    public void setTouchArmorClass(int touchArmorClass) {
        this.touchArmorClass = touchArmorClass;
    }

    public int getFlatFootedArmorClass() {
        return flatFootedArmorClass;
    }

    public void setFlatFootedArmorClass(int flatFootedArmorClass) {
        this.flatFootedArmorClass = flatFootedArmorClass;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getReflexes() {
        return reflexes;
    }

    public void setReflexes(int reflexes) {
        this.reflexes = reflexes;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getSpellResistence() {
        return spellResistence;
    }

    public void setSpellResistence(int spellResistence) {
        this.spellResistence = spellResistence;
    }

    public int getBaseAtackBonus() {
        return baseAtackBonus;
    }

    public void setBaseAtackBonus(int baseAtackBonus) {
        this.baseAtackBonus = baseAtackBonus;
    }

    public int getGrapple() {
        return grapple;
    }

    public void setGrapple(int grapple) {
        this.grapple = grapple;
    }
}
