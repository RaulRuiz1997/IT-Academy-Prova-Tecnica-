package Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici1;

import java.util.ArrayList;

public class Inici {

    public static void main(String[] args) {

        Document documentTest = new Document();
        ArrayList<String> paragrafs;

        System.out.println(documentTest.getNombreParagrafs()); //Mostra el resultat a la consola

        documentTest.setParagraf(0, "Text 0");
        documentTest.setParagraf(1, "Text 1");
        documentTest.setParagraf(2, "Text 2");
        documentTest.setParagraf(3, "Text 3");

        System.out.println(documentTest.getParagraf(1)); //Mostra el resultat a la consola

        try {
            System.out.println(documentTest.getParagraf(5)); //Tracta l’excepció mostrant el missatge d’error a la consola
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        documentTest.setParagraf(2, "Text 2 modificat");

        /*Ara, guarda el retorn del mètode documentTest.getParagrafs() a una
        variable del tipus adient, i recorre-la amb un bucle for mostrant per
        consola cada ocurrència, demostrant que el contingut final del
        document és:
        Text 0
        Text 1
        Text 2 modificat
        Text 3*/

        paragrafs = documentTest.getParagrafs();

        paragrafs.forEach(System.out::println);

        // Hago el bucle for para que veais otra manera de obtener los resultados
        /*for (int i = 0; i < paragrafs.size(); i++) {
            System.out.println(paragrafs.get(i));
        }*/

    }

}