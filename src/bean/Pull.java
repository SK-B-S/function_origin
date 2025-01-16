package bean;

import java.io.Serializable;

public class Pull implements Serializable {
    private int pulSlipNum; // 出金伝票番号
    private int acntId; // アカウントID (FMRの参照)

    public int getPulSlipNum() {
        return pulSlipNum;
    }

    public void setPulSlipNum(int pulSlipNum) {
        this.pulSlipNum = pulSlipNum;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }
}
