/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author Samue
 */
public class Client extends Person{
   
    private String email;

    public Client(String id, String name, String phoneNumber,String email) {
        super(id, name, phoneNumber);
        this.email = email;
    }

    @Override
    public String Show() {
        return "Id: "+id+"\n"+"Name:"+name+"Phone number: "+phoneNumber+"\n"+"Email Adress: "+email;
    }
    
    
    
    
    
    
   
}
