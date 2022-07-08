import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord {
	public RandomWord() { }
    /**
     * Reads in a sequence of strings from standard input, shuffles
     * them, and prints out the results.
     *
     * @param args the command-line arguments
     */
	public static void main(String[] args) {
		String challenger = "";
        String champ = StdIn.readString();
        //StdOut.println(champ);

        int count = 1;
        while (!StdIn.isEmpty()) {
            count++;
            challenger = StdIn.readString();

        if (StdRandom.bernoulli((1.0/count))) {
            champ = challenger;
            }
        }
         StdOut.println(champ);     
	}
}


