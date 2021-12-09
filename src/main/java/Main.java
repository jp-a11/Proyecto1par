
import ec.edu.espol.proyecto1par.Concurso;
import ec.edu.espol.proyecto1par.Criterio;
import ec.edu.espol.proyecto1par.Dueno;
import ec.edu.espol.proyecto1par.Evaluacion;
import ec.edu.espol.proyecto1par.Inscripcion;
import ec.edu.espol.proyecto1par.Mascota;
import ec.edu.espol.proyecto1par.MiembroJurado;
import ec.edu.espol.proyecto1par.Premios;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int op;
        while(!salir){
            System.out.println("Menú de opciones");
            System.out.println("1. Dueño");
            System.out.println("2. Mascota");
            System.out.println("3. Concurso");
            System.out.println("4. Premio");
            System.out.println("5. Criterio");
            System.out.println("6. Inscripción");
            System.out.println("7. MiembroJurado");
            System.out.println("8. Evaluación");
            System.out.println("9. Salir.");
            try{
                
            
            System.out.println("Introduzca una opción: ");
            op = sn.nextInt();
            switch (op){
                case 1:
                    Dueno d = new Dueno();
                    d.CrearDueno();
                    break;
                case 2:
                    Mascota h = new Mascota();
                    h.CrearMascota();
                    break;
                case 3:
                    Concurso c = new Concurso();
                    c.CrearConcurso();
                    break;
                case 4:
                    Premios p = new Premios();
                    p.CrearPremio();
                    break;
                case 5:
                    Criterio r = new Criterio();
                    r.CrearCriterio();
                    break;
                case 6:
                    Inscripcion k = new Inscripcion();
                    k.CrearInscripcion();
                    break;
                case 7:
                    MiembroJurado l = new MiembroJurado();
                    l.CrearMiembro();
                    break;
                case 8:
                    Evaluacion w = new Evaluacion();
                    w.CrearEvaluacion();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("El número ingresado no pertenece al menú.");
            }
            }catch(InputMismatchException e){
                System.out.println("Debe introducir un número.");
                sn.next();
            }
        }
        
    }
    
}
