/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pagos.grupo;
import java.util.ArrayList;

/**
 *
 * @author pablocordova
 */
public class CalculadoraGastos {
    private ArrayList<Persona> personas = new ArrayList<>();
    
   
    
    public void agregarPersona(Persona persona) {
    personas.add(persona);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (Persona persona: personas ){
            total += persona.getGasto();       
        }
        return total;
    }
    public void calcularBalance(){
    double total = calcularTotal();
    double promedio = total / personas.size();
    System.out.printf("------- RESUMEN DE GASTOS -------\n");
    System.out.printf("Gasto Total: %.2f\n",
            total);
    System.out.printf("Promedio por persona: %.2f\n",
            promedio);
    System.out.printf("-----------------------------------\n");
    
    // 3. Recorrer la lista para ver el balance de cada quien
    for (Persona persona : personas) {
        // Balance = lo que gastó menos lo que le toca pagar (promedio)
        double balance = persona.getGasto() - promedio;
        
        if (balance > 0) {
            System.out.printf(" %s puso de más. Debe RECIBIR: %.2f $\n",
                    persona.getNombre(),
                   balance);
        } else if (balance < 0) {
            // Multiplicamos por -1 para mostrar el valor positivo en el mensaje de pago
            System.out.printf(" %s puso de menos. Debe PAGAR: %.2f$\n" ,
                    persona.getNombre(),
                    (-balance));
        } else {
            System.out.printf("%s está a mano (no debe ni recibe).\n",
                    persona.getNombre());
            //falta cambiar a 2 decimales con printf
        }
    }
}
    
}
