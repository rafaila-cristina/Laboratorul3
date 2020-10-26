package ro.mta.facc.softing;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private  int an_apartitie;
    private int nr_pagini;

    @Override
    public int compareTo(Carte o) {
        if (this.nr_pagini < o.nr_pagini)
            return -1;
        if (this.nr_pagini > o.nr_pagini)
            return 1;
        return 0;
    }

    public Carte(String titlu, String autor, int an_apartitie, int nr_pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.an_apartitie = an_apartitie;
        this.nr_pagini = nr_pagini;
    }

    @Override
    public String toString() {
        return this.titlu + " scrisa de "+this.autor+" a fost publicata in anul "+this.an_apartitie;
    }
}
