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
public class Concurso {
    String idconcur;
    String nomconcur;
    String descripcion;
    int lugaresposibles;
    ArrayList<Concurso> concursos =new ArrayList <>();

    public Concurso() {
    }

    public String getNomconcur() {
        return nomconcur;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLugaresposibles() {
        return lugaresposibles;
    }

    public void setLugaresposibles(int lugaresposibles) {
        this.lugaresposibles = lugaresposibles;
    }

    public Concurso( String idconcur,String nomconcur, String descripcion, int lugaresposibles) {
        this.idconcur = idconcur;
        this.nomconcur = nomconcur;
        this.descripcion = descripcion;
        this.lugaresposibles = lugaresposibles;
    }

    public void setNomconcur(String nomconcur) {
        this.nomconcur = nomconcur;
    }

    public String getIdconcur() {
        return idconcur;
    }

    public void setIdconcur(String idconcur) {
        this.idconcur = idconcur;
    }
    public void guardarConcurso(ArrayList<Concurso> concursos,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(Concurso c:concursos)
                pw.println(this.idconcur+"|"+this.nomconcur+"|"+this.descripcion+"|"+this.lugaresposibles);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void CrearConcurso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del concurso:");
        String id = sc.next();
        System.out.println("Ingrese el nombre del concurso:");
        String nom = sc.next();
        System.out.println("Ingrese la descripcion del concurso(es lugar de espacios usar(-)):");
        String raz = sc.next();
        System.out.println("Ingrese cuantos lugares posible tiene el concurso:");
        int alt = sc.nextInt();
        Concurso c = new Concurso(id, nom, raz, alt);
        concursos.add(c);
        c.guardarConcurso(concursos,"concursos.txt");
        
    }
    
}
