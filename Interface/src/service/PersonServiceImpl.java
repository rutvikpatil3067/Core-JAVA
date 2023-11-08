package service;

import java.util.Scanner;

import beans.Person;
import dao.PersonDaoImpl;
import dao.personDao;

public class PersonServiceImpl implements PersonService{
	private personDao pdao;
	public  PersonServiceImpl()
	{
		pdao=new PersonDaoImpl();
	}
	@Override
	public void addnewPerson() {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int pid=sc.nextInt();
		
		System.out.println("Enter the name");
		String nm=sc.next();
		
		System.out.println("Enter mobile");
		String mob=sc.nextLine();
		Person p=new Person(pid,nm,mob);
		pdao.save(p);
		
	}
	@Override
	public Person[] DisplayAll() {
		return pdao.findAll();
		
	}
	@Override
	public Person displayById(int pid) {
		// TODO Auto-generated method stub
		return pdao.findById(pid) ;
	}
}


