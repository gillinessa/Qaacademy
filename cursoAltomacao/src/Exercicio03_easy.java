import javax.swing.JOptionPane;

public class Exercicio03_easy {//03 faça um algaritmo para ler dois valores (digitados pelo usuario), armazenar em variaveis, e exibir os valoresdas variaveis, trocadas  
    String nome1; // declarando variavel
    String nome2;// declarando variavel

    public static void main (String[] args) throws Exception{
        //exemplo 01

        String nome1 = JOptionPane.showInputDialog("digite uma palavra"); //mensagem que vai aparecer  na tela
        String nome2 = JOptionPane.showInputDialog("digite uma palavra");  //mensagem que vai aparecer na tela 

        System.out.println("O usuariodigitou:"+nome2);// digitar primeiro valor aparecer segundo valor

        System.out.println("O usuariodigitou:"+nome1);//digitar segundo valor aparecer primeiro valor 

        // faca faca um algoritmo para ler dois numeros , armazenar em variaveis, e exibir os valores variaveis trocados 
        
        String num1 = JOptionPane.showInputDialog("digite uma palavra"); //mensagem que vai aparecer  na tela
        String num2 = JOptionPane.showInputDialog("digite uma palavra");  //mensagem que vai aparecer na tela 

        System.out.println("O usuariodigitou:"+num2);// digitar primeiro valor aparecer segundo valor

        System.out.println("O usuariodigitou:"+num1);//digitar segundo valor aparecer primeiro valor 



    }

}//fimexercico03
      

    
