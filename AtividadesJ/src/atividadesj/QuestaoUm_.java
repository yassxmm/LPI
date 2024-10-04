
import javax.swing.JOptionPane;

public class QuestaoUm_ {

    public static void main(String[] args) {

        int tamM = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos nomes serão cadastrados"));
        String[] matriz = new String[tamM];

        for (int i = 0; i < tamM; i++) {
            matriz[i] = JOptionPane.showInputDialog("Digite o " + (1 + i) + "° nome: ");
            if (matriz[i] == null) {
                break;
            }
        }

        int num;
        for (;;) {
            String entrada = JOptionPane.showInputDialog("Digite o número da  posição a ser procurada: ");
            if (entrada == null) {
                break;
            } else {
                num = Integer.parseInt(entrada);
            }
            if (num > 0 && num <= tamM) {
                JOptionPane.showMessageDialog(null, "O nome encontrado na posição " + num + " foi: " + matriz[num - 1]);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido!!!");
            }
        }
    }
}

