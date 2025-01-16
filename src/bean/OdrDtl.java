package bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OdrDtl implements Serializable {
    private int odrDtlNum; // 注文明細番号
    private String odrGdsName; // 商品名
    private String odrGdsExp; // 商品説明
    private String odrGdsImage; // 商品画像パス
    private String odrVegeName; // 野菜名
    private int odrQua; // 注文数量
    private BigDecimal odrPrice; // 注文単価
    private int cancelQua; // キャンセル数量 (デフォルト: 0)
    private int odrGdsId; // 商品ID (GDSの参照)
    private int odrNum; // 注文番号 (ODRの参照)

    public int getOdrDtlNum() {
        return odrDtlNum;
    }

    public void setOdrDtlNum(int odrDtlNum) {
        this.odrDtlNum = odrDtlNum;
    }

    public String getOdrGdsName() {
        return odrGdsName;
    }

    public void setOdrGdsName(String odrGdsName) {
        this.odrGdsName = odrGdsName;
    }

    public String getOdrGdsExp() {
        return odrGdsExp;
    }

    public void setOdrGdsExp(String odrGdsExp) {
        this.odrGdsExp = odrGdsExp;
    }

    public String getOdrGdsImage() {
        return odrGdsImage;
    }

    public void setOdrGdsImage(String odrGdsImage) {
        this.odrGdsImage = odrGdsImage;
    }

    public String getOdrVegeName() {
        return odrVegeName;
    }

    public void setOdrVegeName(String odrVegeName) {
        this.odrVegeName = odrVegeName;
    }

    public int getOdrQua() {
        return odrQua;
    }

    public void setOdrQua(int odrQua) {
        this.odrQua = odrQua;
    }

    public BigDecimal getOdrPrice() {
        return odrPrice;
    }

    public void setOdrPrice(BigDecimal odrPrice) {
        this.odrPrice = odrPrice;
    }

    public int getCancelQua() {
        return cancelQua;
    }

    public void setCancelQua(int cancelQua) {
        this.cancelQua = cancelQua;
    }

    public int getOdrGdsId() {
        return odrGdsId;
    }

    public void setOdrGdsId(int odrGdsId) {
        this.odrGdsId = odrGdsId;
    }

    public int getOdrNum() {
        return odrNum;
    }

    public void setOdrNum(int odrNum) {
        this.odrNum = odrNum;
    }
}
