import parcs.*;

public class DFS implements AM {
    private static final int NODES = 2;

    private boolean Fantastic(int x) {
        long xNew = x;
        long Sum = 0;
        long Mul = 1;
        
        while (xNew > 0) {
            long y = xNew % 10;
            Sum = Sum + y;
            Mul = Mul * y;
            xNew = xNew / 10;
        }
        if (Sum == Mul) return true;
        return false;
    }

    public void run(AMInfo info) {
        Node n = (Node) info.parent.readObject();
        System.out.println("[" + n.getL() + " " + n.getR() + "] Build started.");

        long sum = 0L;
        int start = n.getL();
        while (start % (2 * NODES) != n.getDiv()) start++;
        for (int i = start; i <= n.getR(); i += 2 * NODES) {
            if (Fantastic(i)) sum += i;
        }
        System.out.println("[" + n.getL() + " " + n.getR() + "] Build finished.");
        info.parent.write(sum);
    }
}
