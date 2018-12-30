package projetopakua.Negocio;

import java.util.ArrayList;
import projetopakua.Dados.DAO.CursoDAO;
import projetopakua.Dados.Repositorio.RepositorioCurso;

public class ControladorCurso {
    private CursoDAO daoCurso;
    
    public ControladorCurso() {
        daoCurso = new CursoDAO(new RepositorioCurso("CURSOS"));
    }
    
    public Curso getNovoCurso() {
        return daoCurso.getNewElemento();
    }

    public void incluiCurso(Curso c) {
        daoCurso.inclui(c);
    }

    public void salvar() {
        daoCurso.salvar();
    }

    /*public void listaCursos() {
        daoCurso.listaCursos();
    }*/
    
    public ArrayList<String> listaCursos() {
        ArrayList<String> list;
        list = daoCurso.listaDAO();
        return list;
    }
}
