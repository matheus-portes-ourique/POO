
import java.util.Scanner;

/**
 *
 * @author 0030482411024
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        int opcao;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\nDigite a medida do Raio do Circulo: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo();
        
        objCir.setRaio(medRaio);
        
        do{
            System.out.println("\n\n1 - Consultar Medidas da Área");
            System.out.println("\n\n2 - Consultar dedida do Perimetro");
            System.out.println("\n\n3- Consultar dedida da Diâmetro");
            System.out.println("\n\n4 - Encerrar");
            System.out.print("\n\nDigite a opção: ");
            opcao = entrada.nextInt(); //scanf("%d", &opcao);
            
            System.out.println("\n\nMedida do Raio do Circulo: " + objCir.getRaio());
            switch (opcao) {
                case 1:
                    System.out.println("\n\nMedida da área: " + objCir.calcArea());
                    break;
                case 2:
                    System.out.println("\n\nMedida da Perimetro: " + objCir.calcPerimetro());
                    break;
                case 3:
                    System.out.println("\n\nMedida da Diagonal: " + objCir.calcDiametro());
                    break;
                default:
                    break;
            }
            
        }while(opcao < 4);
    }
    
}
