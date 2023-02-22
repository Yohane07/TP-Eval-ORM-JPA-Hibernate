package fr.epsi.b3.bo;

import javax.persistence.Column;

public class Fish extends Animal{
    @Column(name ="chipld", nullable = false)
    private String livEnv;
}
