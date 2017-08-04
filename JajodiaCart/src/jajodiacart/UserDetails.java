/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajodiacart;

/**
 *
 * @author student
 */
public class UserDetails {
    String name;
    String password;
    String email;
    String address;
    int newCart[] =new int[3];
    int oldCart[]=new int[3];
    int count=0;
    int money=0;
    public UserDetails(String name,String password,String email,String address)
    {
        this.name=name;
        this.password=password;
        this.email=email;
        this.address=address;
        
    }
}
