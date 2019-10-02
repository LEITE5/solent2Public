/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4estrj82
 */
public class FarmFacadeImpl implements FarmFacade {
    
    // this is a typed list of Animals
    private List<Animal> animals =  new ArrayList<Animal>();
    
    @Override
    public List<Animal> getAllAnimals() {
        return new ArrayList(animals);
    }

    @Override
    public void addDog(String name) {
        Animal d1 = AnimalObjectFactory.createDog();
        d1.setName(name);
        animals.add(d1);
    }

    @Override
    public void addCat(String name) {
        Animal c1 = AnimalObjectFactory.createCat();
        c1.setName(name);
        animals.add(c1);
    }

    @Override
    public void addCow(String name) {
        Animal c2 = AnimalObjectFactory.createCow();
        c2.setName(name);
        animals.add(c2);
    }
    
}
