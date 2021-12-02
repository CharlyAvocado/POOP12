/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop12;

/**
 *
 * @author Hyperion
 */
public class HiloT extends Thread {

    public HiloT(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración "+i+"del "+getName());
            
        }
        System.out.println("Termina el "+getName());
    }
    
    
}
