package bean;

import java.io.Serializable;
import java.util.Date;

public class Odr implements Serializable {
    private int odrNum; // 注文番号
    private Date odrDatetime; // 注文日時
    private int acntId; // アカウントID (PRCSRの参照)
    private boolean cancelFlag; // キャンセルフラグ (デフォルト: false)

    public int getOdrNum() {
        return odrNum;
    }

    public void setOdrNum(int odrNum) {
        this.odrNum = odrNum;
    }

    public Date getOdrDatetime() {
        return odrDatetime;
    }

    public void setOdrDatetime(Date odrDatetime) {
        this.odrDatetime = odrDatetime;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public boolean isCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }
}
