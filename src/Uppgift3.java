import javax.swing.*;
import java.util.Locale;

public class Uppgift3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Testa om det är en palindrom");
        String r = reverse(s);

        if (s.toLowerCase(Locale.ROOT).equals(r.toLowerCase(Locale.ROOT))){
            JOptionPane.showMessageDialog(null,s + " är en palindrom");
        }
        else
            JOptionPane.showMessageDialog(null,s + " är inte en palindrom");
    }

    private static String reverse(String s) {
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp += s.charAt(s.length() - 1 - i);
        }

        return new String (temp);

    }
}
