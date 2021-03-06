package projetopakua;

import projetopakua.Dados.Repositorio.RepositorioAluno;
import projetopakua.Dados.DAO.AlunoDAO;
import projetopakua.Negocio.Aluno;
import projetopakua.Dados.Generico.RepositorioGenerico;
import java.text.ParseException;

/**
 *
 * @author Bacalá
 */
public class TestaElementosAlunos {

    public static void main(String[] args) throws ParseException {

        RepositorioGenerico repo = new RepositorioAluno("ALUNO.DB");
        AlunoDAO ca = new AlunoDAO(repo);
        Aluno a1 = ca.getNewElemento();
        Aluno a2 = ca.getNewElemento();
        Aluno a3 = ca.getNewElemento();
        Aluno a4 = ca.getNewElemento();
        a1.setNome("Ze Roberto");
        a2.setNome("Humberto");
        a3.setNome("Dois Berto");
        a4.setNome("Set Berto");
        a1.setCurso("Gestao");
        a2.setCurso("Gestao");
        a3.setCurso("Gestao");
        a4.setCurso("Gestao");
        a1.setDtnasc("11/10/2010");
        a2.setDtnasc("12/10/2010");
        a3.setDtnasc("13/10/2010");
        a4.setDtnasc("14/10/2010");
        
        ca.inclui(a1);
        ca.inclui(a2);
        ca.inclui(a3);
        ca.inclui(a4);

        ca.salvar();

       // ca.exclui(3);
        ca.listaDAO();

    }
}
