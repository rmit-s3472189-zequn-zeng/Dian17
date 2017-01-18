package com.model;

import java.util.List;

public interface PersonDao {
	public boolean addPerson(Person person) ;  
    
    public boolean deletePerson(Person person);  
      
    public boolean updatePerson(Person person);  
      
    public boolean findPerson(Person person);  
      
    public List<String> listAllUserName(); 
    
    public boolean isValidPerson(Person person);
    
    public boolean isInGroup(Person  person);
}
