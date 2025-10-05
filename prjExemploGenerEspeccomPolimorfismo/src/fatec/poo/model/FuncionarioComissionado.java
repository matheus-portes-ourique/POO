package fatec.poo.model;

/**
 *
 * @author mathe
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado (int r, String n, String dtAdm, double tc){
        super(r,n,dtAdm);
        tc = taxaComissao;
    }

    public void setSalBase(double sb){
        salBase = sb;
    }
        
    public double getSalBase(){
        return(salBase);
    }
    
    public double getTotalvendas(){
        return(totalVendas);
    }
    
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    
    public void addVendas(double av){
        totalVendas += av;
    }
    
    public double calcSalBruto(){
        return (salBase + (taxaComissao/100) * totalVendas);
    }
    
    
    public double calcGratificacao(){
        if (totalVendas > 10000){
            return (calcSalBruto() *0.05);
        }
        else if (totalVendas > 5000){
            return (calcSalBruto() * 0.03);
        }
        else{
            return 0;
        }    
   }
    
     public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
     
}
