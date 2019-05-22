/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofobject;

/**
 *
 * @author Neeraj louji
 */
public class ArrayOfObject {
    private String name;
    private int sid;
    
public ArrayOfObject(String s,int n)
{
    name=s;
    sid=n;
}
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
    
    System.out.println("Committted");
    
    

}
