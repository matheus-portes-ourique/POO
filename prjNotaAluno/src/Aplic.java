
import java.util.Scanner;

/**
 *
 * @author 0030482411024
 */
public class Aplic {
    public static void main(String[] args) {
        int opcao;
        
        Scanner entrada = new Scanner(System.in);
        
        Aluno objAluno = new Aluno();
        
        System.out.println("\n\nDigite o RA do Aluno: ");
        objAluno.setRa (entrada.nextInt());
        
        System.out.println("\n\nDigite a nota do Aluno na Primeira Prova");
        objAluno.setNtPrv1(entrada.nextDouble());
               
        System.out.println("\n\nDigite a nota do Aluno na Segunda Prova");
        objAluno.setNtPrv2(entrada.nextDouble());
        
        System.out.println("\n\nDigite a nota do Aluno no Primeiro Trabalho");
        objAluno.setNtTrab1(entrada.nextDouble());

        System.out.println("\n\nDigite a nota do Aluno no Segundo Trabalho");
        objAluno.setNtTrab2(entrada.nextDouble());  
        
        do{
            System.out.println("\n\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("\n\n2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("\n\n3- Exibir Media Final");
            System.out.println("\n\n4 - Sair");
            System.out.print("\n\nDigite a opção: ");
            opcao = entrada.nextInt(); //scanf("%d", &opcao);
            
            switch (opcao) {
                case 1:
                    System.out.println("\n\nRA do Aluno: " + objAluno.getRA());
                    System.out.println("\n\nNota das Provas/Trabalhos: " +
                           "\n\n" + objAluno.getNtPrv1() + "\n\n"  
                                  + objAluno.getNtPrv2() + "\n\n"
                                  + objAluno.getNtTrab1() + "\n\n" 
                                  + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("\n\nRA do Aluno: " + objAluno.getRA());
                    System.out.println("\n\nMedia dos Trabalhos/Provas: " + 
                            objAluno.calcMediaTrab() + "\n\n" +
                            objAluno.calcMediaProva());
                    break;
                case 3:
                    System.out.println("\n\nMedia Final: " + 
                                       objAluno.calcMediaFinal());
                    break;
                default:
                    break;
            }
            
        }while(opcao < 4);
    }
    
}