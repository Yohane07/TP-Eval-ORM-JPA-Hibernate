package fr.epsi.b3.bo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Animal")
public class Cat extends Animal {
    @Column(name ="chipId", nullable = false)
    private String chipId;

    public Cat() {
    }

    public Cat(Date birth, String couleur, Petstore petstore, String chipId) {
        super(birth, couleur, petstore);
        this.chipId = chipId;
    }


    public String getChipId() {
        return chipId;
    }

    public void setChipld(String chipld) {
        this.chipId = chipId;
    }
}
