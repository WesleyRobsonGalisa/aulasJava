import  java.util.Scanner;
public class Idade{
    public static void main(String [] args)throws InterruptedException{
        Scanner input  = new Scanner(System.in);
        Integer idade;
        Integer ano = 365;
        Integer diasVividos;

        System.out.println("Bem-vindo(a)\n\n");
        System.out.println("Me conte agora qual sua idade");
        idade = input.nextInt();

        if(idade instanceof Integer!=true){
            System.out.println("Digite somente números inteiros,\ncomo: 1,2,3 e etc...");
            
        }else{
            System.out.print("\f");
            System.out.println("AGUARDE");
            
            for (int i = 0; i<4;i++){
                Thread.sleep(0500); 
                System.out.print(".");
            }
            
            System.out.print("\f");
            diasVividos = idade*ano;
            
            System.out.println("Você viveu aproximadamente "+diasVividos+" dias, ou,\n "+diasVividos*24+" Horas");
            
        }
    }

}
