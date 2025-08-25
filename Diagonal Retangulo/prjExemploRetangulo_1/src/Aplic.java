/**
 *
 * @author Nao é o plabo que fez isso aqui
 */
public class Aplic {
    public static void main(String[] args) {
        // definição do ponteiro
        Retangulo objRet;
        
        //instanciação do objeto da classe retangulo (alocação)
        
        objRet = new Retangulo();
        
        //implementação do caso de uso montar a figura geometrica retangulo
        
        objRet.setAltura(5.0); //passagem de mensagem
        objRet.setBase(8.0); //passagem de mensagem
        System.out.println("Medida de Altura do Retangulo: " + objRet.getAltura());
        System.out.println("Medida da Base do Retangulo: " + objRet.getBase());
        
        //implementaçao do caso de uso consultar area do retangulo
        
        System.out.println("Medida da area do retangulo:" + objRet.calcArea());
        
        //implementação do caso de uso consultar perimetro do retangulo
        
       System.out.println("Medida do perimetro do retangulo:" + 
                                      objRet.calcPerimetro());
       
       //diagonal do retangulo
       System.out.println("Medida da diagonal do retangulo:" + 
                                      objRet.calcDiagonal());
       
       Retangulo objRet1 = new Retangulo();
       
       objRet1.setAltura(3.0); //passagem de mensagem
        objRet1.setBase(4.0); //passagem de mensagem
        System.out.println("\nMedida de Altura do Retangulo: " + objRet1.getAltura());
        System.out.println("Medida da Base do Retangulo: " + objRet1.getBase());        
        System.out.println("Medida da area do retangulo:" + objRet1.calcArea());
        System.out.println("Medida do perimetro do retangulo:" + 
                                      objRet1.calcPerimetro());
        System.out.println("Medida da diagonal do retangulo:" + 
                                      objRet1.calcDiagonal());
    }
    
}
