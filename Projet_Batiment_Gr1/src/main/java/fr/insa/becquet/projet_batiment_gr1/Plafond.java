/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.becquet.projet_batiment_gr1;

import java.util.ArrayList;

/**
 *
 * @author becqu
 */
public class Plafond {
    private int idPlafond ;
private ArrayList<Coin> listeCoin ;
private ArrayList<Revetement> liste_rev_plafond ;
private int nbrtremis ; //ajouter nbr tremis

//Déclaration du constructeur
Plafond (int id, ArrayList<Coin> listeCoin, ArrayList<Revetement> liste_rev_plafond){
    this.idPlafond = id ;
    this.listeCoin = listeCoin ;
    this.liste_rev_plafond = liste_rev_plafond ;
} 

//get et set pour donner et utiliser les attributs
public int getidPlafond(){
    return idPlafond ;
}
public void setidPlafond(int idPlafond) {
    this.idPlafond = idPlafond ;
}
public ArrayList<Coin> getlisteCoin(){
    return listeCoin ;
}
public void setlisteCoin(ArrayList<Coin> listeCoin) {
    this.listeCoin = listeCoin ;
}
public ArrayList<Revetement> getlisteRevetement(){
    return liste_rev_plafond ;
}
public void setlisteRevetement(ArrayList<Revetement> liste_rev_plafond) {
    this.liste_rev_plafond = liste_rev_plafond ;
}
//toString()
//surface()
//montantRevetement()
}
