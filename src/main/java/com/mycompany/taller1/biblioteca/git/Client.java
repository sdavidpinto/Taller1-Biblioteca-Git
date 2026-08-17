
package com.mycompany.taller1.biblioteca.git;


public class Client extends Person{
   
    private String email;

    public Client(String id, String name, String phoneNumber,String email) {
        super(id, name, phoneNumber);
        this.email = email;
    }

    @Override
    public String Show() {
        return "Id: "+id+"\n"+"Name:"+name+"\n"+"Phone number: "+phoneNumber+"\n"+"Email Adress: "+email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
   
}
