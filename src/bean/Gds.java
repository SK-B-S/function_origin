package bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Gds implements Serializable {
    private int gdsId; // 商品ID
    private int untId; // 単位ID
    private int acntId; // アカウントID (FMRの参照)
    private int vegeId; // 野菜ID
    private int qua; // 数量
    private String gdsName; // 商品名
    private String gdsImage; // 商品画像パス
    private BigDecimal price; // 価格
    private String gdsExp; // 商品説明
    private int restStk; // 残り在庫
    private int displayStk; // 表示在庫
    private boolean lowFlag; // 在庫不足フラグ (デフォルト: false)

    public int getGdsId() {
        return gdsId;
    }

    public void setGdsId(int gdsId) {
        this.gdsId = gdsId;
    }

    public int getUntId() {
        return untId;
    }

    public void setUntId(int untId) {
        this.untId = untId;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public int getVegeId() {
        return vegeId;
    }

    public void setVegeId(int vegeId) {
        this.vegeId = vegeId;
    }

    public int getQua() {
        return qua;
    }

    public void setQua(int qua) {
        this.qua = qua;
    }

    public String getGdsName() {
        return gdsName;
    }

    public void setGdsName(String gdsName) {
        this.gdsName = gdsName;
    }

    public String getGdsImage() {
        return gdsImage;
    }

    public void setGdsImage(String gdsImage) {
        this.gdsImage = gdsImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGdsExp() {
        return gdsExp;
    }

    public void setGdsExp(String gdsExp) {
        this.gdsExp = gdsExp;
    }

    public int getRestStk() {
        return restStk;
    }

    public void setRestStk(int restStk) {
        this.restStk = restStk;
    }

    public int getDisplayStk() {
        return displayStk;
    }

    public void setDisplayStk(int displayStk) {
        this.displayStk = displayStk;
    }

    public boolean isLowFlag() {
        return lowFlag;
    }

    public void setLowFlag(boolean lowFlag) {
        this.lowFlag = lowFlag;
    }
}
