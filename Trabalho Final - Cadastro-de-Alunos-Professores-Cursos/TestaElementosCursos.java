package projetopakua;

import java.text.ParseException;
import projetopakua.Dados.DAO.CursoDAO;
import projetopakua.Dados.Generico.Materia;
import projetopakua.Dados.Generico.RepositorioGenerico;
import projetopakua.Dados.Repositorio.RepositorioCurso;
import projetopakua.Negocio.Curso;

public class TestaElementosCursos {
    
    public static void main(String[] args) throws ParseException {

       RepositorioGenerico repo = new RepositorioCurso("CURSO.DB");
       CursoDAO cc = new CursoDAO(repo);
        Curso c1 = cc.getNewElemento();
        Curso c2 = cc.getNewElemento();
        Curso c3 = cc.getNewElemento();
        c1.setNome("Computação2");
        c2.setNome("Sistemas4");
        c3.setNome("Matematica3");
        
        Materia m1 = new Materia(1, "POO");
        Materia m2 = new Materia(2, "PF");
        Materia m3 = new Materia(3, "PP");
        Materia m4 = new Materia(4, "POO2");
        c1.adicionaMateriaAoCurso(m1);
        c1.adicionaMateriaAoCurso(m2);
        c2.adicionaMateriaAoCurso(m3);
        c2.adicionaMateriaAoCurso(m4);
        c3.adicionaMateriaAoCurso(m4);
        
        System.out.println("\n\n"+c1.getNome());
        System.out.println("\n\n"+c1.getMaterias());
        

        cc.inclui(c1);
        cc.inclui(c2);
        cc.inclui(c3);        

        cc.salvar();

        cc.exclui(3);
        cc.listaDAO();
    }
}
