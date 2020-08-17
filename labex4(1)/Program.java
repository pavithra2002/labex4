/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;
import package1.*;//importing packages
import package2.*;//importing packages
import package1.newpackage1.*;//importing subpackages
import package2.newpackage2.*;//importing subpackages




/**
 *
 * @author PAVITHRA T
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //accessing all packages
        NewClass1 s=new NewClass1();
        {
            s.mul();
        }
        
        NewClass2 p=new NewClass2();
        {
            p.add();
        }
        
        
        
        NewClassofsubpack2 e=new NewClassofsubpack2();
        {
            e.div();
        }
        NewClassofsubpack1 n=new NewClassofsubpack1();
        {
            n.display1();
        }
        
    }
    
}
