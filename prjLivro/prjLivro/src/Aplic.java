import java.util.Scanner;
/**
 *
 * @author Matheus 
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao, Identificacao, dias;
        String Titulo;
        boolean situacao;
        double valMultaDiaria;
        
        System.out.println("Digite a Identificação do Livro: ");
        Identificacao = entrada.nextInt();
        System.out.println("Digite o Titulo do Livro: ");
        Titulo = entrada.next();
        System.out.print("Digite o Valor da Multa(diaria): R$");
        valMultaDiaria = entrada.nextDouble();
        
        Livro novoLivro = new Livro(Identificacao, Titulo);
        novoLivro.setvalMultaDiaria(valMultaDiaria);
        
        do {
            System.out.println("\n-------------------");
            System.out.println("1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opcao: ");
            
            opcao = entrada.nextInt();
            System.out.println("");
            
            switch (opcao) {
                case 1:
                    System.out.println("\n\nTitulo do Livro " 
                                                       + novoLivro.getTitulo());
                    System.out.println("\n\nIdentificação do Livro " 
                                                + novoLivro.getIdentificacao());
                    if(novoLivro.getSituacao() == false){                     
                        System.out.println("\n\nSituação do Livro:Disponivel ");
                      }
                    else{
                        System.out.println("\n\nSituação do Livro: Emprestado");
                    }
                    break;
                case 2:
                    if(novoLivro.getSituacao() == false){
                        novoLivro.emprestar();
                        System.out.println("Emprestimo realizado com sucesso");
                    }else{
                        System.out.println("Livro está emprestado");
                    }
                    break;
                    
                case 3:
                    if(novoLivro.getSituacao()== false){
                        System.out.println("O livro já está disponivel");
                    }else{
                        System.out.println("Digite a quantidade de dias em atraso: ");
                        dias = entrada.nextInt();
                        
                        System.out.println("Valor da multa: R$" + novoLivro.devolver(dias));
                    }
                    break;
                default:
                    break;
                }
        }while(opcao < 4);
        
        entrada.close();
    }
}