package bean;

import java.io.Serializable;

public class Acnt implements Serializable {
    private int acntId; // アカウントID
    private int usrType; // ユーザータイプ (1, 2, 3)
    private String email; // メールアドレス
    private String pwd; // パスワード
    private boolean adnFla; // 管理者フラグ (デフォルト: false)

    public int getAcntId() {
        return acntId;
    }

    public void setAcntId(int acntId) {
        this.acntId = acntId;
    }

    public int getUsrType() {
        return usrType;
    }

    public void setUsrType(int usrType) {
        this.usrType = usrType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isAdnFla() {
        return adnFla;
    }

    public void setAdnFla(boolean adnFla) {
        this.adnFla = adnFla;
    }
}
