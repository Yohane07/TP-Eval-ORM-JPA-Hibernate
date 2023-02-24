package fr.epsi.b3.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Animal")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "birth", nullable = false)
    private Date birth;

    @Column(name = "couleur", nullable = false)
    private String couleur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "petstore_id")
    @JsonIgnore
    private Petstore petstore;


    public Animal() {
    }

    public Animal(Date birth, String couleur) {
        this.birth = birth;
        this.couleur = couleur;
    }

    public Animal(Date birth, String couleur, Petstore petstore) {
        this.birth = birth;
        this.couleur = couleur;
        this.petstore = petstore;
    }


    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Petstore getPetstore() {
        return petstore;
    }

    public void setPetstore(Petstore petstore) {
        this.petstore = petstore;
    }
}
