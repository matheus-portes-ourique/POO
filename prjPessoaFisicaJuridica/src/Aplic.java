import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;


/**
 *
 * @author mathe
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica pf = new PessoaFisica("123.456.789-00","Juan Carlos", 1998);
        PessoaJuridica pj = new PessoaJuridica("574.864.715-24","Elizabete Medeiros", 2004);
        
        
        pf.addCompras(5000);
        pf.addCompras(4500);
        pf.addCompras(6500);
        pf.setBase(50.35); //R$50,35
        
        pj.setTaxaIncentivo(1); //1%
        pj.addCompras(1000.436);
        pj.addCompras(2000);
        pj.addCompras(3000);
        pj.addCompras(4657); 
        
      System.out.println("Ano Atual: " + 2025);
        System.out.println("\nPessoa Física");
        System.out.println("Data de Inscrição: " + pf.getAnoInscricao());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Nome: " + pf.getNome());       
        System.out.println("Base: " + pf.getBase());
        System.out.println("Total Compras: " + df.format(pf.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(2025)));
        
        System.out.println("\n\nPessoa Jurídica");
        System.out.println("Data de Inscrição: " + pj.getAnoInscricao());
        System.out.println("CGC: " + pj.getCGC());
        System.out.println("Nome: " + pj.getNome());        
        System.out.println("Taxa Incentivo: " + pj.getTaxaIncentivo() + "%");
        System.out.println("Total Compras: " + df.format(pj.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pj.calcBonus(2025)));
    }
    
}
