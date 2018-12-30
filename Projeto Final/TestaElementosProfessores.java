package projetopakua;

import java.text.ParseException;
import projetopakua.Dados.DAO.ProfessorDAO;
import projetopakua.Dados.Generico.Materia;
import projetopakua.Dados.Generico.RepositorioGenerico;
import projetopakua.Dados.Repositorio.RepositorioProfessor;
import projetopakua.Negocio.Professor;

public class TestaElementosProfessores {
    
    public static void main(String[] args) throws ParseException {

        RepositorioGenerico repo = new RepositorioProfessor("PROFESSOR.DB");
        ProfessorDAO cp = new ProfessorDAO(repo);
        Professor p1 = cp.getNewElemento();
        Professor p2 = cp.getNewElemento();
        Professor p3 = cp.getNewElemento();
        p1.setNome("Ze Roberto");
        p2.setNome("Humberto");
        p3.setNome("Dois Humberto");
        p1.setDtnasc("11/10/2010");
        p2.setDtnasc("12/10/2010");
        p3.setDtnasc("13/10/2010");
        Materia m1 = new Materia(1, "POO");
        Materia m2 = new Materia(2, "PF");
        Materia m3 = new Materia(3, "PP");
        Materia m4 = new Materia(4, "POO2");
        p1.adicionaMateriaAoProfessor(m1);
        p1.adicionaMateriaAoProfessor(m2);
        p2.adicionaMateriaAoProfessor(m3);
        p2.adicionaMateriaAoProfessor(m4);
        p3.adicionaMateriaAoProfessor(m4);
        


        cp.inclui(p1);
        cp.inclui(p2);
        cp.inclui(p3);

        cp.salvar();

        cp.exclui(3);
        cp.listaDAO();
        

    }
    
}
