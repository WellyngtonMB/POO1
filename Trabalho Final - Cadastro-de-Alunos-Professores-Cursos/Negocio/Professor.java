package projetopakua.Negocio;

import projetopakua.Dados.Generico.Materia;
import projetopakua.Dados.Generico.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetopakua.Dados.Generico.Materia.ErroAoLerAsMateriasDoDBException;
import static projetopakua.Dados.Generico.Materia.materiaStringToArrayList;

public class Professor extends Pessoa{
    
    ArrayList<Materia> materias;
    
    public Professor(int id) {
        super(id);
        this.materias = new ArrayList();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    
    public ArrayList<Materia> adicionaMateriaAoProfessor(Materia materia){
        materias.add(materia);
        return materias;        
    }
    
    public ArrayList<Materia> adicionaMateriaAoProfessor(String strArrayMateria){
        try {
            materias = materiaStringToArrayList(strArrayMateria);
        } catch (ErroAoLerAsMateriasDoDBException ex) {
            exibirMsgErro("Erro ao ler as materias no Banco de Dados de Cursos.\nO dado de alguma materia foi salvo em formato invalido e podera ser apagado pelo sistema a qualquer momento.");
            System.err.println(ex);
        }
        return materias;
    }
    
    private void exibirMsgErro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "ERRO", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public String lista() {
        return "Id: " + this.getId() + " - Nome: " + this.getNome() + " - " + "Dat.Nasc: " + this.getDtnasc() + " - " + getMaterias() + ".";
    }
}
