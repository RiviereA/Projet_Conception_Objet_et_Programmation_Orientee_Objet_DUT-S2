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
public class Planorbes extends Animal {

    public Planorbes(World world, int d1, int d2, String image) {
        super(world, 2, "Planorbe", image, d1, d2);
    }
    
    @Override
    public String getEspece() {
        return "Planorbe";
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
