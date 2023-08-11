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
public class Fabrique {
    public static Etre fabriquer(World world,String espece,int pos,int pos1){
        double sexe = Math.random();
        if (sexe <= 0.5) {
            switch(espece){            
                case "Caneton" : return new Caneton(world,pos,pos1,0,"CannetonF");
                case "Ecrevise" : return new Ecrevisse(world,pos,pos1,0,"EcrevisseF");
                case "Otocinclus" : return new Otocinclus(world,pos,pos1,0,"OctocinclusF");
                case "Brochet" : return new Brochet(world,pos,pos1,0,"BrochetF");
                case "Maskinonge" : return new Brochet(world,pos,pos1,0,"MaskinongeF");
                case "Planorbe" : return new Brochet(world,pos,pos1,0,"EscargotMF");
                case "Brochet Tigre" : return new Brochet(world,pos,pos1,0,"Brochet_tigreF");
            }  
        }
        else {
            switch(espece){  
                case "Caneton" : return new Caneton(world,pos,pos1,0,"CannetonM");
                case "ecrevise" : return new Ecrevisse(world,pos,pos1,0,"EcrevisseM");
                case "Otocinclus" : return new Otocinclus(world,pos,pos1,0,"OctocinclusM");
                case "Brochet" : return new Brochet(world,pos,pos1,0,"BrochetM");
                case "Maskinonge" : return new Brochet(world,pos,pos1,0,"MaskinongeM");
                case "Planorbe" : return new Brochet(world,pos,pos1,0,"EscargotMF");
                case "Brochet Tigre" : return new Brochet(world,pos,pos1,0,"Brochet_tigreM");
            }
        }
        
        return null;
    }
    
    public static Etre ajouteCadavre(World world,String image,int pos,int pos1) {
        Cadavre c = new Cadavre(world,image,pos,pos1);
        return null;
    }
}
