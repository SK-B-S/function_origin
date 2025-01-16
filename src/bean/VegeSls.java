package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VegeSls implements Serializable {
    private int vegeSlsId; // 野菜販売ID
    private int acntId; // アカウントID (FMRの参照)
    private int vegeId; // 野菜ID (VEGEの参照)
    private Date vegeSlsMonth; // 販売月
    private BigDecimal vegePrcds; // 販売額

    public int getVegeSlsId() {
        return vegeSlsId;
    }

    public void setVegeSlsId(int vegeSlsId) {
        this.vegeSlsId = vegeSlsId;
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

    public Date getVegeSlsMonth() {
        return vegeSlsMonth;
    }

    public void setVegeSlsMonth(Date vegeSlsMonth) {
        this.vegeSlsMonth = vegeSlsMonth;
    }

    public BigDecimal getVegePrcds() {
        return vegePrcds;
    }

    public void setVegePrcds(BigDecimal vegePrcds) {
        this.vegePrcds = vegePrcds;
    }
}
