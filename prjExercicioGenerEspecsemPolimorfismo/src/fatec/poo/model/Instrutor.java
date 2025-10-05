package fatec.poo.model;
/**
 *
 * @author mathe
 */
public class Instrutor extends Pessoa {
    public int identificacao;
    public String areaAtuacao;

    public Instrutor(int id, String t, String n) {
        super(n,t);
        identificacao = id;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String aAtu) {
        areaAtuacao = aAtu;
    }   
    
}
