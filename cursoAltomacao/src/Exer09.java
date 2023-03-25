import javax.swing.JOptionPane;

public class Exer09 {//faça um algoritmo para ler um numero inteiro entre: 1 a 10, calcular e exibir a tabuada deste digitado.
public static void main(String[] args) throws Exception {
    int i =0;
    int num = Integer.parseInt(JOptionPane.showInputDialog("digite uma mensagem"));
    int resultado;
    while(i<=10){
        resultado = num*i;
        i=i+1;
        System.out.println(resultado);

    }
}
    
}//fim algaritmo
