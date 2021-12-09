/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.proyecto1par;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Mascota {
    String nombre;
    int edad;
    String raza;
    int altura;
    String educacion;
    ArrayList<Mascota> mascotas = new ArrayList <>();

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String raza, int altura, String educacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.altura = altura;
        this.educacion = educacion;
    }
   
    public void CrearMascota(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la mascota:");
        String name = sc.next();
        System.out.println("Ingrese la edad de la mascota:");
        int age = sc.nextInt();
        System.out.println("Ingrese la raza de la mascota:");
        String raz = sc.next();
        System.out.println("Ingrese la altura en cm:");
        int alt = sc.nextInt();
        System.out.println("Ingrese la educación de la mascota:");
        String edu = sc.next();
        Mascota m = new Mascota(name, age, raz, alt, edu);
        mascotas.add(m);
        m.guardarMascota(mascotas,"mascotas.txt");
        
    }
     public void guardarMascota(ArrayList<Mascota> mascotas,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(Mascota m:mascotas)
                pw.println(this.nombre+"|"+this.edad+"|"+this.raza+"|"+this.altura+"|"+this.educacion);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", altura=" + altura + ", educacion=" + educacion + '}';
    }
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }if(o == this){
            return true;
        }if(this.getClass()!=o.getClass()){
            return false;
        }
        Mascota u = (Mascota) o;
        return Objects.equals(u.nombre,this.nombre);
    }
    
    
}
