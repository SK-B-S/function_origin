package bean;

import java.io.Serializable;
import java.util.Date;

public class FmrCert implements Serializable {
    private int prfId; // 証明ID
    private int acntId; // アカウントID (FMRの参照)
    private int adtId; // 承認状態ID (ADMIT_STAの参照)
    private Date prfXpry; // 期限日
    private String prfImg; // 画像パス
    private String prfRsm; // 理由

    public int getPrfId() {
        return prfId;
    }

    public void setPrfId(int prfId) {
        this.prfId = prfId;
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

    public Date getPrfXpry() {
        return prfXpry;
    }

    public void setPrfXpry(Date prfXpry) {
        this.prfXpry = prfXpry;
    }

    public String getPrfImg() {
        return prfImg;
    }

    public void setPrfImg(String prfImg) {
        this.prfImg = prfImg;
    }

    public String getPrfRsm() {
        return prfRsm;
    }

    public void setPrfRsm(String prfRsm) {
        this.prfRsm = prfRsm;
    }
}
