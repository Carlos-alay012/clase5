package edu.ejercicios;
import hijo.ScrumMaster;
import padre.empleado;

public class Main {
    public static void imprime (empleado emple){
        System.out.println("Objeto.ObtenerDetalles()="+ emple.obtenerDetalles() );
    }
    public static void main(String[] args) {
//        empleado em = new empleado("juan", 2165);
//        em.direccion = "Calle 1";
//        System.out.println("Nombre = " + em.getNombre());
        ScrumMaster sm = new ScrumMaster("Juan", 3500, "desarrollo");
        System.out.println(em.toString());

    }
    public static void determinarTipo(empleado emple){
        if ( emple instanceof ScrumMaster){
            System.out.println("Esto viene de scrummaster");

        }else if (emple instanceof empleado){
            System.out.println("Esto viene de empleado");

        }else if (emple instanceof Object){
            System.out.println("Es cualquier cosa");
        }

    }

}