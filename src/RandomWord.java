import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        // [WARN] RandomWord.java:8:17: '2' looks like an unnecessary constant. [MagicNumber]
        // [WARN] RandomWord.java:10: Calling 'StdIn.readString()' in more than one place suggests poor design in this program. [Design]
        String champion = StdIn.readString();
        int i = 2;

        while (!StdIn.isEmpty()) {
            String contender = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double) i)) {
                champion = contender;
            }
            i++;
        }
        StdOut.println(champion);
    }    
}
