package projetopakua.Dados.Generico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa extends Elemento{
    private String nome;
    private Date dtNasc;
    SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa(int id) {
        super(id);
    }
    
    public String getDtnasc() {
        return formatData.format(dtNasc);
    }

    public void setDtnasc(String dtnasc) throws ParseException {
        this.dtNasc = formatData.parse(dtnasc);
    }

    public SimpleDateFormat getFormatData() {
        return formatData;
    }

    public void setFormatData(SimpleDateFormat formatData) {
        this.formatData = formatData;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String lista() {
        return "Id:" + this.getId() + "- Nome:" + this.nome;
    }
    
}

