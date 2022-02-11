package com.example.myapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column(name = "address")
    private String country;
    @Column
    private int rating;
    @Column
    private String type;
    @Column
    private Date dateRevised;
    @Column
    private String revisedBy;

    public Place(){

    }

    public Place(String name, String country, int rating, String type, Date dateRevised, String revisedBy) {
        this.name = name;
        this.country = country;
        this.rating = rating;
        this.type = type;
        this.dateRevised = dateRevised;
        this.revisedBy = revisedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {return country;}

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateRevised() {
        return dateRevised;
    }

    public void setDateRevised(Date dateRevised) {
        this.dateRevised = dateRevised;
    }

    public String getRevisedBy() {
        return revisedBy;
    }

    public void setRevisedBy(String revisedBy) {
        this.revisedBy = revisedBy;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", type='" + type + '\'' +
                ", dateRevised=" + dateRevised +
                ", revisedBy='" + revisedBy + '\'' +
                '}';
    }
}
