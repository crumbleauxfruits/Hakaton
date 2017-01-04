/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 *
 * @author Sonja
 */
public class Conjoint {
    private String prenom;
    private String nom;
    private LinkedList<GregorianCalendar> datesMariage;
    private LinkedList<GregorianCalendar> datesPACS;
    private LinkedList<GregorianCalendar> datesSeparation;
    private LinkedList<GregorianCalendar> datesDivorce;
    private LinkedList<Personne> enfants;
    
    public Conjoint(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }
    
    public String toString(){
        return "Conjoint: " + prenom + " " + nom; 
    }
    
    public LinkedList getEnfants(){
        return enfants;
    }
}
