package org.springframework.samples;
// Generated 2008-5-8 14:10:19 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Visits generated by hbm2java
 */
public class Visits  implements java.io.Serializable {


     private int id;
     private Pets pets;
     private Date visitDate;
     private String description;

    public Visits() {
    }

	
    public Visits(int id, Pets pets) {
        this.id = id;
        this.pets = pets;
    }
    public Visits(int id, Pets pets, Date visitDate, String description) {
       this.id = id;
       this.pets = pets;
       this.visitDate = visitDate;
       this.description = description;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Pets getPets() {
        return this.pets;
    }
    
    public void setPets(Pets pets) {
        this.pets = pets;
    }
    public Date getVisitDate() {
        return this.visitDate;
    }
    
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


