/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.pagos.grupo;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author pablocordova
 */
public class PruebaPagosGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // TODO code application logic here
        
        Persona p1 = new Persona("Pablo", 43.98);
        Persona p2 = new Persona("Nicolay", 50.78);
        Persona p3 = new Persona("David", 19.55);
        
        CalculadoraGastos calculadora = new CalculadoraGastos();
        
        calculadora.agregarPersona(p1);
        calculadora.agregarPersona(p2);
        calculadora.agregarPersona(p3);
        
        double totalGeneral = calculadora.calcularTotal();
        System.out.println(totalGeneral);
        
        calculadora.calcularBalance();
        
             
        
           
        
    }
    
}
