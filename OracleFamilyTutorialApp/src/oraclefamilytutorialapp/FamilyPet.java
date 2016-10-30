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
public class FamilyPet extends FamilyMember {
    private String type;
    
    void initPet(String newName, int newAge, String newType) {
        type = newType;
        initFamilyMember(newName, newAge);
    }
    
    void report() {
        System.out.println(name + " is a " + age + " year old " + type + ".");
    }
    
}
