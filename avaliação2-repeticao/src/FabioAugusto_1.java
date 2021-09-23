import javax.swing.*;

public class FabioAugusto_1 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            int maiorAndar = 0, numeroAndar = 0, presentes = 0, saida;
            int andares = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de andares do prédio: "));
            for (int i = 0; i < andares; i++) {
                int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas pessoas entraram no andar " + (i + 1) + ": "));
                if (i != 0) {
                    saida = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas pessoas saíram no andar " + (i + 1) + ": "));
                    presentes += entrada - saida;
                    if (presentes > maiorAndar) {
                        maiorAndar = presentes;
                        numeroAndar = i + 1;
                    }
                } else {
                    presentes += entrada;
                    maiorAndar = presentes;
                    numeroAndar = i + 1;
                }
                if (presentes < 0) {
                    JOptionPane.showMessageDialog(null, "" +
                            "Número de pessoas no elevador negativo, " +
                            "iremos resetar esse valor para 0. Informe valores válidos da próxima vez!!!");
                    presentes = 0;
                } else {
                    if (presentes > 15) {
                        JOptionPane.showMessageDialog(null, "" +
                                "Excesso de passageiros\nDevem sair " + (presentes - 15));
                    }
                }
            }
            JOptionPane.showMessageDialog(null,
                    presentes + " pessoa estarão no elevador do último andar para descer" +
                            "\nO andar com o maior número de passageiros é " + numeroAndar + " com " + maiorAndar + " pessoas");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!!!");
        }
    }
}
