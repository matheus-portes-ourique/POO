package fatec.poo.model;

/**
 *
 * @author mathe
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa(String n, int ai){
        nome = n;
        anoInscricao = ai;
    }
    
  abstract public double calcBonus(int anoAtual);
  
  public void addCompras(double ac){
      totalCompras += ac ;
  }

  public String getNome(){
      return nome;
  }
  
  public int getAnoInscricao(){
      return anoInscricao;
  }
  
  public double getTotalCompras(){
      return totalCompras;
  }

}
