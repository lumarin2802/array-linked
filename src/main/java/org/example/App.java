package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Persona> lista = new LinkedList<Persona>();

        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Luciana" ,34));
        listaArray.add(new Persona(2, "Alvaro" ,34));
        listaArray.add(new Persona(3, "Yon" ,28));
        listaArray.add(new Persona(4, "Ana" ,25));
        //agregar al principio
        //lista.add(0, new Persona(5, "Probando", 98));


        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Luciana" ,34));
        listaLinked.add(new Persona(2, "Alvaro" ,34));
        listaLinked.add(new Persona(3, "Yon" ,28));
        listaLinked.add(new Persona(4, "Ana" ,25));
        //recorrer por índice
//        System.out.println("-----FOR-----");
//        for(int i = 0; i<lista.size(); i++){
//            System.out.println("prueba: " + lista.get(i).getNombre());
//
//        }
//
//        //recorrido con foreach
//        System.out.println("------FOREACH-----");
//        for(Persona perso: lista){
//            System.out.println("prueba: " + perso.getNombre());
//        }

    //Remove en ArrayList
    listaArray.remove(1);

        //remove en LinkedList
        String nombreBorrar = "Gabriel";
        for (Persona persona2: listaLinked){
            if (persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break;
            }
        }
        System.out.println("-----LUEGO DE ELIMINAR-----");
        System.out.println("-----ARRAYLIST-----");
        for (Persona persona: listaArray){
            System.out.println("prueba " + persona.getNombre());


        }
        System.out.println("-----LINKEDLIST-----");
        for (Persona persona : listaLinked ){
            System.out.println("prueba " + persona.getNombre());
        }

        //Tamaño lista
        System.out.println("-----Qué tamaño tienen las listas?-----");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        //obtener primer objeto
        System.out.println("-----PRIMER Y ÚLTIMO OBJETO(LINKEDLIST-----)");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());

    }

}

