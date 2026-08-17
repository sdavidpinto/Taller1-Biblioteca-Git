
package com.mycompany.taller1.biblioteca.git;

//cambio en el archivo para forzar add

public abstract class Person {
    protected String id;
    protected String name;
    protected String phoneNumber;

    public Person(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public abstract String Show();
    
}
