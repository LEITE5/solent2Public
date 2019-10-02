package org.solent.com504.factoryandfacade.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {
    
     private List<Animal> animals =  new ArrayList<Animal>();

    @Test
    public void FarmFacadeTest() {

        FarmFacade farmFacade = AnimalObjectFactory.createFarmFacade();
        assertNotNull(farmFacade);
        
        Animal d1 = AnimalObjectFactory.createDog();
        d1.setName("cao");
        assertEquals("cao",d1.getName());
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?
    }
   @Test
   public void typedListTest(){
      Animal d1 = AnimalObjectFactory.createDog();
        d1.setName("oi");
        animals.add(d1);
   }
}