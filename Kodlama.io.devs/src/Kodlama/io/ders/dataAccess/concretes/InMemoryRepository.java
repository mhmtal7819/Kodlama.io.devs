package Kodlama.io.ders.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.ders.dataAccess.abstracts.ProgramsRepository;
import Kodlama.io.ders.entities.Programs;

//@Repository
public class InMemoryRepository implements ProgramsRepository{
	List<Programs> programs;
	

	public InMemoryRepository() {
		programs=new ArrayList<Programs>();
		programs.add(new Programs(1,"java"));
		programs.add(new Programs(2,"c#"));
		programs.add(new Programs(3,"phyton"));
	}

	@Override
	public List<Programs> getAll() {
		// TODO Auto-generated method stub
		return programs;
	}

	@Override
	public void add(int id,String name) {
		for(Programs program:programs) {
			if(program.getId()==id || program.getName()==name) {
				System.out.println("This item already exist");
			}
			else {
				programs.add(new Programs(id,name));
			}
		}
		
		
	}

	@Override
	public void update(int indexToUpdate,String newValue,int newİd) {
		for(Programs program:programs) {
			if(program.getId()==indexToUpdate) {
				Programs updateProgram=new Programs(newİd,newValue);
				programs.set(indexToUpdate,updateProgram);
			}
			else {
				System.out.println("This id is invalid,item is could'nt find");
			}
		}
		
		
	}

	@Override
	public void delete(int index) {
		for(Programs program:programs) {
			if(program.getId()==index) {
				programs.remove(index);
			}
			else {
				System.out.println("This id is invalid");
			}
		}
		
		
	}

}
