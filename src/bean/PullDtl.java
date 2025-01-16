package bean;

import java.io.Serializable;

public class PullDtl implements Serializable {
    private int pulDtlNum; // 出金明細番号
    private int pulSlipNum; // 出金伝票番号 (PULの参照)
    private int acntId; // アカウントID (PRCSRの参照)

    public int getPulDtlNum() {
        return pulDtlNum;
    }

    public void setPulDtlNum(int pulDtlNum) {
        this.pulDtlNum = pulDtlNum;
    }

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
