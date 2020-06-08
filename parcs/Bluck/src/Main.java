import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("got here");
        Scanner sc = new Scanner(new File("../out/input"));
        int l = sc.nextInt();
        System.out.println(l);
        int r = sc.nextInt();
        System.out.println(r);
        Node n = new Node(l, r, 0);
        System.out.println("[" + n.getL() + " " + n.getR() + "] Build started.");

        long sum = 0L;
        long time = System.currentTimeMillis();
        for (int i = n.getL(); i <= n.getR(); i++) {
            if (Fantastic(i)) sum+=i;
        }
        System.out.println("[" + sum + "] Build finished. Execution time: " + (System.currentTimeMillis() - time)/1000.0 + "s");
    }
}
