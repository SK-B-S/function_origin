package bean;

import java.io.Serializable;
import java.util.Date;

public class Prcsr implements Serializable {
    private int acntId; // アカウントID
    private String pchrName; // 処理者名
    private String pchrTel; // 電話番号
    private String pchrPst; // 郵便番号
    private String pchrAddr; // 住所
    private Date pchrBd; // 誕生日
    private String pchrIco; // アイコン画像のパス
    private boolean pchrDelFla; // 削除フラグ (デフォルト: false)

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public String getPchrName() {
        return pchrName;
    }

    public void setPchrName(String pchrName) {
        this.pchrName = pchrName;
    }

    public String getPchrTel() {
        return pchrTel;
    }

    public void setPchrTel(String pchrTel) {
        this.pchrTel = pchrTel;
    }

    public String getPchrPst() {
        return pchrPst;
    }

    public void setPchrPst(String pchrPst) {
        this.pchrPst = pchrPst;
    }

    public String getPchrAddr() {
        return pchrAddr;
    }

    public void setPchrAddr(String pchrAddr) {
        this.pchrAddr = pchrAddr;
    }

    public Date getPchrBd() {
        return pchrBd;
    }

    public void setPchrBd(Date pchrBd) {
        this.pchrBd = pchrBd;
    }

    public String getPchrIco() {
        return pchrIco;
    }

    public void setPchrIco(String pchrIco) {
        this.pchrIco = pchrIco;
    }

    public boolean isPchrDelFla() {
        return pchrDelFla;
    }

    public void setPchrDelFla(boolean pchrDelFla) {
        this.pchrDelFla = pchrDelFla;
    }
}
