package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GdsSls implements Serializable {
    private int gdsSlsId; // 商品販売ID
    private int gdsId; // 商品ID (GDSの参照)
    private Date gdsSlsMonth; // 販売月
    private BigDecimal gdsPrcds; // 販売額

    public int getGdsSlsId() {
        return gdsSlsId;
    }

    public void setGdsSlsId(int gdsSlsId) {
        this.gdsSlsId = gdsSlsId;
    }

    public int getGdsId() {
        return gdsId;
    }

    public void setGdsId(int gdsId) {
        this.gdsId = gdsId;
    }

    public Date getGdsSlsMonth() {
        return gdsSlsMonth;
    }

    public void setGdsSlsMonth(Date gdsSlsMonth) {
        this.gdsSlsMonth = gdsSlsMonth;
    }

    public BigDecimal getGdsPrcds() {
        return gdsPrcds;
    }

    public void setGdsPrcds(BigDecimal gdsPrcds) {
        this.gdsPrcds = gdsPrcds;
    }
}
