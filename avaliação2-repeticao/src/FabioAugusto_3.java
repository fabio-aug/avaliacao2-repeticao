import javax.swing.*;

public class FabioAugusto_3 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
            int somatorio = 0, escopo = numero;
            while (escopo > 0) {
                somatorio = (numero % escopo == 0) ? (somatorio + escopo) : escopo;
                escopo--;
            }
            if (somatorio % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é um irmão par");
            } else {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é um irmão ímpar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!!!");
        }
    }
}
