package com.Praj.Spring.DI;

public class Teacher {
    private Principle principle;


    public Teacher() {
        this.principle = principle;
    }

    public void setPrinciple(Principle principle) {
        this.principle = principle;
    }

    public void show(){
        principle.display();
    }
}
