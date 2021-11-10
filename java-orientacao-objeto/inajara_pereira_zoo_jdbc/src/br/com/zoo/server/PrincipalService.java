package br.com.zoo.server;

import br.com.zoo.model.dao.AnimalDAO;
import br.com.zoo.model.dao.DonoDAO;

import java.sql.SQLException;
import java.text.ParseException;


public class PrincipalService {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {

        // ---------------------------------------------------------------------------------------------------//
//        Animal animal = new Animal("Fiona", "Cachorro", "F", "Branco SRD",
//                "05/10/2021", "05/09/2019", 1);
//        System.out.println(animal.calculaIdade(animal.getDataNascimento()));

        // ---------------------------------------------------------------------------------------------------//
        DonoDAO donoDAO = new DonoDAO();
        AnimalDAO animalDAO = new AnimalDAO();

//        Dono dono01 = new Dono("Larissa", "48987654123");
//        donoDAO.save(dono01);
//        Dono dono02 = new Dono("Rafaela", "48321654897");
//        donoDAO.save(dono02);

//        Animal anima01 = new Animal("Fiona", "Cachorro", "F", "Branco SRD",
//                "05/10/2021", "15/01/2015", 1);
//        animalDAO.save(anima01);
//        Animal anima02 = new Animal("Gambou", "Gato", "M", "Cinza Inglês",
//                "05/10/2021", "08/10/2020", 2);
//        animalDAO.save(anima02);

        // ---------------------------------------------------------------------------------------------------//
//        Dono dono03 = new Dono("Chico", "48987635241");
//        donoDAO.save(dono03);
//        Dono dono04 = new Dono(3, "Cleberson");
//        donoDAO.update(dono04);

//        Animal animal03 = new Animal(3,"Tom&Jerry");
//        animalDAO.update(animal03);

        // ---------------------------------------------------------------------------------------------------//
//        System.out.println(animalDAO.findAll());
//        System.out.println(donoDAO.findAll());

        // ---------------------------------------------------------------------------------------------------//
//        System.out.println(donoDAO.findById(2));
//        System.out.println(animalDAO.findById(2));

        // ---------------------------------------------------------------------------------------------------//
//        donoDAO.delete(3);
//        donoDAO.delete(6);
//        animalDAO.delete(3);

        // ---------------------------------------------------------------------------------------------------//
//        ArrayList<Dono> donos = new ArrayList<Dono>();
//        Dono dono01 = new Dono("Chico", "48632514897");
//        Dono dono02 = new Dono("Maria", "51988741265");
//        donos.add(dono01);
//        donos.add(dono02);
//        donoDAO.saveAll(donos);

//        ArrayList<Animal> animais = new ArrayList<Animal>();
//        Animal animal01 = new Animal("Soco", "Cachorro", "F", "Branco e preta - SRD",
//                "05/10/2021", "15/11/2009", 5);
//        Animal animal02 = new Animal("Tigrão", "Cachorro", "M", "Caramelo - Labrador",
//                "05/10/2021", "04/05/2002", 4);
//        animais.add(animal01);
//        animais.add(animal02);
//        animalDAO.saveAll(animais);
    }
}
