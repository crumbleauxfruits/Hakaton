/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.GregorianCalendar;

/**
 *
 * @author Sonja
 */
public class Hackathon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar(27, 02, 1932);
        Personne ancUlt = new Personne("Erich", "Sieker", date1);
        
        Arbre a1 = new Arbre(ancUlt);
               
        Conjoint conj1 = new Conjoint("Vera", "Sieker");
        a1.ajouterConjoint(ancUlt, conj1);
    }
    
}
