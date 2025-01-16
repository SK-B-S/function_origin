package bean;

import java.io.Serializable;

public class Cart implements Serializable {
    private int cartId; // カートID
    private int acntId; // アカウントID (PRCSRの参照)
    private int gdsId; // 商品ID (GDSの参照)
    private int cartQua; // カート内商品数量

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public int getGdsId() {
        return gdsId;
    }

    public void setGdsId(int gdsId) {
        this.gdsId = gdsId;
    }

    public int getCartQua() {
        return cartQua;
    }

    public void setCartQua(int cartQua) {
        this.cartQua = cartQua;
    }
}
