
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;


/**
 * matheus
 */

public class Aplic {

    public static void main(String[] args) {
        Cliente objCli = new Cliente("51578044820","Nabucodonosor da Silva","159918374");
        Instrutor objInst = new Instrutor(1515, "Takamassa Nomuro", "15994571324");
        
        double peso = 80, altura = 1.70; 

        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());

        objProf.setSalario(30000);
        
        System.out.println("\nRegistro funcional: " + objProf.getRegFuncional());
        System.out.println("Nome: " + objProf.getNome());
        System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
        System.out.println("Mensalidade: " + objProf.getSalario());




        
    }
    
}


