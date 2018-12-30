package projetopakua.Dados.DAO;

import java.util.ArrayList;
import projetopakua.Negocio.Aluno;
import projetopakua.Dados.Generico.RepositorioGenerico;
import projetopakua.Dados.Generico.CadastroGenerico;
import projetopakua.Dados.Generico.Elemento;

/**
 *
 * @author Bacalá
 */
public class AlunoDAO extends CadastroGenerico<Aluno> {
    
    public AlunoDAO( RepositorioGenerico<Aluno> r ){
        super( r );
        this.ler();
    }
    
    /*public void listaAlunos() {
        System.out.println("\nLista alunos (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Aluno) a).lista());
        }
    }*/
    
    public ArrayList<String> listaDAO() {
        ArrayList<String> list = new ArrayList();
        System.out.println("\nLista Cursos: (" + this.nroElementos() + ")\n");
        for (Elemento a : super.buscaTodos()) {
            System.out.println(((Aluno) a).lista());
            list.add(((Aluno)a).lista());
        }
        return list;
    }

    @Override
    public Aluno getNewElemento() {
        Aluno a = new Aluno(super.nroElementos()+1);
        this.inclui(a);   // reserva a vaga do elemento na lista
        return a;
    }
    
    
}