/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(String n, String ide, int ed){
        nombre = n;
        apellidos = ide;
        edad = ed;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String n){
        apellidos = n;
    }
    
    public void establecerEdad(int e){
        edad = e;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellidos;
    }
    public int obtenerEdad(){
        return edad;
    }
    
}
