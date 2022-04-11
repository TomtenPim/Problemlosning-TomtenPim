import javax.swing.*;

public class maUppgift1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Välj ett tal"));
        int numberout = 0;

        for (int i = 0; i < number; i++){
            numberout += number-i;
        }

        JOptionPane.showMessageDialog(null, numberout);
    }
}
