package projetopakua.Negocio;

import java.util.ArrayList;
import projetopakua.Dados.DAO.ProfessorDAO;
import projetopakua.Dados.Repositorio.RepositorioProfessor;

public class ControladorProfessor {
    
    private ProfessorDAO daoProfessor;
    
    public ControladorProfessor() {
        daoProfessor = new ProfessorDAO(new RepositorioProfessor("PROFESSORES"));        
    }
    
    public Professor getNovoProfessor() {
        return daoProfessor.getNewElemento();
    }

    public void incluiProfessor(Professor p) {
        daoProfessor.inclui(p);
    }

    public void salvar() {
        daoProfessor.salvar();
    }

    /*public void listaProfessores() {
        daoProfessor.listaProfessores();
    }*/
    
    public ArrayList<String> listaProfessores() {
        ArrayList<String> list;
        list = daoProfessor.listaDAO();
        return list;
    }
}
