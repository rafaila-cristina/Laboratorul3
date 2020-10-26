package ro.mta.facc.softing;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args)
    {
        /*

        Carte c=new Carte("Zece negri mititei","Agatha Christie",1939,729);
        Biblioteca b=new Biblioteca();
        b.add(c);
        b.add(new Carte("Sherlok Holmes","Sir. Connan Doyle",1922,550));
        b.add(new Carte("Codul lui Da Vinci","Dan Brown",1997,200));

        b.sort();

        System.out.println(b);

        */

        Thread.currentThread().setName("myThread");
        System.out.println(Thread.currentThread().getName());

        myThread[] threadArray=new myThread[10];

        for(int i=0;i<10;i++)
        {
            threadArray[i]=new myThread();
            threadArray[i].setName(Integer.toString(i)); //(""+i)
            threadArray[i].start();
        }

        for(int i=0; i<10; i++)
        {
            try {
                threadArray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}