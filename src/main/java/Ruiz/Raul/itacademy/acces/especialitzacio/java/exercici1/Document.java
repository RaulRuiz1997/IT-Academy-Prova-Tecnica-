package Ruiz.Raul.itacademy.acces.especialitzacio.java.exercici1;

import java.util.ArrayList;

public class Document {

    private ArrayList<String> paragrafs;
    private String titol;

    private int nombreParagrafs;

    public Document() {
        paragrafs = new ArrayList<>();
    }

    public ArrayList<String> getParagrafs() {
        return paragrafs;
    }

    public void setParagrafs(ArrayList<String> paragrafs) {
        this.paragrafs = paragrafs;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getNombreParagrafs() {
        // Devolvemos el tamaño del array para saber el número de paragrafos que tenemos en la lista
        return paragrafs.size();
    }

    public String getParagraf(int posicio) {

        // Si la posición es mayor o igual al tamaño del array significa que no tenemos esa posición
        if (paragrafs.size() <= posicio) {
            throw new RuntimeException("No hi ha cap paràgraf a la posició indicada");
        }

        return paragrafs.get(posicio);

    }

    public void setParagraf(int posicio, String paragraf) {

        // Si la posicion indicada ya existe en la lista, reemplazamos el valor por el nuevo, si no, la añadimos
        if (posicio < paragrafs.size()) {
            paragrafs.set(posicio, paragraf);
        } else {
            paragrafs.add(paragraf);
        }

    }

}
