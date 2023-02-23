package fr.epsi.b3.bo;

import javax.persistence.Column;
import java.util.Date;

public class Fish extends Animal{
    @Column(name ="chipld", nullable = false)
    private String livEnv;

    public Fish() {
    }

    public Fish(String livEnv) {
        this.livEnv = livEnv;
    }

    public Fish(Long id, Date birth, String couleur, Petstore petstore, String livEnv) {
        super(id, birth, couleur, petstore);
        this.livEnv = livEnv;
    }

    public String getLivEnv() {
        return livEnv;
    }

    public void setLivEnv(String livEnv) {
        this.livEnv = livEnv;
    }
}
