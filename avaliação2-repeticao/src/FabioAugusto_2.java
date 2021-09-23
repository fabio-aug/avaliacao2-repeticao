import javax.swing.*;

public class FabioAugusto_2 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor inteiro: "));
            while (num < 0) {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor positivo: "));
            }
            int resto = num;
            String print = "";
            while (resto > 0) {
                print = String.format("%d%s", resto % 2, print);
                resto = resto / 2;
            }
            JOptionPane.showMessageDialog(null, "O número " + num + " equivale a " + print + " em binário!!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!!!");
        }
    }
}
