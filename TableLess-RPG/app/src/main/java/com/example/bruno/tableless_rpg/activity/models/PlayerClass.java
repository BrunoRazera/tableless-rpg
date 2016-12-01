package com.example.bruno.tableless_rpg.activity.models;

import java.util.List;

/**
 * Created by bruno on 27/10/16.
 */
public class PlayerClass {
    private String name;
    private int classLevel;
    private List<SpecialHabilities> specialHabilities;
    private String requirements;
    private String description;
    private int baseAtackBonus;
    private int fortitude;
    private int reflexes;
    private int will;
    private int spellcap; // valor base de magias conjuradas por dia.
    private List<Spell> classSpells; // magias conhecidas da classe.

    public PlayerClass(String name, int classLevel, List<SpecialHabilities> specialHabilities, String requirements, String description, int baseAtackBonus, int fortitude, int reflexes, int will, int spellcap, List<Spell> classSpells) {
        this.name = name;
        this.classLevel = classLevel;
        this.specialHabilities = specialHabilities;
        this.requirements = requirements;
        this.description = description;
        this.baseAtackBonus = baseAtackBonus;
        this.fortitude = fortitude;
        this.reflexes = reflexes;
        this.will = will;
        this.spellcap = spellcap;
        this.classSpells = classSpells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public List<SpecialHabilities> getSpecialHabilities() {
        return specialHabilities;
    }

    public void setSpecialHabilities(List<SpecialHabilities> specialHabilities) {
        this.specialHabilities = specialHabilities;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBaseAtackBonus() {
        return baseAtackBonus;
    }

    public void setBaseAtackBonus(int baseAtackBonus) {
        this.baseAtackBonus = baseAtackBonus;
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

    public int getSpellcap() {
        return spellcap;
    }

    public void setSpellcap(int spellcap) {
        this.spellcap = spellcap;
    }

    public List<Spell> getClassSpells() {
        return classSpells;
    }

    public void setClassSpells(List<Spell> classSpells) {
        this.classSpells = classSpells;
    }
}
