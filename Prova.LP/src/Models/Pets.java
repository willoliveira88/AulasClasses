package Models;

public class Pets {

    private int pet_Id;
    private String nome;

    private String tipo;

    private String Dono;

    public Pets(int pet_Id, String nome, String raça, String tipo, String dono) {
        this.pet_Id = pet_Id;
        this.nome = nome;
        this.tipo = tipo;
        Dono = dono;
    }

    public int getPet_Id() {
        return pet_Id;
    }

    public void setPet_Id(int pet_Id) {
        this.pet_Id = pet_Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }
}




