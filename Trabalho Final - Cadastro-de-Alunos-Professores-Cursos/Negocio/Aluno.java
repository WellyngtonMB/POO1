package projetopakua.Negocio;

import projetopakua.Dados.Generico.Pessoa;

/**
 *
 * @author Bacalá
 */
public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno(int id) {
        super(id);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String lista() {
        return "Id: " + this.getId() + " - Nome: " + this.getNome() + " - " + "Dat.Nasc: " + this.getDtnasc() + ".";
    }

}
