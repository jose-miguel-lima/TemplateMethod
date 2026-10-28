package padroescomportamentais.templatemethod;

public abstract class Paciente {

    private int prontuario;
    protected String nome;
    private float peso;
    private float altura;

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularImc() {
        return this.peso / (this.altura * this.altura);
    }

    public abstract String classificarImc();

    public String getTipo() {
        return "Paciente";
    }

    // Template Method
    public final String getInfo() {
        return getTipo() + "{" +
                "prontuario=" + this.prontuario +
                ", nome='" + this.nome + '\'' +
                ", classificacao=" + this.classificarImc() +
                '}';
    }
}
