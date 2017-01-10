package com.model;

import java.util.Set;

public interface PersonDao {
	public int addPerson(Person person) ;  
    
    public int deletePerson(String name);  
      
    public int updatePerson(String name);  
      
    public Person findStudent(String name);  
      
    public Set<Person> findAll(); 
}
