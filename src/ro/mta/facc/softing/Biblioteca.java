package ro.mta.facc.softing;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> listaCarti;

    public void sort()
    {
        Collections.sort(listaCarti);
    }


    public Biblioteca(ArrayList<Carte> listaCarti) {
        this.listaCarti=new ArrayList<Carte>();
        for (Carte c:listaCarti)
        {
            this.listaCarti.add(c);
        }
    }

    public Biblioteca() {
        listaCarti =new ArrayList<Carte>();
    }



    public void removeBook(Carte c)
    {
        listaCarti.remove(c);
    }

    public void add(Carte c)
    {
        this.listaCarti.add(c);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine: \n");
        for (Carte c: listaCarti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
