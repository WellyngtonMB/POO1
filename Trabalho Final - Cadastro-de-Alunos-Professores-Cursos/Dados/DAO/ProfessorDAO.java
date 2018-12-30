package projetopakua.Dados.DAO;

import java.util.ArrayList;
import projetopakua.Negocio.Professor;
import projetopakua.Dados.Generico.RepositorioGenerico;
import projetopakua.Dados.Generico.CadastroGenerico;
import projetopakua.Dados.Generico.DAO;
import projetopakua.Dados.Generico.Elemento;

public class ProfessorDAO extends CadastroGenerico<Professor> implements DAO{
    
    public ProfessorDAO( RepositorioGenerico<Professor> r ){
        super( r );
        this.ler();
    }
    
    /*public void listaProfessores() {
        System.out.println("\nLista Professores: (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Professor) a).lista());
        }
    }*/
    
    @Override
    public ArrayList<String> listaDAO() {
        ArrayList<String> list = new ArrayList();
        System.out.println("\nLista Cursos: (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Professor) a).lista());
            list.add(((Professor)a).lista());
        }
        return list;
    }

    @Override
    public Professor getNewElemento() {
        Professor p = new Professor(super.nroElementos()+1);
        this.inclui(p);   // reserva a vaga do elemento na lista
        return p;
    }
    
}
