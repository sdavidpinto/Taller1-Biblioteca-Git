package com.mycompany.taller1.biblioteca.git;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class main {
    
    static ArrayList<Client> clients=new ArrayList<>();
    static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    
    static void CreateClient(){
        
        String id,phonenumber,name,email;
        
        id=JOptionPane.showInputDialog(null,"Please, Enter your ID","ID section",1);
        name=JOptionPane.showInputDialog(null,"Please, Enter your name","Name section",1);
        phonenumber=JOptionPane.showInputDialog(null,"Enter your phone number","Phone number",1);
        email=JOptionPane.showInputDialog(null,"Enter your Email Adress","Email Adrees",1);
       
        clients.add(new Client(id, name, phonenumber, email));
        
    }
    
    public static void main(String[] args) {
        
        
        
    }
}
