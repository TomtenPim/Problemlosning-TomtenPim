import javax.swing.*;
import java.util.Locale;

public class Uppgift2 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Turn to camelCase");
        String camel = camelCase(s);
        JOptionPane.showMessageDialog(null, "Du skrev in\n" + s);
        JOptionPane.showMessageDialog(null, "Med camelCase blir detta\n" + camel);
    }

    private static String camelCase(String s) {
        String temp = "";

        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i) ==  32){
                i++;
                temp += s.toUpperCase(Locale.ROOT).charAt(i);
            }
            else {
                temp += s.toLowerCase(Locale.ROOT).charAt(i);
            }
        }

        return new String (temp);

    }
}
