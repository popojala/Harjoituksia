/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ppoojala
 */
public class Binaaripuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puuSolmu juuri = new puuSolmu(3);
        juuri.insert(2, juuri, false);
        juuri.insert(5, juuri, true);
        juuri.insert(4,juuri.right, true);
        juuri.insert(1, juuri.right, false);
        puuSolmu ajuuri = new puuSolmu(3);
        System.out.println(CompareInOrder(juuri,ajuuri));
        
    }
    public static void PreOrderPrint(puuSolmu juuri){
        if (juuri != null){
            System.out.println(juuri.key);
            PreOrderPrint(juuri.left);
            PreOrderPrint(juuri.right);
        }
    }
    public static void InOrderPrint(puuSolmu juuri){
        if (juuri != null){
            InOrderPrint(juuri.left);
            System.out.println(juuri.key);
            InOrderPrint(juuri.right);
            
        }
    }
    public static boolean CompareInOrder(puuSolmu juuri, puuSolmu toinenjuuri){
        if ((juuri != null && toinenjuuri == null) || (juuri ==null && toinenjuuri != null)){
            return false;
        }
        if (juuri !=null && toinenjuuri!= null){
            CompareInOrder(juuri.left, toinenjuuri.left);
            if (juuri.key != toinenjuuri.key){
                return false;
            }
            CompareInOrder(juuri.right, toinenjuuri.right);
        
    }
        return true;}
}
