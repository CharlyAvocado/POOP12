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
public class EjercicioThreadGroup extends Thread {

    public EjercicioThreadGroup(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());            
        }
    }
    
   
}
