import javax.swing.JOptionPane;

public class Exercicio01 {//01 faça um algaritmo para ler tres valores (digitados pelo usuario), e exibir.  
    public static void main (String[] args) throws Exception{
        //exemplo 01

        String nome = JOptionPane.showInputDialog("digite uma palavra"); //mensagem que vai aparecer  na tela
        String sobrenome = JOptionPane.showInputDialog("digite uma palavra");//mensagem que vai aparecer na tela
        String rua = JOptionPane.showInputDialog("digite uma palavra");//mensagem que vai aparecer na tela

        System.out.println("Exibindo as variaveis do tipo String: \n nome: "+nome+ "\n sobrenome: "+sobrenome+" \n rua:"+rua);

//Exemplo 02
int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
int numCasa = Integer.parseInt(JOptionPane.showInputDialog("digite numero da sua casa"));
int numAleatorio = Integer.parseInt(JOptionPane.showInputDialog("digite um numero aleatorio"));

System.out.println("Exibindo as variaveis do tipo int: \n idade: "+idade+ "\n numero casa: "+numCasa+ "\n numero Aleatorio: "+numAleatorio);

//Exemplo 03
Boolean moraSozinho = Boolean.parseBoolean(JOptionPane.showInputDialog("vc mora sozinhow"));
Boolean ceuCinza = Boolean.parseBoolean(JOptionPane.showInputDialog("o ceu esta cinza"));
Boolean frio = Boolean.parseBoolean(JOptionPane.showInputDialog("esta frio"));

System.out.println("Exibindo as variaveis do tipo Boolean: \n moraSozinho: "+moraSozinho+ "\n ceuCinza: "+ceuCinza+ "\n frio: "+frio);






    }

}//fimexeextra 01
      

    
