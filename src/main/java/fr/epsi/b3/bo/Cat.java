package fr.epsi.b3.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Animal")
public class Cat extends Animal {
    @Column(name ="livEnv", nullable = false)
    private FishLivEnv livEnv;

    public Cat() {
    }

    public Cat(Long id, Date birth, String couleur, Petstore petstore, FishLivEnv livEnv) {
        super(id, birth, couleur, petstore);
        this.livEnv = livEnv;
    }

    public Cat(FishLivEnv livEnv) {
        this.livEnv = livEnv;
    }

    public FishLivEnv getLivEnv() {
        return livEnv;
    }

    public void setLivEnv(FishLivEnv livEnv) {
        this.livEnv = livEnv;
    }
}
