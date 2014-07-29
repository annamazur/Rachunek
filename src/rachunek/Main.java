/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rachunek;

/**
 *
 * @author pmazur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HelloPablo");
        // zmiana
        TRachunek ror, pror;
        double odsetki;
        ror=new TRachunek("Ala", "Nowak");
        ror.Wplata(400);
        odsetki=ror.NaliczOdsetki(2.3);
        System.out.println(odsetki);
        System.out.println(ror.Wyplata(400));
        
        pror=new TRachunek("Janek", "Kowalski", 1000);
        pror.setDebet(500);
        System.out.println("Przelew "+pror.Przelew(ror, 350));
        System.out.println(ror.toString());
    }
    
}
