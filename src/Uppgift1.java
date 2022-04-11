import javax.swing.*;

public class Uppgift1 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv int test");
        String r = reverse(s);

        JOptionPane.showMessageDialog(null,s);
        JOptionPane.showMessageDialog(null,r);
    }

    private static String reverse(String s) {
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp += s.charAt(s.length() - 1 - i);
        }

        return new String (temp);

        }
    }
