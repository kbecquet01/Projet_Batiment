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
public class Appartement {
private int idAppartement ;
private int idNiveauAppartement ;
private Niveau niveauAppartement ;
private ArrayList<Piece> listePiece ;

//Constucteur
public Appartement (int id, int niveauApp, ArrayList<Piece> listePiece) {
    this.idAppartement = id ;
    this.idNiveauAppartement = niveauApp ;
    this.listePiece = listePiece ;
}

//get et set pour donner et utiliser les attributs
public int getidAppartement(){
    return idAppartement ;
}
public void setidAppartement(int idAppartement){
    this.idAppartement = idAppartement ;
}
public int getidNiveauAppartement(){
    return idNiveauAppartement ;
}
public void setidNiveauAppartement(int idNiveauAppartement){
    this.idNiveauAppartement = idNiveauAppartement ;
}
public Niveau getniveauAppartement(){
    return niveauAppartement ;
}
public void setniveauAppartement(Niveau niveauAppartement){
    this.niveauAppartement = niveauAppartement ;
}
/*public double surface() {
    double s=0 ;
    for (int i=0; i<=listePiece.size(); i++) {
        s=s+this.listePiece.get(i).surface() ;
    }
    return s ;
}*/
//afficher()
//montantRevement()
}
