/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author mario-cabesa
 */
public class Treasure {
    private String name;
    private int bonus;
    private TreasureKind tipo;
    
    public Treasure(String n, int bonus, TreasureKind t){
        name=n;
        this.bonus = bonus;
        tipo = t;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getBonus(){
        return bonus;
    }
    
    public TreasureKind getType(){
    //CAMBIAR
        return tipo; 
    }
    
      
    
}
