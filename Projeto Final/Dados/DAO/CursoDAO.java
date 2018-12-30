package projetopakua.Dados.DAO;

import java.util.ArrayList;
import projetopakua.Dados.Generico.CadastroGenerico;
import projetopakua.Dados.Generico.DAO;
import projetopakua.Dados.Generico.Elemento;
import projetopakua.Dados.Generico.RepositorioGenerico;
import projetopakua.Negocio.Curso;

public class CursoDAO extends CadastroGenerico<Curso> implements DAO{
    
    public CursoDAO( RepositorioGenerico<Curso> r ){
        super( r );
        this.ler();
    }
    
    /*public void listaCursos() {
        System.out.println("\nLista Cursos: (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Curso) a).lista());
        }
    }*/
    
    @Override
    public ArrayList<String> listaDAO() {
        ArrayList<String> list = new ArrayList();
        System.out.println("\nLista Cursos: (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Curso) a).lista());
            list.add(((Curso)a).lista());
        }
        return list;
    }
    
    @Override
    public Curso getNewElemento() {
        Curso c = new Curso(super.nroElementos()+1);
        this.inclui(c);   // reserva a vaga do elemento na lista
        return c;
    }
    
}
