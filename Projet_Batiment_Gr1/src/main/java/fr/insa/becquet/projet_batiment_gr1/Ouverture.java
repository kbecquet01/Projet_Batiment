/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.becquet.projet_batiment_gr1;

/**
 *
 * @author becqu
 */
public class Ouverture {
    // Déclaration des attributs de la classe coin
    private int idOuverture ;
    private double dimx ;
    private double dimy ;
    
    //déclaration du constructeur
    Ouverture(int id, double x, double y) {
        this.idOuverture=id ;
        this.dimx=x ;
        this.dimy=y ;
    }
    //get et set pour donner et utiliser les attributs
    public int getidOuverture(){
        return idOuverture ;
    }
    public void setidOuverture (int idOuverture) {
        this.idOuverture = idOuverture ;
    }
    public double getdimx(){
        return dimx ;
    }
    public void setdimx (double dimx) {
        this.dimx = dimx ;
    }
    public double getdimy(){
        return dimx ;
    }
    public void setdimy (double dimy) {
        this.dimy = dimy ;
    }
    
    //méthode pour calculer la surface d'une ouverture
    public double surface(){
        return dimx*dimy ;
    }
    void afficher(){
            System.out.println("Identifiant :"+this.idOuverture+" Dimension en x :"+this.dimx+" Dimension en y :"+this.dimy);
    }
}
//faire classes filles fenetre porte et tremis, (juste standard, pour dessin ajouter où)