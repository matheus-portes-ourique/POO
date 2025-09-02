import java.util.Scanner;
/**
 *
 * @author Matheus 
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao, Identificacao;
        String Titulo;
        
        System.out.println("Digite a Identificação do Livro: ");
        Identificacao = entrada.nextInt();
        System.out.println("Digite o Titulo do Livro: ");
        Titulo = entrada.next();
        
        Livro novoLivro = new Livro(Identificacao, Titulo);
        
        do {
            System.out.println("\n-------------------");
            System.out.println("1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.print("\nDigite a opcao: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n\nTitulo do Livro " 
                                                       + novoLivro.getTitulo());
                    System.out.println("\n\nIdentificação do Livro " 
                                                + novoLivro.getIdentificacao());
                    System.out.println("\n\nSituação do Livro: "
                                        + novoLivro.getSituacao());
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("\n\nMedida da Diagonal: " + objCir.calcDiametro());
                    break;
                default:
                    break;
                }
        }
}
