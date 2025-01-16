package bean;

import java.io.Serializable;

public class PutDtl implements Serializable {
    private int putDtlNum; // 入金明細番号
    private int putSlipNum; // 入金伝票番号 (PUTの参照)
    private int pulSlipNum; // 出金伝票番号 (PULの参照)

    public int getPutDtlNum() {
        return putDtlNum;
    }

    public void setPutDtlNum(int putDtlNum) {
        this.putDtlNum = putDtlNum;
    }

    public int getPutSlipNum() {
        return putSlipNum;
    }

    public void setPutSlipNum(int putSlipNum) {
        this.putSlipNum = putSlipNum;
    }

    public int getPulSlipNum() {
        return pulSlipNum;
    }

    public void setPulSlipNum(int pulSlipNum) {
        this.pulSlipNum = pulSlipNum;
    }
}
