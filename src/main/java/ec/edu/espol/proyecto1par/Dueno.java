
package ec.edu.espol.proyecto1par;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dueno {
    String id;
    String nombre;
    String apellido;
    int edad;    
    String email;
    ArrayList<Dueno> duenos = new ArrayList <>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dueno() {
    }
   
    public Dueno( String id,String nombre, String apellido, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }
    public void guardarDueno(ArrayList<Dueno> duenos,String nomfile){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomfile),true))){
            for(Dueno d:duenos)
                pw.println(this.id+"|"+this.nombre+"|"+this.apellido+"|"+this.edad+"|"+this.email);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void CrearDueno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del Dueño:");
        String di = sc.next();
        System.out.println("Ingrese el nombre del Dueño:");
        String name = sc.next();
        System.out.println("Ingrese el Apellido del Dueño:");
        String ap = sc.next();
        System.out.println("Ingrese la edad del Dueño:");
        int age = sc.nextInt();
        System.out.println("Ingrese el email del Dueño:");
        String mail = sc.next();
        Dueno d = new Dueno(di,name, ap, age, mail);
        duenos.add(d);
        d.guardarDueno(duenos,"dueños.txt");
        
    }

    @Override
    public String toString() {
        return "Dueño{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id=" + id + ", email=" + email + '}';
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
        Dueno u = (Dueno) o;
        return Objects.equals(u.id,this.id);
    }
}
