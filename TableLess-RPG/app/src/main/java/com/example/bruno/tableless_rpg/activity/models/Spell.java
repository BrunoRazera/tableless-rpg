package com.example.bruno.tableless_rpg.activity.models;

import android.media.effect.Effect;

import java.util.List;

/**
 * Created by bruno on 27/10/16.
 */
public class Spell {
    private String name;
    private String description;
    private String spellSchool;
    private List<Itens> materialComponents;
    private Boolean verbalComponent;
    private Boolean gestualComponent;
    private int castTime;
    private int range; // obs: feetsprivate Boolean verbalComponent;
    private int area;
    private List<SpellEffect> SpellEffects;


}
