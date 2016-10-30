/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclefamilytutorialapp;

/**
 *
 * @author user1
 */
public class OracleFamilyTutorialApp {

    private static void addPeople() {
        FamilyMember zoe = new FamilyMember();
        FamilyMember kathrine = new FamilyMember();
        FamilyMember alex = new FamilyMember();
        
        zoe.initFamilyMember("Zoe Nied", 1);
        kathrine.initFamilyMember("Kathrine Nichols", 33);
        alex.initFamilyMember("Alexander Nied", 32);
        
        alex.report();
        kathrine.report();
        zoe.report();
        
        zoe.incrementAge();
        
        System.out.println("Happy Birthday!");
        zoe.report();
    }
    
    private static void addPets() {
        FamilyPet rex = new FamilyPet();
        FamilyPet lydia = new FamilyPet();
        
        rex.initPet("Rex", 6, "Cat");
        lydia.initPet("Lydia", 6, "Cat");
        
        rex.report();
        lydia.report();
        
        rex.incrementAge();
        lydia.incrementAge();
        
        System.out.println("Happy Birthday!");
        
        rex.report();
        lydia.report();

        System.out.println(rex instanceof FamilyPet);
        System.out.println(rex instanceof FamilyMember);
        
    }
    
    /**
     * Makes a family
     */
    public static void main(String[] args) {
        addPeople();
        addPets();
    }
    
}
