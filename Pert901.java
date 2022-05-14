
package pert901;

/**
 *
 * @author kristina 20103239
 */
public class Pert901 {

    public static void main(String[] args) {
        String nim = "123456";
        mahasiswa M = new mahasiswa (nim); // constructor
        
        M.setNIM(nim); //methode
        
        System.out.println(M.getNIM());
    }
    
} 
