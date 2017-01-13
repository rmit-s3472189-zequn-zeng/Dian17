package com.model;

import java.util.Set;

public interface PersonDao {
	public int addPerson(Person person) ;  
    
    public int deletePerson(Person person);  
      
    public int updatePerson(Person person);  
      
    public boolean findPerson(Person person);  
      
    public Set<Person> findAll(); 
    
    public boolean isValidPerson(Person person);
}
