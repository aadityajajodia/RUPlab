/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessingsystem;
import java.util.*;
/**
 *
 * @author student
 */
public class OrderProcessingSystem {

    /**
     * @param args the command line arguments
     */
    static int opt;
    static String name="admin";
    static String password="admin";
    static String email="abc@gmail.com";
    static String phone="9415";
    static String address="varanasi";
    static boolean logout=false;
    static String cart[]=new String[10];
    static String order[]=new String[10];
    static int ordercount;
    static int count;
    static int money;
    public static void menu()
    {
        
        Scanner adi=new Scanner(System.in);
        System.out.println("1.View Order");
        System.out.println("2.Shopping Items");
        System.out.println("3.Return Order");
        System.out.println("4.Cancel Order");
        System.out.println("5.E Wallet");
        System.out.println("6.View Cart");
        System.out.println("7.Track Order");
        System.out.println("8.Edit Profile");
        System.out.println("9.Logout");
        System.out.println("Enter your option");
        opt=Integer.parseInt(adi.nextLine());
    }
    public static void vieworder()
    {
        
        for(int i=0;i<ordercount;i++)
        {
            System.out.println(order[i]);
        }
        
    }
    public static void shoppingitems()
    {
        
        Scanner adi=new Scanner(System.in);
        System.out.println("item 1");
        System.out.println("item 2");
        System.out.println("itme 3");
        System.out.println("item 4");
        System.out.println("Enter how many items you want to buy");
        count=Integer.parseInt(adi.nextLine());
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter your item name");
            cart[i]=adi.nextLine();
        }
    }
    
    public static void returnitem()
    {
        Scanner adi=new Scanner(System.in);
        if(count==0)
            System.out.println("your cart is empty");
        else
        {
            for(int i=0;i<count;i++)
            {
                System.out.println(cart[i]);
                System.out.println("Do you want to return it");
                opt=Integer.parseInt(adi.nextLine());
                if(opt==1)
                {
                    for(int j=i;j<count-1;j++)
                    {
                        cart[i]=cart[i+1];
                        count--;
                        i--;
                    }
                }
                
            }
            
            
        }
    }
    public static void cancelitem()
    {
        Scanner adi=new Scanner(System.in);
        if(count==0)
            System.out.println("your cart is empty");
        else
        {
            for(int i=0;i<count;i++)
            {
                System.out.println(cart[i]);
                System.out.println("Do you want to cancel it");
                opt=Integer.parseInt(adi.nextLine());
                if(opt==1)
                {
                    for(int j=i;j<count-1;j++)
                    {
                        cart[i]=cart[i+1];
                        count--;
                        i--;
                    }
                }
                
            }
            
            
        }
    }
    public static void e_wallet()
    {
        Scanner adi=new Scanner(System.in);
        System.out.println("you have "+money+" in your wallet");
        System.out.println("Do you want to add money");
        opt=Integer.parseInt(adi.nextLine());
        if(opt==1)
        {
            System.out.println("Enter the amount to want to add to the wallet");
            int amount=Integer.parseInt(adi.nextLine());
            money+=amount;
        }
    }
    public static void seecart()
    {
        Scanner adi=new Scanner(System.in);
        if(count!=0)
        {
            for(int i=0;i<count;i++)
            {
                System.out.println(cart[i]);

            }
            System.out.println("do you want to confirm your order");
            opt=Integer.parseInt(adi.nextLine());
            if(opt==1)
            {
                int j,k;
                for(j=ordercount,k=0;k<count;j++,k++)
                {
                    order[j]=cart[k];

                }
                ordercount+=count;
                count=0;
            }
            System.out.println("Your total amount is");
            System.out.println("Thanks for shopping with us");
    
        }
    }
    public static void trackorder()
    {
        System.out.println("Tracking System out of order");
    }
    public static void editprofile()
    {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);
        System.out.println(address);
        System.out.println("Do you want to edit something");
        System.out.println("sorry you can't");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner adi=new Scanner(System.in);
        
        
        while(true)
        {
            System.out.println("Welcome to Jajodia Cart");
            System.out.println("1.Sign Up");
            System.out.println("2.Sign In");
            System.out.println("Enter your option");
            opt=Integer.parseInt(adi.nextLine());
            if(opt==1)
            {
                
                System.out.println("Enter your Name");
                name=adi.nextLine();
                System.out.println("Enter your Address");
                address=adi.nextLine();
                System.out.println("Enter your Email");
                email=adi.nextLine();
                System.out.println("Enter your Phone Number");
                phone=adi.nextLine();
                System.out.println("Enter your password");
                password=adi.nextLine();
            }
            else if(opt==2)
            {
                
                System.out.println("Enter your Email");
                email=adi.nextLine();
                System.out.println("Enter your Passowrd");
                password=adi.nextLine();
                if(email.equals("abc@gmail.com")&&password.equals("admin"))
                {
                    System.out.println("Welcome");
                    
                    while(!logout)
                    {
                        menu();
                        switch(opt)
                        {
                            
                            case 1:
                                vieworder();
                             break;
                            case 2:
                                shoppingitems();
                                break;
                            case 3:
                                returnitem();
                                break;
                            case 4:
                                cancelitem();
                                break;
                            case 5:
                                e_wallet();
                                break;
                            case 6:
                                seecart();
                                break;
                            case 7:
                                trackorder();
                                break;
                            case 8:
                                editprofile();
                                break;
                            case 9:
                                logout=true;
                                break;
                            default:
                                
                        }
                    }
                }
                else
                {
                    System.out.println("Incorrect Credentials");
                    
                }
            }
            else
            {
                System.out.println("Invalid Option");
            }
            
        }
    }
    
}
