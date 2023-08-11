/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aquajav;

import iut.World;

/**
 *
 * @author jv773453
 */
public class Caneton extends Proie{

    Caneton(World world, int pos, int pos1, int _sexe, String image) {
        super(world,_sexe ,"Caneton", image, pos, pos1);
    }

    @Override
    public String getEspece() {
        return "Caneton";
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void move(long l) {
        super.move(l);
    }

    @Override
    public void evoluate(long l) {
        super.evoluate(l);
    }
    
}
