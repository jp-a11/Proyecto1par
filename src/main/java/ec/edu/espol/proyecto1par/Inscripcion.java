/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.proyecto1par;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Inscripcion {
    String idinscrip;
    String nomMasco;
    String nomconcur;
    double valorpago;
    LocalDate fecha;
    ArrayList<Inscripcion> inscripciones = new ArrayList<>();

    public Inscripcion(String idinscrip,String nomMasco, String nomconcur, double valorpago, LocalDate fecha) {
        this.idinscrip = idinscrip;
        this.nomMasco = nomMasco;
        this.nomconcur = nomconcur;
        this.valorpago = valorpago;
        this.fecha = LocalDate.now();
    }
    public void CrearInscripcion(){
        Scanner br = new Scanner(System.in);
        System.out.println("Ingrese el id de inscripcion: ");
        String id = br.next();
        System.out.println("Ingrese el nombre de la mascota: ");
        String name = br.next();
        System.out.println("Ingrese el nombre del concurso: ");
        String nomcon = br.next();
        System.out.println("Ingrese el valor a pagar:");
        double val = br.nextDouble();
        Inscripcion i = new Inscripcion(id,name,nomcon,val,fecha);
        inscripciones.add(i);
        i.guardarIncripcion(inscripciones,"inscripciones.txt");
        
    }
    public void guardarIncripcion(ArrayList<Inscripcion> inscripciones,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(Inscripcion c:inscripciones)
                pw.println(this.idinscrip+"|"+this.nomMasco+"|"+this.nomconcur+"|"+this.valorpago+"|"+this.fecha);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Inscripcion() {
    }
    public String getNomMasco() {
        return nomMasco;
    }

    public void setNomMasco(String nomMasco) {
        this.nomMasco = nomMasco;
    }

    public String getNomconcur() {
        return nomconcur;
    }

    public void setNomconcur(String nomconcur) {
        this.nomconcur = nomconcur;
    }

    public double getValorpago() {
        return valorpago;
    }

    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "nomMasco=" + nomMasco + ", nomconcur=" + nomconcur + ", valorpago=" + valorpago + ", fecha=" + fecha + '}';
    }
    
}
