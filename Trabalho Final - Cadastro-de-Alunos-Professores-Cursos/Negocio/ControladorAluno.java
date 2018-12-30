package projetopakua.Negocio;

import java.util.ArrayList;
import projetopakua.Dados.DAO.AlunoDAO;
import projetopakua.Dados.Repositorio.RepositorioAluno;

/**
 *
 * @author Bacalá
 */
public class ControladorAluno {
    
    private AlunoDAO daoAluno;
    
    public ControladorAluno (){
        daoAluno = new AlunoDAO(new RepositorioAluno("ALUNOS"));        
    }

    public Aluno getNovoAluno() {
        return daoAluno.getNewElemento();
    }

    public void incluiAluno(Aluno a) {
        daoAluno.inclui(a);
    }

    public void salvar() {
        daoAluno.salvar();
    }

    /*public void listaAlunos() {
        daoAluno.listaAlunos();
    }*/
    
    public ArrayList<String> listaAlunos() {
        ArrayList<String> list;
        list = daoAluno.listaDAO();
        return list;
    }
}
