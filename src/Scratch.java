import edu.princeton.cs.algs4.*;

public class Scratch {
    public static void main(String[] args) {
        System.out.println(StdRandom.uniformDouble());
        QuickFindUF qfuf = new QuickFindUF(10);
        qfuf.union(0, 2);
        qfuf.union(2, 3);
        qfuf.union(1, 3);
        System.out.println(qfuf.connected(0, 1));
        System.out.println(qfuf.find(1));
        System.out.println(qfuf.find(0));
    }
}
