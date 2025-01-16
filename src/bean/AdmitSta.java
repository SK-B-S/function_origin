package bean;

import java.io.Serializable;

public class AdmitSta implements Serializable {
    private int adtId; // 承認ID
    private String adtSts; // 承認状態

    public int getAdtId() {
        return adtId;
    }

    public void setAdtId(int adtId) {
        this.adtId = adtId;
    }

    public String getAdtSts() {
        return adtSts;
    }

    public void setAdtSts(String adtSts) {
        this.adtSts = adtSts;
    }
}
