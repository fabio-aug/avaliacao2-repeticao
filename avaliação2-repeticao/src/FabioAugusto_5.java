import javax.swing.*;

public class FabioAugusto_5 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes o amigo apertou o interruptor? "));
            boolean lampada1 = false, lampada2 = false;
            for (int i = 0; i < quantidade; i++) {
                int value = Integer.parseInt(JOptionPane.showInputDialog("Qual interruptor foi apertado?\n1 - L1\n2 - L2"));
                if (value == 1) {
                    lampada1 = !lampada1;
                } else if (value == 2) {
                    lampada1 = !lampada1;
                    lampada2 = !lampada2;
                }
            }
            if (lampada1) {
                JOptionPane.showMessageDialog(null, "Lâmpada 1 - Ligada\nLâmpada 2 - Desligada");
            } else if (lampada2) {
                JOptionPane.showMessageDialog(null, "Lâmpada 1 - Desligada\nLâmpada 2 - Ligada");
            } else if (lampada1 && lampada2) {
                JOptionPane.showMessageDialog(null, "Lâmpada 1 - Ligadas\nLâmpada 2 - Ligadas");
            } else {
                JOptionPane.showMessageDialog(null, "Lâmpada 1 - Desligada\nLâmpada 2 - Desligadas");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!!!");
        }
    }
}
