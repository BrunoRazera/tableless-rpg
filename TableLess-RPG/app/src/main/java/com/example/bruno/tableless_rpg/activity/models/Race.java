package com.example.bruno.tableless_rpg.activity.models;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by bruno on 27/10/16.
 */
public class Race {
    private String name;
    private String description;
    private List<SpecialHabilities> specialHabilities;
    private List<JSONObject> bonusRace;

    public Race(String name, String description, List<SpecialHabilities> specialHabilities, List<JSONObject> bonusRace) {
        this.name = name;
        this.description = description;
        this.specialHabilities = specialHabilities;
        this.bonusRace = bonusRace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SpecialHabilities> getSpecialHabilities() {
        return specialHabilities;
    }

    public void setSpecialHabilities(List<SpecialHabilities> specialHabilities) {
        this.specialHabilities = specialHabilities;
    }

    public List<JSONObject> getBonusRace() {
        return bonusRace;
    }

    public void setBonusRace(List<JSONObject> bonusRace) {
        this.bonusRace = bonusRace;
    }
}
