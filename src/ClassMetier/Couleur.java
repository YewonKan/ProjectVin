/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMetier;

/**
 *
 * @author 82103
 */
public class Couleur {
      private String nomCouleur;

    // Constructeur
    public Couleur(String unNom)
    {
        nomCouleur = unNom;
    }

    public String getNomCouleur() {
        return nomCouleur;
    }

    public void setNomCouleur(String nomCouleur) {
        this.nomCouleur = nomCouleur;
    }
}
