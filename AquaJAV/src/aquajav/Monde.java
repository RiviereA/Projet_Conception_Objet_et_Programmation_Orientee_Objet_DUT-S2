/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aquajav;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author am728605
 */
public class Monde extends iut.World {

    public Monde() {
        super(1650,900,"AquaJAV");       
    }

    @Override
    protected void createObjects() {
        for(int i=0;i<1;i++)
        {
            Caneton b= new Caneton(this,positionAleaX(),50, 0, "CannetonF");
            add(b);
        }
        
        /*for(int i=0;i<1;i++)
        {
            Caneton b= new Caneton(this,positionAleaX(),50, 1, "CannetonM");
            add(b);
        }*/
        
        for(int i=0;i<1;i++)
        {
            Brochet b= new Brochet(this,positionAleaX(),positionAleaY(), 0, "BrochetF");
            add(b);
        }
        
        /*for(int i=0;i<1;i++)
        {
            Brochet b= new Brochet(this,positionAleaX(),positionAleaY(), 1, "BrochetM");
            add(b);
        }*/
    }

    @Override
    protected void drawBackground(Graphics grphcs) {
        grphcs.setColor(Color.BLUE);
        grphcs.fillRect(0, 0, width(), height());
    }
    
    private int positionAleaX()
    {
        return (int)(Math.random()*this.width());
    }
    
    private int positionAleaY()
    {
        return (int)(Math.random()*this.height());
    }
}
