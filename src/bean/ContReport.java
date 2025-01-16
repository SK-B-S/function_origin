package bean;

import java.io.Serializable;
import java.util.Date;

public class ContReport implements Serializable {
    private int cntiId; // 申請ID
    private int acntId; // アカウントID (FMRの参照)
    private int adtId; // 承認状態ID (ADMIT_STAの参照)
    private Date cntiXpry; // 期限日
    private String cntiImg; // 画像パス
    private String cntiRsm; // 理由

    public int getCntiId() {
        return cntiId;
    }

    public void setCntiId(int cntiId) {
        this.cntiId = cntiId;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public int getAdtId() {
        return adtId;
    }

    public void setAdtId(int adtId) {
        this.adtId = adtId;
    }

    public Date getCntiXpry() {
        return cntiXpry;
    }

    public void setCntiXpry(Date cntiXpry) {
        this.cntiXpry = cntiXpry;
    }

    public String getCntiImg() {
        return cntiImg;
    }

    public void setCntiImg(String cntiImg) {
        this.cntiImg = cntiImg;
    }

    public String getCntiRsm() {
        return cntiRsm;
    }

    public void setCntiRsm(String cntiRsm) {
        this.cntiRsm = cntiRsm;
    }
}
