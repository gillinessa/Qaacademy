import javax.swing.JOptionPane;

public class Execico02 { //faça um algoritmo para somar dois numeros e exibir o resultado
public static void main(String[]args){

    int numero01 =10;
    int numero02 =20;

    System.out.println(numero01+numero02);

    //03 faça um algoritmo para multiplicar dois numeros do ususario e exibir o resultado
    int numero03 = 2;
    int numero04 = 04;
    System.out.println(numero03*numero04);
    
    //04 faça um algoritmo para dividir dois numeros do ususario e exibir o resultado
    int numero1 = 8;
    int numero2 = 2;

    System.out.println(numero1/numero2);

    // 05 somar 2 palavras 
    String nome = "gilliard";
    String sobrenome = "lima ";

    System.out.println(nome+sobrenome);

    // 06 exibir de 7 a 15
    int num = 7;
    while(num<=15){
        System.out.println("num:"+num);
        num =num+1;

        // 07 exibir a palavra casa 10 vezes
        String casa = "casa";
        int i = 1;
        while(i<=10){

            System.out.println(casa);

            // 08 receber um numero do usuario, somar por 210 e exibir o resultado 
            int numero = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
            int resultado = numero+210;
            
            System.out.println(resultado);



        } 
    }

}   

}
