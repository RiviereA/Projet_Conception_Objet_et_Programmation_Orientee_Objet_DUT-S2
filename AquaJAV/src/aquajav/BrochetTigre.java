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
public class BrochetTigre extends Chasseur {

    public BrochetTigre(World world, int d1, int d2,  String image) { 
        super(world,4, "Brochet Tigre", image, d1, d2); 
    }

    
    @Override
    public String getEspece() {
        return "Brochet Tigre" ;
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
