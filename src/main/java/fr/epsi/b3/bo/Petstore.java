package fr.epsi.b3.bo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Petstore")
public class Petstore {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "managerName", nullable = false)
    private String managerName;
    @ManyToMany(mappedBy = "petstores")
    private Set<Product>products;

    @OneToMany(mappedBy = "petstore")
    private Set<Animal>animals;

    @OneToOne
    private Address Address;


    public Petstore() {

    }
    public Petstore(String name, String managerName, fr.epsi.b3.bo.Address address) {
        this.name = name;
        this.managerName = managerName;
        Address = address;
    }

    public void addProduct(Product product) {
        products.add(product);
        product.getPetstores().add(this);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

}
