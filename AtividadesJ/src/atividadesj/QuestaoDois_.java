
import javax.swing.JOptionPane;

public class QuestaoDois_ {

    public static void main(String[] args) {
        
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas a serem cadastradas: "));
        String[][] matriz = new String[quant][2];
        
        int j=0;
        for (int i = 0; i < quant; i++) {
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Nome: ");
            j++;
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Tel: ");
            j = 0;
        }
        
        String nome = JOptionPane.showInputDialog("Informe um nome a ser consultado: ");
        boolean achou = false;
        
        for (int i = 0; i< quant; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + matriz[i][0] + "\nTel: " + matriz[i][1]);
                achou = true;
                break;
            }
        }
        
        if (!achou) {
            JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado!");
        }
    }
}

