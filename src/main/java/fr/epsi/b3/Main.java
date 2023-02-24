package fr.epsi.b3;

import fr.epsi.b3.bo.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour Monsieur!, j'espère que vous allez bien désolé de push tard j'ai beaucoup de " +
                "temps libre et je rentre du boulot sinon j'ai bien compris le cours merci de compréhension");

        troisEnregistrementsDifferents();

    }
    private static void troisEnregistrementsDifferents(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "tpEvalJPAHibernate" );
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Address petadress1 = new Address("12", "rue Emile Pehant", "44000", "Nantes");
        Address petadress2 = new Address("13", "rue Eugnes", "44100", "Nantes");
        Address petadress3 = new Address("14", "rue Pergeline", "44200", "Nantes");


        Product product1 = new Product("1234", "bracelet", ProdType.ACCESSORY, 35.00);
        Product product2 = new Product("1432", "jambon", ProdType.FOOD, 2.00);
        Product product3 = new Product("2341", "eponge", ProdType.CLEANING, 4.00);

        Petstore petstore1 = new Petstore("petstorama", "Alex", petadress1);
        Petstore petstore2 = new Petstore("petstorama2", "Paix", petadress2);
        Petstore petstore3 = new Petstore("petstorama3", "Narcisse", petadress3);


        petstore1.addProduct(product1);
        petstore1.addProduct(product2);
        petstore1.addProduct(product3);

        petstore2.addProduct(product1);
        petstore2.addProduct(product2);
        petstore2.addProduct(product3);

        petstore3.addProduct(product1);
        petstore3.addProduct(product2);
        petstore3.addProduct(product3);


        Animal nemo = new Fish(new Date(),"Blue",FishLivEnv.FRESH_WATER);
        Animal mrchat= new Cat(new Date(),"orange", petstore1, "2333");
        Animal garfield = new Cat(new Date(),"orange", petstore1,"44543");


        em.persist(petadress1);
        em.persist(petadress2);
        em.persist(petadress3);

        em.persist(product1);
        em.persist(product2);
        em.persist(product2);

        em.persist(petstore1);
        em.persist(petstore2);
        em.persist(petstore3);

        em.persist(nemo);
        em.persist(mrchat);
        em.persist(garfield);

    }

}

