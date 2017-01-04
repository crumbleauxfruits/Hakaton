/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Sonja
 */
public class Personne {
    private String prenom;
    private String nom;
    private GregorianCalendar dateNaissance;
    private GregorianCalendar dateMort;
    private String communeNaissance;
    private String communeEnterrement;
    private boolean genrem; //true si la personne est masculin
    private LinkedList<Conjoint> conjoints;
    private String profession;
    
    public Personne(String prenom, String nom, GregorianCalendar dateNaissance){
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }
    
    public String toString(){
        return "Personne: " + prenom + " " + nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getNom(){
        return nom;
    }
    
    public GregorianCalendar getDateNaissance(){
        return dateNaissance;
    }
    
    public LinkedList<Conjoint> getConjoints(){
        return conjoints;
    }
    
    public LinkedList<Personne> getEnfants(){
        LinkedList<Personne> enfants = new LinkedList<>();
        ListIterator<Conjoint> iter = conjoints.listIterator();
        while(iter.hasNext()){
            enfants.addAll(iter.next().getEnfants());
        }
        return enfants;
    }
    
    public void ajouterConjoint(Conjoint c){
        conjoints.add(c);
    }
    
    public void ajouterEnfant(Personne e, Conjoint c){
        
    }
    
}
