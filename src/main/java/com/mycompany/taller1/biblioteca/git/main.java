package com.mycompany.taller1.biblioteca.git;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Main {
    
    static ArrayList<Client> clients=new ArrayList<>();
    static ArrayList<Book> books=new ArrayList<>();
    
    static void CreateClient(){
        
        String id,phonenumber,name,email;
        
        id=JOptionPane.showInputDialog(null,"Please, Enter your ID","ID section",1);
        name=JOptionPane.showInputDialog(null,"Please, Enter your name","Name section",1);
        phonenumber=JOptionPane.showInputDialog(null,"Enter your phone number","Phone number",1);
        email=JOptionPane.showInputDialog(null,"Enter your Email Adress","Email Adrees",1);
       
        clients.add(new Client(id, name, phonenumber, email));
        
    }
    static void ListClient(){
        JTextArea salida=new JTextArea(30,40);
        JScrollPane Tabla=new JScrollPane(salida);
        salida.setText("ID\tName\tPhoneNumber\tEmail \n");
        for (Client client : clients) {
           salida.append(client.getId()+"\t"+client.getName()+"\t"+client.getPhoneNumber()+"\t"+client.getEmail()+"\t");
        }
        JOptionPane.showMessageDialog(null, Tabla);
    }
    
    static void SearchClient(){
        String idtoSearch = null;
        boolean encontrado=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter your ID","Search ID",1);
        for (Client client : clients) {
            if (client.getId().equals(idtoSearch)) {
                
                JOptionPane.showMessageDialog(null,client.Show(),"Cliente encontrado",0);
                encontrado=true;
                break;
            }
            
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
        
    }
    
    static void DeleteClient(){
        String idtoSearch = null;
        boolean encontrado=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter your ID","Search ID",1);
        for (Client client : clients) {
            if (client.getId().equals(idtoSearch)) {
                clients.remove(client);
                
                JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente","Cliente eliminado",0);
                encontrado=true;
                break;
            }
            
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }

        
    }
    static void CreateBook(){
        
        String code,name,year,author;
        
        code=JOptionPane.showInputDialog(null,"Please, Enter the Book´s code","ID section",1);
        name=JOptionPane.showInputDialog(null,"Please, Enter Book´s title","Name section",1);
        year=JOptionPane.showInputDialog(null,"Enter Book´s launch year ","launch year",1);
        author=JOptionPane.showInputDialog(null,"Enter Book´s author","Author Section",1);
       
        books.add(new Book(code, name,year, author, true));
        
    }
    
    static void ListBook(){
        JTextArea salida=new JTextArea(30,40);
        JScrollPane Tabla=new JScrollPane(salida);
        salida.setText("ID\ttitle\tlaunch year\tauthor \n");
        for (Book book : books) {
           salida.append(book.getCode()+"\t"+book.getTitle()+"\t"+book.getLaunch_year()+"\t"+book.getAuthor()+"\t");
        }
        JOptionPane.showMessageDialog(null, Tabla);
    }
    
    static void SearchBook(){
        String idtoSearch = null;
        boolean encontrado=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter the book´s code","Search ID",1);
        for (Book book : books) {
            if (book.getCode().equals(idtoSearch)) {
                encontrado=true;
                JOptionPane.showMessageDialog(null,book.Show(),"libro encontrado",0);
                break;
            }
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
    }
    
   public static void main(String[] args) {
        
    }
}
