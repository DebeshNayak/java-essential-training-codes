/**
 * Created by debes on 11-01-2017.
 */
public class MathHelper {

    public static double addValues (String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    public static double substractValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    public static double multiplyValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    public static double divideValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

}