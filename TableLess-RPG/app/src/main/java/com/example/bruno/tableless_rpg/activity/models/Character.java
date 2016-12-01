package com.example.bruno.tableless_rpg.activity.models;

import android.text.Layout;

import io.realm.RealmObject;

/**
 * Created by bruno on 24/10/16.
 */
public class Character{

    private String name;
    private Player player;
    private Race race;
    private PlayerClass playerClass;
    private Alignment alignment;
    private String deity;
    private String genre;
    private float hight;
    private int weight;
    private int age;
    private int level;
    private String apearence;
    private int xp;
    private String skin;

    public Character(
            String name, Player player, Race race,
            PlayerClass playerClass, Alignment alignment,
            String deity, String genre, float hight,
            int weight, int age, int level, String apearence,
            int xp, String skin, String size
    ) {
        this.name = name;
        this.player = player;
        this.race = race;
        this.playerClass = playerClass;
        this.alignment = alignment;
        this.deity = deity;
        this.genre = genre;
        this.hight = hight;
        this.weight = weight;
        this.age = age;
        this.level = level;
        this.apearence = apearence;
        this.xp = xp;
        this.skin = skin;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getApearence() {
        return apearence;
    }

    public void setApearence(String apearence) {
        this.apearence = apearence;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String size;
}
