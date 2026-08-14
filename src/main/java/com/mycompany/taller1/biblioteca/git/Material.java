/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author Samue
 */
public abstract class Material {
    protected String code;
    protected String title;
    protected String launch_year;

    public Material(String code, String title, String launch_year) {
        this.code = code;
        this.title = title;
        this.launch_year = launch_year;
    }

    
    
    
    
    public abstract String Show();
    
}
