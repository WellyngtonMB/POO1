package projetopakua.Dados.Generico;

import java.util.ArrayList;

public class Materia{
    
    private int codigo;
    private String nome;
    
    public Materia(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo = " + codigo + ", nome = " + nome + '}';
    }
    
    public static ArrayList<Materia> materiaStringToArrayList(String arrayMateria) throws ErroAoLerAsMateriasDoDBException{
        int pos = -1;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int codigo;
        String nomeMateria;
        ArrayList<Materia> materias = new ArrayList();
        ArrayList<Integer> inicioMateria = new ArrayList();
        ArrayList<Integer> fimMateria = new ArrayList();
        ArrayList<Integer> posVirgulas = new ArrayList();
        while (true) {
            pos = arrayMateria.indexOf ("{", pos + 1); 
            inicioMateria.add(pos);
            if (pos < 0) break;
            contador1++;
        }
        while (true) {
            pos = arrayMateria.indexOf ("}", pos + 1); 
            fimMateria.add(pos);
            if (pos < 0) break;
            contador2++;
        }
        while (true) {
            pos = arrayMateria.indexOf (",", pos + 1); 
            if((contador3%2) == 0) posVirgulas.add(pos);
                
            if (pos < 0) break;
            contador3++;
        }
        if(contador1 != contador2){
            ErroAoLerAsMateriasDoDBException error = new ErroAoLerAsMateriasDoDBException();
            throw error;
        }
        String[] ary = arrayMateria.split("");
        for(int i = 0;i < inicioMateria.size()-1 ; i++){
            
            codigo = getCodigo(i, ary, inicioMateria, posVirgulas);
            nomeMateria = getNome(i, ary, fimMateria, posVirgulas);
            Materia materia = new Materia(codigo, nomeMateria);
            materias.add(materia);
        } 
        return materias;
    }
   
    private static int getCodigo(int i, String[] ary, ArrayList<Integer> inicioMateria, ArrayList<Integer> posVirgulas) {
        String cod = "";
        for (int j = inicioMateria.get(i)+10; j < posVirgulas.get(i); j++){
            cod += ary[j];
        }
        int codigo = Integer.parseInt(cod);
        return codigo;
    }
    
    private static String getNome(int i, String[] ary, ArrayList<Integer> fimMateria, ArrayList<Integer> posVirgulas) {
        String nomeMateria = "";
        for(int j = posVirgulas.get(i) +9; j < fimMateria.get(i); j++){
            nomeMateria += ary[j];
        }
        return nomeMateria;
    }

    public static class ErroAoLerAsMateriasDoDBException extends Exception {
        
        @Override
        public String toString() {
            return "\nErro ao ler as materias no Banco de Dados. O dado de alguma materia foi salvo em formato invalido e podera ser apagado pelo sistema a qualquer momento.";
        }
    }
}
