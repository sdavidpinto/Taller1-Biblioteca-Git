/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author Samue
 */
public class Book extends Material{
    private String author;
    private boolean available;

    public Book(String code, String title, String launch_year,String author, boolean available) {
        super(code, title, launch_year);
        this.author = author;
        this.available =true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String Show() {
        return "Book code: "+code+"\n"+"Name:"+title+"\n"+"launch year: "+launch_year+"\n"+"author:"+author+"\n"+"is available?: "+available;
    }
    
    
    
    
}
