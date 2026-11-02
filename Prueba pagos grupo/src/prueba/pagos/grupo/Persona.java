/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.pagos.grupo;

/**
 *
 * @author pablocordova
 */
public class Persona {
    private String nombre;
    private double gasto;
    private double balance;
    
    public Persona(String nombre, double gasto){
        this.nombre = nombre;
        this.gasto = gasto;
    }
    public String getNombre(){
        return nombre;
    }
    public double getGasto(){
        return gasto;
    }
    public double getBalance(){
        return balance;
    }
    
    public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Gasto: " + gasto);
    }
    
    
    
}
