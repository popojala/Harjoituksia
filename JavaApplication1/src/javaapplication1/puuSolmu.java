/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ppoojala
 */
public class puuSolmu {
    public puuSolmu left;
    public puuSolmu right;
    public int key;
    
    public puuSolmu(int key){
        this.key = key;
    }
    public void insert(int key, puuSolmu solmu, boolean puoli){
        puuSolmu uusi = new puuSolmu(key);
        if (puoli){
            solmu.right = uusi;
        }
        else 
            solmu.left = uusi;
        }
        
    
    
}
