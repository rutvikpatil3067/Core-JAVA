package dao;

import beans.Person;

public interface personDao {

	void save(Person p);

	Person[] findAll();

	

	Person findById(int pid);

}