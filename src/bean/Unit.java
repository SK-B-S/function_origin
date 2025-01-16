package bean;

import java.io.Serializable;

public class Unit implements Serializable {
    private int untId; // 単位ID
    private String untName; // 単位名

    public int getUntId() {
        return untId;
    }

    public void setUntId(int untId) {
        this.untId = untId;
    }

    public String getUntName() {
        return untName;
    }

    public void setUntName(String untName) {
        this.untName = untName;
    }
}
