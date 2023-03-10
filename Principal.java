import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DadosAluno dadosAluno = new DadosAluno();
        String nomeAluno;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;
        
        System.out.println("Digite o nome do aluno");
        nomeAluno = input.nextLine();
        dadosAluno.setNomeAluno(nomeAluno);
        System.out.println("Aluno: "+dadosAluno.getNomeAluno());
        
        System.out.println("Digite a primeira nota de: "+dadosAluno.getNomeAluno());
        nota1 = input.nextInt();
        dadosAluno.setNota1Aluno(nota1);
        
        System.out.println("Digite a segunda nota do: "+dadosAluno.getNomeAluno());
        nota2 = input.nextInt();
        dadosAluno.setNota2Aluno(nota2);
        
        System.out.println("Digite a terceira nota do: "+dadosAluno.getNomeAluno());
        nota3 = input.nextInt();
        dadosAluno.setNota3Aluno(nota3);
        
        System.out.println("Digite a ultima nota do: "+dadosAluno.getNomeAluno());
        nota4 = input.nextInt();
        dadosAluno.setNota4Aluno(nota4);
        
        media = (dadosAluno.getNota1Aluno()+dadosAluno.getNota2Aluno()+dadosAluno.getNota3Aluno()+dadosAluno.getNota4Aluno())/4;
        
        if(media >=7 && media<=10){
            System.out.println(dadosAluno.getNomeAluno()+" Aprovado com a média de: "+media);
        }else{
            System.out.println(dadosAluno.getNomeAluno()+" Reprovado com a média de: "+media);
        }
    }
}
