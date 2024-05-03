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
public class Piece {
    private int idPiece ;
private int sol ;
private int plafond ;
private ArrayList<Mur> listeMurs ;
private String usage ;
//get et set pour donner et utiliser les attributs
public Piece(){
    
}
public Piece(int idPiece, String usage, int sol,int plafond, ArrayList<Mur> listeMurs){
    this.idPiece=idPiece;
    this.usage=usage;
    this.sol=sol;
    this.plafond=plafond;
    this.listeMurs=listeMurs;
}
public int getidPiece(){
    return idPiece ;
}
public void setidPiece(int idPiece) {
    this.idPiece = idPiece ;
}
public int getsol(){
    return sol ;
}
public void setsol(int sol) {
    this.sol = sol ;
}
public int getplafond(){
    return plafond ;
}
public void setplafond(int plafond) {
    this.plafond = plafond ;
}
public ArrayList<Mur> getlisteMurs(){
    return listeMurs ;
}
public void setlisteMurs(ArrayList<Mur> listeMurs) {
    this.listeMurs = listeMurs ;
}
public String getusage(){
    return usage ;
}
public void setusage(String usage) {
    this.usage = usage ;
}
//surface d'une pièce égale surface au sol
}
