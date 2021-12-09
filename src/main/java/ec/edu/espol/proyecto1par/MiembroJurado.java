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
import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class MiembroJurado {
    String nomjurado;
    String apellido;
    String email;
    double nota;
    ArrayList<MiembroJurado> miembros = new ArrayList<>();

    public MiembroJurado(String nomjurado, String apellido, String email, double nota) {
        this.nomjurado = nomjurado;
        this.apellido = apellido;
        this.email = email;
        this.nota = nota;
    }
    public void guardarMiembro(ArrayList<MiembroJurado> miembros,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(MiembroJurado r:miembros)
                pw.println(this.nomjurado+"|"+this.apellido+"|"+this.email+"|"+this.nota);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void CrearMiembro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Jurado:");
        String name = sc.next();
        System.out.println("Ingrese el Apellido del Jurado:");
        String ap = sc.next();
        System.out.println("Ingrese el email del Jurado:");
        String mail = sc.next();
        System.out.println("Ingrese la nota del Jurado:");
        double not = sc.nextDouble();
        MiembroJurado u = new MiembroJurado(name, ap,mail,not);
        miembros.add(u);
        u.guardarMiembro(miembros,"miembroJurado.txt");
    }
    public MiembroJurado() {
    }

    public String getNomjurado() {
        return nomjurado;
    }

    public void setNomjurado(String nomjurado) {
        this.nomjurado = nomjurado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "Nombre del jurado=" + nomjurado + ", Apellido del jurado=" + apellido + ", email del jurado =" + email + ", nota del jurado=" + nota + '}';
    }
    
    
}
