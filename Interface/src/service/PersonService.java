package service;

import beans.Person;

public interface PersonService {
	void addnewPerson();
	Person[] DisplayAll();
	Person displayById(int pid);


}
