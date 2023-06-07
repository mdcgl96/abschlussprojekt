package ch.zhaw.datamanagement.abschlussprojekt.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Computer extends Node {

    private String marke;

    public Computer(long id, String status, List<Maintenance> services, String marke) {
        super(id, status, services);
        this.marke = marke;
    }

    public Computer(String marke) {
        this.marke = marke;
    }

    public Computer() {
    }

    public String getMarke() {
        return this.marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    
}
