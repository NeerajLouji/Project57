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
public class StudentTest {
    public static void main(String[] args){
        ArrayOfObject s1=new ArrayOfObject();
        s1.setName("Neeraj");
        
        ArrayOfObject s3=new ArrayOfObject();
        s3.setName("Roshan");
        
        ArrayOfObject s2=new ArrayOfObject();
        s2.setName("Loujiwe");
        
        ArrayOfObject[] list=new ArrayOfObject[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName());
        }
                
    }
    
}

