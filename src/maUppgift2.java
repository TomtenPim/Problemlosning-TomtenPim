import javax.swing.*;

public class maUppgift2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Välj ett tal"));
        String prim = "";

        for(double i = 2; i < N; i++){
            int ejPrim = 0;
            for(double j = 2; j < i; j++){
                if(i/j == Math.floor(i/j)){
                    ejPrim++;
                }
            }
            if(ejPrim == 0){
                prim += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, prim);
    }
}
