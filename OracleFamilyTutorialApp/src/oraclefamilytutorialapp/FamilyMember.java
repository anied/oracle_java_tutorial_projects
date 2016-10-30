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
public class FamilyMember {
    String name;
    int age = 0;
    
    void setName(String newName) {
        name = newName;
    }
    
    void setAge(int newAge) {
        age = newAge;
    }
    
    void incrementAge() { //Happy Birthday!
        age++;
    }
    
    void initFamilyMember(String newName, int newAge) {
        setName(newName);
        setAge(newAge);
    }
    
    void report() {
        String pluralizer = "";
        if (age > 1) {
            pluralizer = "s";
        }
        System.out.println("Family member " + name + " is " + age + " year" + pluralizer + " old.");
    }
    
}
