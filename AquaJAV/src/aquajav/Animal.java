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
public class Animal extends Etre implements iut.Bougeable{

    private double vitesseX=0.1 ; // vitesse en pixels / ms
    private double vitesseY=0.1;
    private short sensX ; // sens de déplacement (-1 vers la gauche +1 vers la droite)
    private short sensY ;
    
    public Animal(World world,int _sexe,String string, String image, int d1, int d2) 
    {
        super(world,_sexe, string, image, d1, d2);
        if(Math.random()<0.5)
            sensX=-1;
        else
            sensX=1;
        if(Math.random()<0.5)
            sensY=-1;
        else
            sensY=1;
    }
    
   public void effect(Objet objet)
   {
        if (objet instanceof Etre ) {
            Etre etre = (Etre) objet;
            if (etre.getEspece() == this.getEspece()) {
                if ((this.getEnergie()>=50) && (etre.getEnergie()>=50)) {
                    if (etre.getSexe() != this.getSexe()) {
                        this.getWorld().add(Fabrique.fabriquer(this.getWorld(),this.getEspece(),this.getMiddleX(),this.getMiddleY()) );
                        this.modifEnergie(-50);
                        etre.modifEnergie(-50);
                    }
                }            
            }
            else if (((etre.getEspece()== "Brochet") && (this.getEspece() == "Maskinonge")) || ((etre.getEspece()== "Maskinonge") && (this.getEspece() == "Brochet"))) {
                if ((this.getEnergie()>=50) && (etre.getEnergie()>=50)) {
                    if (etre.getSexe() != this.getSexe()) {
                        this.getWorld().add(Fabrique.fabriquer(this.getWorld(), "Brochet Tigre",this.getLeft(),this.getRight()) );
                        this.modifEnergie(-50);
                        etre.modifEnergie(-50);
                    }
                } 
            }
        }          
   }


    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    private String[] Poisson = {"Otocinclus","Brochet","Brochet Tigre", "Maskinonge"};
    private String[] Non_poisson = {"Caneton","Ecrevisse","Planorbes"};
    
    @Override
    public void move(long l) {        
        for (int i = 0; i < Poisson.length; i++) {
            if (this.getEspece().equals( Poisson[i])) {
                moveX(l*vitesseX*sensX);
                moveY(l*vitesseY*sensY);
                if(getRight()>=getWorld().width())
                    sensX=-1;
                if(getLeft()<=0)
                    sensX=1;
                if(getTop()<=0)
                    sensY=1;
                if(getBottom()>=getWorld().height())
                    sensY=-1;
                super.evoluate(l);
            }
        }
        
        for (int i = 0; i < Non_poisson.length; i++) {
            if (this.getEspece().equals( Non_poisson[i])) {
                moveX(l*vitesseX*sensX);
                if(getRight()>=getWorld().width())
                    sensX=-1;
                if(getLeft()<=0)
                    sensX=1;
                super.evoluate(l);
            }
        }
        
        if (this.getEspece().equals("Cadavre")) {
                sensY = -1;
                moveY(l*vitesseY*sensY);
                if(getTop()<=0)
                    vitesseY=0;
                if(getBottom()>=getWorld().height())
                    sensY=-1;
                super.evoluate(1000);
            }
    }

    @Override
    public void evoluate(long l) {
        super.evoluate(l);
    }
    
    
}
