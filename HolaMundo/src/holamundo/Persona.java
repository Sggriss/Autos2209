package holamundo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grisssg26
 */
public class Persona {   //Clase
    private String nombre;  //Atributos
    private int edad;    //Atributos

    public Persona() {     //Método constructor
    }

    public Persona(String nombre, int edad) {    //Método constructor sobrecargado
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    //Método de uso general

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(String platillo){
        System.out.println(this.nombre + " está comiendo " + platillo );
    }
    
}
