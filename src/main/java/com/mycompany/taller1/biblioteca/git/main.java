/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Main {
    
    static ArrayList<Client> clients=new ArrayList<>();
    static ArrayList<Book> books=new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    
    static void CreateClient(){
        
        String id,phonenumber,name,email;
        
        id=JOptionPane.showInputDialog(null,"Please, Enter your ID","ID section",3);
        name=JOptionPane.showInputDialog(null,"Please, Enter your name","Name section",3);
        phonenumber=JOptionPane.showInputDialog(null,"Enter your phone number","Phone number",3);
        email=JOptionPane.showInputDialog(null,"Enter your Email Adress","Email Adrees",3);
       
        clients.add(new Client(id, name, phonenumber, email));
        
    }
    static void ListClient(){
        JTextArea salida=new JTextArea(30,40);
        JScrollPane Tabla=new JScrollPane(salida);
        salida.setText("ID\tName\tPhoneNumber\tEmail \n");
        for (Client client : clients) {
           salida.append(client.getId()+"\t"+client.getName()+"\t"+client.getPhoneNumber()+"\t"+client.getEmail()+"\n");
        }
        JOptionPane.showMessageDialog(null, Tabla);
    }
    
    static void SearchClient(){
        String idtoSearch = null;
        boolean exist=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter your ID","Search ID",3);
        for (Client client : clients) {
            if (client.getId().equals(idtoSearch)) {
                
                JOptionPane.showMessageDialog(null,client.Show(),"Cliente encontrado",1);
                exist=true;
                break;
            }
            
        }
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
        
    }
    
    static void UpdateClient(){
        String idtoSeek="";
        boolean exist=false;
        
        idtoSeek=JOptionPane.showInputDialog(null,"Please, Enter your ID","Search ID",1);
        for (Client client : clients) {
            if (client.getId().equals(idtoSeek)) {
                exist=true;
                client.setName(JOptionPane.showInputDialog(null,"Please, Enter your new name","Name section",3));
                client.setPhoneNumber(JOptionPane.showInputDialog(null,"Please, Enter your new phone number","phone number section",3));
                client.setEmail(JOptionPane.showInputDialog(null,"Please, Enter your new email","email section",3));
                JOptionPane.showMessageDialog(null,"Cambio realizado");
                break;
            }
        }
        
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
        
    }
    
    
    static void DeleteClient(){
        String idtoSearch = null;
        boolean exist=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter your ID","Search ID",3);
        for (Client client : clients) {
            if (client.getId().equals(idtoSearch)) {
                clients.remove(client);
                
                JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente","Cliente eliminado",1);
                exist=true;
                break;
            }
            
        }
        
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }

        
    }
    static void CreateBook(){
        
        String code,name,year,author;
        
        code=JOptionPane.showInputDialog(null,"Please, Enter the Book´s code","ID section",3);
        name=JOptionPane.showInputDialog(null,"Please, Enter Book´s title","Name section",3);
        year=JOptionPane.showInputDialog(null,"Enter Book´s launch year ","launch year",3);
        author=JOptionPane.showInputDialog(null,"Enter Book´s author","Author Section",3);
       
        books.add(new Book(code, name,year, author, true));
        
    }
    
    static void ListBook(){
        JTextArea salida=new JTextArea(30,40);
        JScrollPane Tabla=new JScrollPane(salida);
        salida.setText("ID\ttitle\tlaunch year\tauthor \n");
        for (Book book : books) {
           salida.append(book.getCode()+"\t"+book.getTitle()+"\t"+book.getLaunch_year()+"\t"+book.getAuthor()+"\n");
        }
        JOptionPane.showMessageDialog(null, Tabla);
    }
    
    static void SearchBook(){
        String idtoSearch = null;
        boolean exist=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter the book´s code","Search ID",3);
        for (Book book : books) {
            if (book.getCode().equals(idtoSearch)) {
                exist=true;
                JOptionPane.showMessageDialog(null,book.Show(),"libro encontrado",1);
                break;
            }
        }
        
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
    }
    
    static void UpdateBook(){
        String idtoSeek="";
        boolean encontrado=false;
        
        idtoSeek=JOptionPane.showInputDialog(null,"Please, Enter your Book´s ID","Search ID",3);
        for (Book book: books) {
            if (book.getCode().equals(idtoSeek)) {
                encontrado=true;
                book.setTitle(JOptionPane.showInputDialog(null,"Please, Enter the new title","Name section",3));
                book.setAuthor(JOptionPane.showInputDialog(null,"Please, Enter the new author","author section",3));
                book.setLaunch_year(JOptionPane.showInputDialog(null,"Please, Enter the new launch year","year section",3));
                JOptionPane.showMessageDialog(null,"Cambio realizado");
                break;
            }
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
        
    }
    
    static void DeleteBook(){
        String idtoSearch = null;
        boolean exist=false;
        
        idtoSearch=JOptionPane.showInputDialog(null,"Please, Enter the book code","Search ID",3);
        for (Book book: books) {
            if (book.getCode().equals(idtoSearch)) {
                books.remove(book);
                
                JOptionPane.showMessageDialog(null,"libro eliminado correctamente","libro eliminado",1);
                exist=true;
                break;
            }
            
        }
        
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }

        
    }
    
   static void CreateLoan(){
       String idClient,idBook,idLoan;
       boolean existClient=false;
       boolean existBook=false;
       
       
        idClient=JOptionPane.showInputDialog(null,"Please, Enter the client´s id","Client id",3);
        for (Client client : clients) {
            if (client.getId().equals(idClient)) {
                
                
                
                idBook=JOptionPane.showInputDialog(null,"Please, Enter the book´s code","Search ID",3);
                for (Book book : books) {
                    if (book.getCode().equals(idBook) && book.isAvailable()) {
                        
                        idLoan=JOptionPane.showInputDialog(null,"Ingrese un ID para identificar el prestamo","Asignar id al prestamo", 3);
                        
                        book.setAvailable(false);
                        loans.add(new Loan(idLoan, client, book,"Active"));
                        existBook=true;
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"Libro no disponible","Aviso de busqueda",2);
                        break;
                    }
                }
        
                if (!existBook) {
                    JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
                }
                
                existClient=true;
                break;
            }
            
        }
        if (!existClient) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        } 
   } 
   
   static void Devolution(){
       
       String idloan;
       boolean exist=false;
       
       idloan=JOptionPane.showInputDialog(null,"Please, Enter code of loan","Loan id",1);
       for (Loan loan : loans) {
           if (loan.getIdLoan().equals(idloan)) {
               loan.getBook().setAvailable(true);
               loans.remove(loan);
               JOptionPane.showMessageDialog(null,"Prestamo finalizado","Prestamo concluido",1);
               
               exist=true;
               break;
           }
       }
       
        if (!exist) {
            JOptionPane.showMessageDialog(null,"Id no existente","Aviso de busqueda",2);
        }
   }
   
  static void ListLoans(){
       JTextArea salida=new JTextArea(30,40);
        JScrollPane Tabla=new JScrollPane(salida);
        salida.setText("id\tClient\tBook\tStatus\tDate\n");
        for (Loan loan: loans) {
           salida.append(loan.getIdLoan()+"\t"+loan.getClient().getName()+"\t"+loan.getBook().getTitle()+"\t"+loan.getStatus()+"\t"+loan.getLoanDate()+"\n");
        }
        JOptionPane.showMessageDialog(null, Tabla);
  }
   
   
   public static void main(String[] args) {
         int opcionPrincipal;
        do {
            String[] opcionesPrincipal = {"Clientes", "Libros", "Prestamos", "Salir"};
            opcionPrincipal = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPrincipal, opcionesPrincipal[0]);

            switch (opcionPrincipal) {
                case 0:
                    int opcionClientes;
                    do {
                        String[] opcionesClientes = {"Crear", "Listar", "Buscar", "Actualizar", "Eliminar", "Volver"};
                        opcionClientes = JOptionPane.showOptionDialog(null, "Gestion de Clientes", "Menu Clientes",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesClientes, opcionesClientes[0]);

                        switch (opcionClientes) {
                            case 0:
                                CreateClient();
                                break;
                            case 1:
                                ListClient();
                                break;
                            case 2:
                                SearchClient();
                                break;
                            case 3:
                                UpdateClient();
                                break;
                            case 4:
                                DeleteClient();
                                break;
                            default:
                                break;
                        }
                    } while (opcionClientes != 5 && opcionClientes != -1);
                    break;

                case 1:
                    int opcionLibros;
                    do {
                        String[] opcionesLibros = {"Crear", "Listar", "Buscar", "Actualizar", "Eliminar", "Volver"};
                        opcionLibros = JOptionPane.showOptionDialog(null, "Gestion de Libros", "Menu Libros",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesLibros, opcionesLibros[0]);

                        switch (opcionLibros) {
                            case 0:
                                CreateBook();
                                break;
                            case 1:
                                ListBook();
                                break;
                            case 2:
                                SearchBook();
                                break;
                            case 3:
                                UpdateBook();
                                break;
                            case 4:
                                DeleteBook();
                                break;
                            default:
                                break;
                        }
                    } while (opcionLibros != 5 && opcionLibros != -1);
                    break;

                case 2:
                    int opcionPrestamos;
                    do {
                        String[] opcionesPrestamos = {"Crear prestamo", "Listar prestamos", "Devolucion", "Volver"};
                        opcionPrestamos = JOptionPane.showOptionDialog(null, "Gestion de Prestamos", "Menu Prestamos",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPrestamos, opcionesPrestamos[0]);

                        switch (opcionPrestamos) {
                            case 0:
                                CreateLoan();
                                break;
                            case 1:
                                ListLoans();
                                break;
                            case 2:
                                Devolution();
                                break;
                            default:
                                break;
                        }
                    } while (opcionPrestamos != 3 && opcionPrestamos != -1);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;

                default:
                    break;
            }
        } while (opcionPrincipal != 3 && opcionPrincipal != -1);
        }
   
}

