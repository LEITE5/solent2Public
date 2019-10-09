/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.impl;

import org.solent.com504.factoryandfacade.model.Duck;

/**
 *
 * @author 4estrj82
 */
public class DuckImpl extends AbstractAnimal implements Duck{
    
    @Override
    public String getSound() {
        return Duck.SOUND;
    }

    @Override
    public String getAnimalType() {
        return Duck.ANIMAL_TYPE;
    }
    
}
