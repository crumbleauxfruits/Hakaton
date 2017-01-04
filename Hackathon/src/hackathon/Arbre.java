/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Sonja
 */
public class Arbre {
    private Personne ancetreUltime;
    
    public Arbre(Personne ancUlt){
        this.ancetreUltime = ancUlt;
    }
    
    public void ajouterConjoint(Personne p, Conjoint c){
        Personne cherche = ancetreUltime;
        System.out.println(p);
        System.out.println(c);
        if(cherche.getPrenom()==p.getPrenom() || cherche.getNom()==p.getNom()
                || cherche.getDateNaissance()==p.getDateNaissance()){
            p.ajouterConjoint(c);
        }else{
            LinkedList<Personne> enfants = new LinkedList<>();            
            enfants = cherche.getEnfants();
            ListIterator<Personne> iter = enfants.listIterator();
            while(iter.hasNext()){
                ajouterConjoint(iter.next(), c);
            }
        }    
    }
}
