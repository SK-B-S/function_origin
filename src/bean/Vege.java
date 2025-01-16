package bean;

import java.io.Serializable;

public class Vege implements Serializable {
    private int vegeId; // 野菜ID
    private String vegeName; // 野菜名

    public int getVegeId() {
        return vegeId;
    }

    public void setVegeId(int vegeId) {
        this.vegeId = vegeId;
    }

    public String getVegeName() {
        return vegeName;
    }

    public void setVegeName(String vegeName) {
        this.vegeName = vegeName;
    }
}
