package bean;

import java.io.Serializable;
import java.util.Date;

public class Fmr implements Serializable {
    private int acntId; // アカウントID
    private String fmrName; // 氏名
    private String fmrTel; // 電話番号
    private String fmrPst; // 郵便番号
    private String fmrAddr; // 住所
    private Date fmrBd; // 誕生日
    private String fmrIco; // アイコン画像のパス
    private boolean fmrDelFla; // 削除フラグ (デフォルト: false)
    private boolean prfFla; // プロフィールフラグ (デフォルト: false)
    private boolean jasFla; // JASフラグ (デフォルト: false)

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public String getFmrName() {
        return fmrName;
    }

    public void setFmrName(String fmrName) {
        this.fmrName = fmrName;
    }

    public String getFmrTel() {
        return fmrTel;
    }

    public void setFmrTel(String fmrTel) {
        this.fmrTel = fmrTel;
    }

    public String getFmrPst() {
        return fmrPst;
    }

    public void setFmrPst(String fmrPst) {
        this.fmrPst = fmrPst;
    }

    public String getFmrAddr() {
        return fmrAddr;
    }

    public void setFmrAddr(String fmrAddr) {
        this.fmrAddr = fmrAddr;
    }

    public Date getFmrBd() {
        return fmrBd;
    }

    public void setFmrBd(Date fmrBd) {
        this.fmrBd = fmrBd;
    }

    public String getFmrIco() {
        return fmrIco;
    }

    public void setFmrIco(String fmrIco) {
        this.fmrIco = fmrIco;
    }

    public boolean isFmrDelFla() {
        return fmrDelFla;
    }

    public void setFmrDelFla(boolean fmrDelFla) {
        this.fmrDelFla = fmrDelFla;
    }

    public boolean isPrfFla() {
        return prfFla;
    }

    public void setPrfFla(boolean prfFla) {
        this.prfFla = prfFla;
    }

    public boolean isJasFla() {
        return jasFla;
    }

    public void setJasFla(boolean jasFla) {
        this.jasFla = jasFla;
    }
}
