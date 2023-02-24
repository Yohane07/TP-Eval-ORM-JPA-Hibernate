package fr.epsi.b3.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;


@Entity
public class Fish extends Animal{
    @Column(name ="livingEnv", nullable = false)
    @Enumerated(EnumType.STRING)
    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(String livingEnv) {
        this.livingEnv = FishLivEnv.valueOf(livingEnv);
    }

    /*J'ai fait un constructeur sans petstore juste pour en avoir des différents*/
    public Fish(Date birth, String couleur, FishLivEnv livingEnv) {
        super(birth, couleur);
        this.livingEnv = livingEnv;
    }

    public Fish(Date birth, String couleur, Petstore petstore, FishLivEnv livingEnv) {
        super(birth, couleur, petstore);
        this.livingEnv = livingEnv;
    }


    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
