package bean;

import java.io.Serializable;
import java.util.Date;

public class Put implements Serializable {
    private int putSlipNum; // 入金伝票番号
    private int acntId; // アカウントID (FMRの参照)
    private Date putDate; // 入金日

    public int getPutSlipNum() {
        return putSlipNum;
    }

    public void setPutSlipNum(int putSlipNum) {
        this.putSlipNum = putSlipNum;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public Date getPutDate() {
        return putDate;
    }

    public void setPutDate(Date putDate) {
        this.putDate = putDate;
    }
}
