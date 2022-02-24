/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author grisssg26
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
    Persona per1 = new Persona ();
                 per1.setNombre("Griss");
        System.out.println("Nombre:" + per1.getNombre() );
        per1.comer("Hamburguesa hawaiana");
        
    Persona per2=new Persona();
        per2.setNombre("Luis");
        System.out.println("Nombre per 2: " + per2.getNombre() );
        per2.comer("Pizza hawaiana");
        
        Automovil bocho=new Automovil();
        System.out.println("El automovil es un: Bocho");
        bocho.setMarca("VW"); //Asignación del estado "VW" al atributo Marca
        System.out.println("Marca: " + bocho.getMarca() );
        bocho.setSubMarca("Sedan"); //Asignación del estado "Sedan" al atributo SubMarca
        System.out.println("SubMarca: " + bocho.getSubMarca() );
        bocho.setModelo(1970); //Asignación del estado "1970" al atributo Modelo
        System.out.println("Modelo: " + bocho.getModelo() );
        bocho.setColor(Color.BLUE); //Asignación del estado "Azul-BLUE" al atributo color
        System.out.println("Color: " + bocho.getColor() );
        
        
        Automovil mustang=new Automovil();
        System.out.println("El automóvil es un: Mustang");
        mustang.setMarca("Ford"); //Asignación del estado "Ford" al atributo Marca
        System.out.println("Marca: " + mustang.getMarca() );
        mustang.setSubMarca("Mustang"); //Asignación del estado "Mustang" al atributo SubMarca
        System.out.println("SubMarca: " + bocho.getSubMarca() );
        mustang.setModelo(2010); //Asignación del estado "2010" al atributo Modelo
        System.out.println("Modelo: " + mustang.getModelo() );
        mustang.setColor(Color.yellow); //Asignación del estado "Amarillo-yellow" al atributo Color
        System.out.println("Color: " + mustang.getColor() );
        
        
        Automovil akura=new Automovil();
        System.out.println("El automóvil es un: Akura");
        akura.setMarca("Akura"); //Asignación del estado "Akura" al atributo Marca
        System.out.println("Marca: " + akura.getMarca() );
        akura.setSubMarca("NSX"); //Asignación del estado "NSX" al atributo SubMarca
        System.out.println("SubMarca: " + akura.getSubMarca() );
        akura.setModelo(2013); //Asignación del estado "2013" al atributo Modelo
        System.out.println("Modelo: "+ akura.getModelo() );
        akura.setColor(Color.gray); //Asignación del estado "Gris-gray" al atributo Color
        System.out.println("Color: " + akura.getColor() );
         
        
    }
    
}
