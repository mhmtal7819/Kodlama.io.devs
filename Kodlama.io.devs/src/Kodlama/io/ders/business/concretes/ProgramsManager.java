package Kodlama.io.ders.business.concretes;

import java.util.List;

import Kodlama.io.ders.business.abstracts.ProgramsService;
import Kodlama.io.ders.dataAccess.abstracts.ProgramsRepository;
import Kodlama.io.ders.entities.Programs;

//@Service
public class ProgramsManager implements ProgramsService {
	ProgramsRepository programrepository;
	
    //@Autowired
	public ProgramsManager(ProgramsRepository programrepository) {
		super();
		this.programrepository = programrepository;
	}

	@Override
	public List<Programs> getAll() {
		// TODO Auto-generated method stub
		return programrepository.getAll();
	}

	@Override
	public void add(int id, String name) {
		programrepository.add(id, name);
		
	}

	@Override
	public void update(int indexToUpdate, String newValue, int newİd) {
		programrepository.update(indexToUpdate, newValue, newİd);
		
	}

	@Override
	public void delete(int index) {
		programrepository.delete(index);
		
	}

}
