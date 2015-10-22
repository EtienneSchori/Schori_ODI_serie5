/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hegarc.ig.odi.clientcompte.program;

import ch.hegarc.ig.odi.clientcompte.business.Account;
import ch.hegarc.ig.odi.clientcompte.business.Customer;

/**
 *
 * @author gary.criblez
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Customer c1 = new Customer(1, "jean", "jacque");
        c1.addAccount("1", "courant", 0.02);
        c1.getAccountByNumber("1").credit(100);
        System.out.println("customer 1 :"+c1.getAccountByNumber("1").getBalance());
        
        
        Customer c2 = new Customer(2,"yves","maurice");
        c2.addAccount("1", "courant", 0.02);
        c2.getAccountByNumber("1").credit(100);
        System.out.println("customer 2 :"+c2.getAccountByNumber("1").getBalance());
        
        Account.transfer(100, c1.getAccountByNumber("1"), c2.getAccountByNumber("1"));
        System.out.println("");
        System.out.println("Apres transfert");
        System.out.println("customer 1 :"+c1.getAccountByNumber("1").getBalance());
        System.out.println("customer 1 :"+c2.getAccountByNumber("1").getBalance());
    }
    
}
