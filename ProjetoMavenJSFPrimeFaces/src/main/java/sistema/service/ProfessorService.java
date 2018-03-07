package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Professor;

public class ProfessorService {
	
	private ArrayList <Professor> profs = new ArrayList<Professor>();
	
	public ProfessorService() {}
	
	public void salvar(Professor professor)
	{
		profs.add(professor);
	}
	
	public List <Professor> getProfessores()
	{
		return profs;
	}
}