package Kodlama.io.ders.webApi;

import java.util.List;

import Kodlama.io.ders.business.abstracts.ProgramsService;
import Kodlama.io.ders.entities.Programs;

//@RestController
//@RequestMapping("/api/programs")
public class ProgramsController {
	ProgramsService programservice;
	
    //@Autowired
	public ProgramsController(ProgramsService programservice) {
		super();
		this.programservice = programservice;
	}
	
	//@Getmapping("/getall")
	List<Programs> getAll(){
		return programservice.getAll();
	}
	public void add(int id,String name) { //id ve adın aynı olmaması lazım forla check et 
		programservice.add(id, name);
	}
	public void delete(int index) { //var olan bir itemi silmesi lazım forla yine
		programservice.delete(index);
	}
	public void update(int index,String name,int id) { //indexin var olan bir id olması lazım forla..
		programservice.update(index, name, id);
	}
	

}
