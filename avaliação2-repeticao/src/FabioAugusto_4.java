import javax.swing.JOptionPane;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] args) {
        try {
            String[] nome = new String[30];
            double[] nota = new double[30];
            double media = 0;
            double menorNota = 0, maiorNota = 0;
            String menorNome = "", maiorNome = "";
            int countNota = 0;
            for (int i = 0; i < nome.length; i++) {
                nome[i] = JOptionPane.showInputDialog("Informe o nome do aluno " + (i + 1) + ":");
                double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno " + (i + 1) + ":"));
                while (notaAluno < 0 || notaAluno > 100) {
                    notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota para o aluno " + (i + 1) + " entre 0 e 100:"));
                }
                nota[i] = notaAluno;
                countNota = (nota[i] < 50) ? (countNota + 1) : countNota;
                media += nota[i];
                if (i == 0) {
                    maiorNota = nota[i];
                    maiorNome = nome[i];
                    menorNota = nota[i];
                    menorNome = nome[i];
                } else if (nota[i] > maiorNota) {
                    maiorNota = nota[i];
                    maiorNome = nome[i];
                } else if (nota[i] < menorNota) {
                    menorNota = nota[i];
                    menorNome = nome[i];
                }
            }
            JOptionPane.showMessageDialog(null,
                    "Soma das notas: " + media + " e a média é: " + (media / nota.length) +
                            "\nTotal de alunos com nota menor que 50: " + countNota +
                            "\nO aluno(a) com a maior nota - Nome: " + maiorNome + " - Nota: " + maiorNota +
                            "\nO aluno(a) com a menor nota - Nome: " + menorNome + " - Nota: " + menorNota);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
