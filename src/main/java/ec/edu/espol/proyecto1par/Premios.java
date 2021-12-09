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
public class Premios {
    ArrayList<Premios> premios = new ArrayList <>();
    String infopremio;

    public Premios(String infopremio) {
        this.infopremio = infopremio;
    }
    public void guardarPremios(String nomconcur,ArrayList<Premios> premios,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
                pw.print(nomconcur+"|");
                for(Premios p:premios)
                    pw.print(this.infopremio+"|");
                pw.println();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void CrearPremio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de premios");
        int cantidad=sc.nextInt();{
        for (int i =0;i< cantidad;i++){
          System.out.println("Ingrese la info de cada premio:");
          String info = sc.next();
          Premios p = new Premios(info);
          premios.add(p);
          }
        }  
        System.out.println("Ingrese el nombre del concurso");
        String nom=sc.next();  
        Premios p = new Premios();
        p.guardarPremios(nom, premios, "premios.txt");
        
    }

    public Premios() {
    }
    
}
