package bean;

import java.io.Serializable;

public class PullDtlGds implements Serializable {
    private int pulDtlGdsNum; // 出金明細商品番号
    private int pulDtlNum; // 出金明細番号 (PUL_DTLの参照)
    private int odrDtlNum; // 注文明細番号 (ODR_DTLの参照)

    public int getPulDtlGdsNum() {
        return pulDtlGdsNum;
    }

    public void setPulDtlGdsNum(int pulDtlGdsNum) {
        this.pulDtlGdsNum = pulDtlGdsNum;
    }

    public int getPulDtlNum() {
        return pulDtlNum;
    }

    public void setPulDtlNum(int pulDtlNum) {
        this.pulDtlNum = pulDtlNum;
    }

    public int getOdrDtlNum() {
        return odrDtlNum;
    }

    public void setOdrDtlNum(int odrDtlNum) {
        this.odrDtlNum = odrDtlNum;
    }
}
