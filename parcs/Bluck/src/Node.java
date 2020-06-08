import java.io.Serializable;

public class Node implements Serializable {
    private int l;
    private int r;
    private int div;

    public Node(int l, int r, int div) {
        this.l = l;
        this.r = r;
        this.div = div;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }
}
