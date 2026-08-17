/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

import java.time.LocalDate;

/**
 *
 * @author Samue
 */
public class Loan {
    private String idLoan;
    private Client client;
    private Book book;
    private LocalDate loanDate;
    private String status;

    public Loan(String idLoan, Client client, Book book,String status) {
        this.idLoan = idLoan;
        this.client = client;
        this.book = book;
        this.loanDate = LocalDate.now();
        this.status = status;
    }

    public String getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(String idLoan) {
        this.idLoan = idLoan;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
   
}
