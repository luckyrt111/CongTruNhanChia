package congtrunhanchia;

/**
 * Created by DELL on 05/31/17.
 */
public class CongTruNhanChia {
    private int a;
    private  int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int tru(){
        return a - b;
    }

    public int cong(){
        return a + b;
    }

    public int nhan(){
        return a * b;
    }

    public int chia(){
        return a / b;
    }
}
