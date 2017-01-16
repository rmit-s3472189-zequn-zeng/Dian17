package com.model;

import java.util.Set;

public interface PersonDao {
	public boolean addPerson(Person person) ;  
    
    public boolean deletePerson(Person person);  
      
    public boolean updatePerson(Person person);  
      
    public boolean findPerson(Person person);  
      
    public Set<Person> findAll(); 
    
    public boolean isValidPerson(Person person);
}
