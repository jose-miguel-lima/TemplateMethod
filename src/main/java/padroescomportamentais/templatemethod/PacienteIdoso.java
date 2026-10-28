package padroescomportamentais.templatemethod;

public class PacienteIdoso extends Paciente {

    // Para idosos, a faixa considerada saudável é maior (22,0 a 27,0)
    @Override
    public String classificarImc() {
        float imc = this.calcularImc();

        if (imc < 22.0f) {
            return "Abaixo do peso";
        }
        else if (imc <= 27.0f) {
            return "Peso normal";
        }
        else {
            return "Sobrepeso";
        }
    }

    @Override
    public String getTipo() {
        return "PacienteIdoso";
    }
}
