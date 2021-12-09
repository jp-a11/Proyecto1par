
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
public class Evaluacion {
    String mail;
    String idinscr;
    String idcrit;
    double not;
    ArrayList<Evaluacion> evaluaciones = new ArrayList<>();

    public Evaluacion(String mail, String idinscr, String idcrit, double not) {
        this.mail = mail;
        this.idinscr = idinscr;
        this.idcrit = idcrit;
        this.not = not;
    }
    public void guardarEvaluacion(ArrayList<Evaluacion> evaluaciones,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(Evaluacion o:evaluaciones)
                pw.println(this.mail+"|"+this.idinscr+"|"+this.idcrit+"|"+this.not);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void CrearEvaluacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mail del jurado:");
        String meil = sc.next();
        System.out.println("Ingrese el ID de inscripcion:");
        String id = sc.next();
        System.out.println("Ingrese el ID del criterio a evaluar:");
        String ic = sc.next();
        System.out.println("Ingrese la nota de evaluación del Jurado:");
        double not = sc.nextDouble();
        Evaluacion u = new Evaluacion(meil, id,ic,not);
        evaluaciones.add(u);
        u.guardarEvaluacion(evaluaciones,"evaluaciones.txt");
    }

    public Evaluacion() {
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIdinscr() {
        return idinscr;
    }

    public void setIdinscr(String idinscr) {
        this.idinscr = idinscr;
    }

    public String getIdcrit() {
        return idcrit;
    }

    public void setIdcrit(String idcrit) {
        this.idcrit = idcrit;
    }

    public double getNot() {
        return not;
    }

    public void setNot(double not) {
        this.not = not;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "mail=" + mail + ", idinscr=" + idinscr + ", idcrit=" + idcrit + ", not=" + not + '}';
    }
    
}
