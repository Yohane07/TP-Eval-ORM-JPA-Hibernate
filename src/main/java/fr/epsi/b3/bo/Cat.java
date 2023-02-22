package fr.epsi.b3.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Animal")
public class Cat extends Animal {
    @Column(name ="livEnv", nullable = false)
    private FishLivEnv livEnv;

    public Cat() {
    }
    public Cat(FishLivEnv livEnv) {
        this.livEnv = livEnv;
    }

    

}
