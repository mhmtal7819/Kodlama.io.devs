package Kodlama.io.ders.business.abstracts;

import java.util.List;

import Kodlama.io.ders.entities.Programs;

public interface ProgramsService {
	List<Programs> getAll();
	public void add(int id,String name);
	public void update(int indexToUpdate,String newValue,int newİd);
	public void delete(int index);

}
