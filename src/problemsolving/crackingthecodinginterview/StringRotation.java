package problemsolving.crackingthecodinginterview;

/**
 * Created by hemants on 26/09/18.
 */
public class StringRotation {

    boolean isSubstring(String one, String another){
        return one.contains(another);
    }

    public static void main(String[] args) {
        StringRotation sr = new StringRotation();
        String a = "waterbottle";
        String b = "erbottlewat";
        System.out.println(sr.isSubstring("hemant", "hem"));
    }
}
