package projetopakua.Dados.Repositorio;

import projetopakua.Negocio.Curso;
import projetopakua.Dados.Generico.RepositorioGenerico;
import java.util.StringTokenizer;


/**
 *
 * @author julia
 */
public class RepositorioCurso extends RepositorioGenerico<Curso>{

    public RepositorioCurso(String file) {
        super(file);
    }
    
    @Override
    public String getRegistro(Curso e) {
        String reg = e.getId()+SEPARATOR+
                     e.getNome()+SEPARATOR+
                     e.getMaterias();
                     
        return reg;
    }

    @Override
    public Curso getInstance(String str) {
        
        StringTokenizer stk = new StringTokenizer(str,SEPARATOR);
        int id = Integer.parseInt(stk.nextToken());        
        Curso c = new Curso(id);
        c.setNome(stk.nextToken());
        c.adicionaMateriaAoCurso(stk.nextToken());
        return c;
    }
    
    
}
