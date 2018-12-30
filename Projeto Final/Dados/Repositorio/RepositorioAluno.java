package projetopakua.Dados.Repositorio;

import projetopakua.Negocio.Aluno;
import projetopakua.Dados.Generico.RepositorioGenerico;
import java.text.ParseException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bacalá
 */
public class RepositorioAluno extends RepositorioGenerico<Aluno> {

    public RepositorioAluno(String file) {
        super(file);
    }
   
    @Override
    public String getRegistro(Aluno e) {
        String reg = e.getId()+SEPARATOR+
                     e.getNome()+SEPARATOR+
                     e.getDtnasc()+SEPARATOR+
                     e.getCurso();

        return reg;
    }

    @Override
    public Aluno getInstance(String str) {
        StringTokenizer stk = new StringTokenizer(str,SEPARATOR);
        int id = Integer.parseInt(stk.nextToken());
        Aluno a = new Aluno(id);
        a.setNome(stk.nextToken());
        try {
            a.setDtnasc(stk.nextToken());
        } catch (ParseException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setCurso(stk.nextToken());
        return a;
    }
}
