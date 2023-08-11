/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aquajav;

import iut.World;

/**
 *
 * @author User
 */
public class Cadavre extends Animal{

    public Cadavre(World world, String image, int d1, int d2) {
        super(world, 3, "Cadavre", image, d1, d2);
    }
    
    @Override
    public String getEspece() {
        return "Cadavre";
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
