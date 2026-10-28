package padroescomportamentais.templatemethod;

public class PacienteAdulto extends Paciente {

    @Override
    public String classificarImc() {
        float imc = this.calcularImc();

        if (imc < 18.5f) {
            return "Abaixo do peso";
        }
        else if (imc < 25.0f) {
            return "Peso normal";
        }
        else {
            return "Sobrepeso";
        }
    }

}
