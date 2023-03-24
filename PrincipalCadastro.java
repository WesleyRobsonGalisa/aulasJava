import java.util.Scanner;
import java.util.ArrayList;

public class PrincipalCadastro{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       ArrayList<AlunoCadastro> a = new ArrayList();
       int opcao;
       
       do{
       System.out.println("Digite Uma das Opções");
       System.out.println("1 - Cadastrar Aluno");
       System.out.println("2 - Listar Aluno");
       System.out.println("3 - Sair");
       opcao = input.nextInt();
       
           switch(opcao){
                case 1 :
                    AlunoCadastro aluno = new AlunoCadastro();
                    System.out.println("\fDigite o nome do aluno");
                    aluno.setNome(input.next());
                    System.out.println("\fDigite a cidade");
                    aluno.setEndereco(input.next());
                    System.out.println("\fDigite o UF");
                    aluno.setUF(input.next());
                    System.out.println("\fDigite o email");
                    aluno.setEmail(input.next());
                    System.out.println("\fDigite a senha");
                    aluno.setSenha(input.next());
                    System.out.println("\fDigite uma matricula pro aluno");
                    aluno.setMatricula(input.nextInt());
                    
                    int opAluno;
                    System.out.println("\f"+aluno.toString()+"\nEstá correto?\nDigite 1 para sim e 2 para não");
                    opAluno = input.nextInt();
                    if(opAluno == 1){
                        a.add(aluno);
                        System.out.println("\fSucesso aluno cadastrado!");
                        System.out.println("Voltar ao menu?");
                        System.out.println("Digite (1) para sim e (2) para não");
                        int aux = input.nextInt();
                            if(aux == 1){
                                opcao = 1;
                            }else if(aux == 2){
                                opcao = 3;
                            }
                    }else if(opAluno!=1 && opAluno!=2){
                        System.out.println("Opção Inválida\n");
                    }
                    
                break;
                case 2:
                    System.out.println("Ok já vou trazer a lista de Alunos cadastrados");
                    System.out.println(a.size());
                    for(int i=0; i<a.size(); i++){
                        System.out.println(a.get(i));
                    }
                    
                    System.out.println("\n\nUfa!, terminei\n\n");
                    System.out.println("Voltar ao menu?");
                        System.out.println("Digite (1) para sim e (2) para não");
                        int aux = input.nextInt();
                            if(aux == 1){
                                opcao = 1;
                            }else if(aux == 2){
                                opcao = 3;
                            
                    }else if(aux!=1 && aux!=2){
                        System.out.println("Opção Inválida\n");
                    }
                break;
            }
      }while(opcao!=3);
    }

}
