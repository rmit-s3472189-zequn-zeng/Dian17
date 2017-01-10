package com.model;

import java.util.Set;

public class CreatePersonDao implements PersonDao{

	@Override
	public int addPerson(Person person) {
		
		return 0;
	}

	@Override
	public int deletePerson(String name) {
		return 0;
	}

	@Override
	public int updatePerson(String name) {
		return 0;
	}

	@Override
	public Person findStudent(String name) {
		return null;
	}

	@Override
	public Set<Person> findAll() {
		return null;
	}

}
