import java.util.Scanner;
public class Calculadora{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        int escolha2 = 0;
        
        double num1;
        double num2;
        double resultado;
        
        do{
            System.out.println("Bem vindo a calculadora");
            System.out.println("Digite agora o número da escolha:");
            System.out.println("1 Somar");
            System.out.println("2 Subtrair");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir");
            escolha = input.nextInt();
            
                switch(escolha){
                    case 1: 
                    System.out.println("digite o número");
                    num1 = input.nextDouble();
                    System.out.println("digite o outro número");
                    num2 = input.nextDouble();
                    resultado = num1+num2;
                    System.out.println("Resultado: "+resultado);
                    System.out.println("Deseja fazer outra operação?");
                    System.out.println("1 SIM");
                    System.out.println("2 NÃO");
                    escolha2 = input.nextInt();
                    
                    break;
                    
                    case 2: 
                    System.out.println("digite o número");
                    num1 = input.nextDouble();
                    System.out.println("digite o outro número");
                    num2 = input.nextDouble();
                    resultado = num1-num2;
                    System.out.println("Resultado: "+resultado);
                    System.out.println("Deseja fazer outra operação?");
                    System.out.println("1 SIM");
                    System.out.println("2 NÃO");
                    escolha2 = input.nextInt();
                    
                    break;
                    
                    case 3: 
                    System.out.println("digite o número");
                    num1 = input.nextDouble();
                    System.out.println("digite o outro número");
                    num2 = input.nextDouble();
                    resultado = num1*num2;
                    System.out.println("Resultado: "+resultado);
                    System.out.println("Deseja fazer outra operação?");
                    System.out.println("1 SIM");
                    System.out.println("2 NÃO");
                    escolha2 = input.nextInt();
                    
                    break;
                    
                    case 4: 
                    System.out.println("digite o número");
                    num1 = input.nextDouble();
                    System.out.println("digite o outro número");
                    num2 = input.nextDouble();
                    resultado = num1/num2;
                    System.out.println("Resultado: "+resultado);
                    System.out.println("Deseja fazer outra operação?");
                    System.out.println("1 SIM");
                    System.out.println("2 NÃO");
                    escolha2 = input.nextInt();
                    
                    
                    break;
                    
                    default: System.out.println("operação não reconhecida");
            }
        }while(escolha2==1);
      }
    }
