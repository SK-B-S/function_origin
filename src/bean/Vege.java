package bean;

public class Vege {
    private int vegeId;
    private String vegeName;

    // コンストラクタ
    public Vege(int vegeId, String vegeName) {
        this.vegeId = vegeId;
        this.vegeName = vegeName;
    }

    // ゲッターとセッター
    public int getVegeId() {
        return vegeId;
    }

    public void setVegeId(int vegeId) {
        this.vegeId = vegeId;
    }

    public String getVegeName() {
        return vegeName;
    }

    public void setVegeName(String vegeName) {
        this.vegeName = vegeName;
    }
}
