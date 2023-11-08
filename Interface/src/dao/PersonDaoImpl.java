package dao;

import beans.Person;

public class PersonDaoImpl implements personDao {
	static Person[]parr;
	private static int cnt;
	static
	{
		parr= new Person[100];
		parr[0]=new Person(1,"Rutvik","8530");
		parr[1]= new Person(2,"Rutvik","7559");
		cnt=2;
		
	}

	private Object p;

		
	public void save(Person p) {
		parr[cnt]=p;
		cnt++;
		
	}

	@Override
	public Person[] findAll() {
		// TODO Auto-generated method stub
		return parr;
	}

	@Override
	public Person findById(int pid) {
		for(Person p:parr) {
			if(p!=null) {
				if(p.getPid()==pid) {
					return p;
				}
			}
			else {
				break;
			}
		}
		return null;
	}
}