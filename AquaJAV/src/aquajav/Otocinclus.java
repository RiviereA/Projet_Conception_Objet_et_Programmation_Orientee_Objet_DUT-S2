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
public class Otocinclus extends Animal{

    public Otocinclus(World world, int d1, int d2, int _sexe, String image) {
        super(world,_sexe,"Otocinclus", image, d1, d2);
    }

    
    @Override
    public String getEspece() {
        return "Octocinclus";
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
