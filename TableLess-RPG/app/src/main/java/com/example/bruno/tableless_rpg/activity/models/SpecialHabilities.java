package com.example.bruno.tableless_rpg.activity.models;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by bruno on 27/10/16.
 */
public class SpecialHabilities {
    private String name;
    private JSONObject efeito;
    private int duration;
    private String requirements;

    public SpecialHabilities(String name, JSONObject efeito, int duration, String requirements) {
        this.name = name;
        this.efeito = efeito;
        this.duration = duration;
        this.requirements = requirements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONObject getEfeito() {
        return efeito;
    }

    public void setEfeito(JSONObject efeito) {
        this.efeito = efeito;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}
