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
public class Criterio {
    String idcrit;
    String infoCriterio;
    ArrayList<Criterio> criterios = new ArrayList <>();

    public Criterio() {
    }

    public Criterio(String idcrit,String infoCriterio) {
        this.idcrit = idcrit;
        this.infoCriterio = infoCriterio;
    }
    public void CrearCriterio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de criterios");
        int cantidad=sc.nextInt();
        for (int i =0;i< cantidad;i++){
          System.out.println("Ingrese la info de cada criterio(en lugar de espacio usar(-)):");
          String info = sc.next();
          System.out.println("Ingrese el ID de criterios");
          String icrit=sc.next();
          Criterio c = new Criterio(icrit,info);
          criterios.add(c);
        }
        System.out.println("Ingrese el nombre del concurso");
        String nom=sc.next();
        Criterio c = new Criterio();
        c.guardarCriterios(nom, criterios, "criterios.txt");
    }
    public void guardarCriterios(String nomconcur,ArrayList<Criterio> criterios,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
                pw.print(nomconcur+"|");
                for(Criterio c:criterios)
                    pw.print(this.idcrit+"|"+this.infoCriterio+"|");
                pw.println();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
