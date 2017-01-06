package th.ac.met.enumm;

/**
 * Created by Admin on 6/1/2560.
 */
public class enummClass {
    public enum Gender{Man,Girl, Combind,}

    public static void main(String[] args) {
        System.out.println("This class for Enumerator");
        System.out.println("Gender Man = " + Gender.Girl.ordinal());
    }
}
