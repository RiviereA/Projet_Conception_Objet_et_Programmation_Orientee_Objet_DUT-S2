/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aquajav;

import iut.Objet;
import iut.World;

/**
 *
 * @author jv773453
 */
public abstract class Etre extends iut.ObjetTouchable {
    private Sexe sexe;
    private String espece;
    private int ENERGIE = 100;
    private double age=0;
    private final double esperanceVie = 60*1000;
    private Boolean vivant = true;
    
    public Etre(World world,int _sexe,String string, String image, int d1, int d2) {   
        super(world,image, d1, d2);
         if (_sexe == 0) {
           this.sexe = Sexe.FEMELLE; 
        }
        else if (_sexe == 1) {
            this.sexe = Sexe.MALE;
        }
        else if (_sexe == 2) {
            this.sexe = Sexe.HERMAPHRODITE;        
        }
        else if (_sexe == 3){
            this.sexe = Sexe.ASEXUE;
        }
        else if (_sexe == 4){
            this.sexe = Sexe.HYBRIDE;
        }

        espece = string;
    }
    
    public String getEspece() 
    {
        return this.espece;
    }
    public Sexe getSexe(){
        return this.sexe;
    }

    public int getEnergie(){
        return this.ENERGIE ;
    }
    
    public void modifEnergie(int Energie){
        if (ENERGIE+Energie >100) {
            ENERGIE = 100;
        }
        else{
           ENERGIE += Energie;          
        }
    }
    
    public void mourir(){
        if (this.getEspece() != "Cadavre") {
            String image = espece + "C";
            this.getWorld().add(Fabrique.ajouteCadavre(this.getWorld(), image, this.getMiddleX(), this.getMiddleY()));
            getWorld().remove(this);
        } else {
            getWorld().remove(this);
        }
    }
    
    public boolean isAlive() {
        if (ENERGIE > 0) {
            vivant = true;
        } else {
            vivant = false;
            mourant();
        }
        return vivant;
    }
    
    @Override
    public void evoluate(long dt) {
        age += dt; // il vieillit
        if(age > esperanceVie) // trop vieux !
        {
            this.mourir();
        }  
        double count=0;
        count += dt;
        if(count>=1000)
        {
            count = 0;
            ENERGIE--;
            isAlive();
        }
    }
    
    public void mourant(){
        if (vivant == false) mourir();
    }
}
