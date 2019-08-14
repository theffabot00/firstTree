
import java.util.*;

public class randomString {

    private boolean b = false;
    public randomString() {
        
    }

    // public static void main(String[] args) {
    //     System.out.println(formRandom());
    // }

    public String formRandom() {
        String i = Integer.toString( (int) (Math.random() * 10000000) );

        String s = "";
        for (int n = 0; n != i.length(); n++) {

            int c = Character.getNumericValue(i.charAt(n));
            switch(c) {
                case(0):
                    s += "a";
                    break;
                case(1):
                    s += "b";
                    break;
                case(2):
                    s += "c";
                    break;
                case(3):
                    s += "d";
                    break;
                case(4):
                    s += "e";
                    break;
                case(5):
                    s += "f";
                    break;
                case(6):
                    s += "g";
                    break;
                case(7):
                    s += "h";
                    break;
                case(8):
                    s += "i";
                    break;
                case(9):
                    s += "j";
                    break;
                        
            }

        }
        return(s);
    }
}