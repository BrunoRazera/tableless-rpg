package com.example.bruno.tableless_rpg.activity.models;

/**
 * Created by bruno on 31/10/16.
 */
public class Alignment {
    public String ethic;
    public String moral;

    public Alignment(String ethic, String moral) {
        this.ethic = ethic;
        this.moral = moral;
    }

    public String getEthic() {
        return ethic;
    }

    public void setEthic(String ethic) {
        this.ethic = ethic;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }
}
