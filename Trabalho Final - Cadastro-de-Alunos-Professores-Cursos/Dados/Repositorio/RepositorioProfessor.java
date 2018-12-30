package projetopakua.Dados.Repositorio;

import projetopakua.Negocio.Professor;

import projetopakua.Dados.Generico.RepositorioGenerico;
import java.text.ParseException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioProfessor extends RepositorioGenerico<Professor>{

    public RepositorioProfessor(String file) {
        super(file);
    }
    
    @Override
    public String getRegistro(Professor e) {
        String reg = e.getId()+SEPARATOR+
                     e.getNome()+SEPARATOR+
                     e.getDtnasc()+SEPARATOR+
                     e.getMaterias();
        return reg;
    }

    @Override
    public Professor getInstance(String str) {
        StringTokenizer stk = new StringTokenizer(str,SEPARATOR);
        int id = Integer.parseInt(stk.nextToken());
        Professor p = new Professor(id);
        p.setNome(stk.nextToken());
        try {
            p.setDtnasc(stk.nextToken());
        } catch (ParseException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.adicionaMateriaAoProfessor(stk.nextToken());
        return p;
    }
}
