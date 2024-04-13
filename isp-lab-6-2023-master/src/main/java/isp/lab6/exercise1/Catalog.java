package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class Catalog {
    private HashMap<String, Integer> evidenta;

    public Catalog() {
        this.evidenta=new HashMap<>();
    }

    public HashMap<String, Integer> getEvidenta() {
        return evidenta;
    }

    public void setEvidenta(HashMap<String,Integer> evidenta) {
        this.evidenta = evidenta;
    }

    public void adaugaNote(String materie, int nota){
        evidenta.put(materie,nota);
    }

    public Integer calculeazaMedia(){
        Integer media =0;
        Collection<Integer> nota=evidenta.values();
        Integer noteArray[]=evidenta.values().toArray(new Integer[0]);
        for (int i = 0; i <evidenta.size() ; i++) {
            media=media+noteArray[i];
        }
        media=Math.round(media/(float)noteArray.length);
        return media;
    }


    @Override
    public String toString() {
        return "Catalog{" +
                "evidenta=" + evidenta +
                '}';
    }
}
