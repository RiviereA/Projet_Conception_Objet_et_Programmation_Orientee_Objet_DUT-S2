/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aquajav;

import iut.Objet;
import iut.World;
import java.util.ArrayList;

/**
 *
 * @author jv773453
 */
public abstract class Chasseur extends Animal
{
    private String[] bouffe = {"Otocinclus","Planorbe","Caneton"};
    
    public Chasseur(World world,int sexe, String string, String image, int d1, int d2) {
        super(world,sexe, string, image, d1, d2);
    }
    
    public void effect(Objet objet)
   {
       super.effect(objet);
        Etre jean = (Etre)objet;
        for (int i = 0; i < bouffe.length; i++) {
            if (jean.getEspece().equals( bouffe[i])) {
                  jean.mourir();
                  this.modifEnergie(50);
            }
        }
        
       
    }
   
    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
    
    @Override
    public void move(long l) {
        super.move(l);
    }
    
    /*public void reproduction(this, Chasseur c2)
    {
        if(this)
    }
    */
    
}
