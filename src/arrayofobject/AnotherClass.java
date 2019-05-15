/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobject;

/**
 *
 * @author Neeraj
 */
public class AnotherClass {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayOfObject s1=new ArrayOfObject();
        s1.setName("Neeraj");
        System.out.println(s1.getName());
        
        ArrayOfObject s3=new ArrayOfObject();
        s3.setName("Brian");
        System.out.println(s3.getName());
        
        ArrayOfObject[] s2=new ArrayOfObject[2];
        s2[0]=s1;
        s2[1]=s3;
        
        for(int i=0;i<s2.length;length;i++)
        {
        System.out.println(s2[i].getName);
        }
        
    }
    
}
