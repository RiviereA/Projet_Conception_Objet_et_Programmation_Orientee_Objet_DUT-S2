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
 * @author ar948052
 */
public class Proie extends Animal{
    
    public Proie(World world,int sexe, String string, String image, int d1, int d2) {
        super(world,sexe, string, image, d1, d2);
    }
    
    public void effect(Objet objet)
   {
       super.effect(objet);
        Etre jean = (Etre)objet;
            if ((this.getEspece().equals("Ecrevisse")) && (jean.getEspece().equals("Cadavre"))) {
                  jean.mourir();
                  this.modifEnergie(50);
            } else if ((this.getEspece().equals("Octocinclus")) && ((jean.getEspece().equals("Algue")) || (jean.getEspece().equals("Planorbe")))) {
                jean.mourir();
                this.modifEnergie(50);
            } else if ((this.getEspece().equals("Planorbe")) && (jean.getEspece().equals("Cadavre"))) {
                jean.mourir();
                this.modifEnergie(50);
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
}
