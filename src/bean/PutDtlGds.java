package bean;

import java.io.Serializable;

public class PutDtlGds implements Serializable {
    private int putDtlGdsNum; // 入金明細商品番号
    private int putDtlNum; // 入金明細番号 (PUT_DTLの参照)
    private int odrDtlNum; // 注文明細番号 (ODR_DTLの参照)

    public int getPutDtlGdsNum() {
        return putDtlGdsNum;
    }

    public void setPutDtlGdsNum(int putDtlGdsNum) {
        this.putDtlGdsNum = putDtlGdsNum;
    }

    public int getPutDtlNum() {
        return putDtlNum;
    }

    public void setPutDtlNum(int putDtlNum) {
        this.putDtlNum = putDtlNum;
    }

    public int getOdrDtlNum() {
        return odrDtlNum;
    }

    public void setOdrDtlNum(int odrDtlNum) {
        this.odrDtlNum = odrDtlNum;
    }
}
