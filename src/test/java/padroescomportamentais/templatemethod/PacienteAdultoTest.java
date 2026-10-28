package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteAdultoTest {

    @Test
    void deveCalcularImc() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(100.0f);
        paciente.setAltura(2.0f);
        assertEquals(25.0f, paciente.calcularImc(), 0.001f);
    }

    @Test
    void deveRetornarAbaixoDoPeso() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(73.9f);
        paciente.setAltura(2.0f);
        assertEquals("Abaixo do peso", paciente.classificarImc());
    }

    @Test
    void deveRetornarPesoNormalNoLimiteInferior() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(74.0f);
        paciente.setAltura(2.0f);
        assertEquals("Peso normal", paciente.classificarImc());
    }

    @Test
    void deveRetornarPesoNormalAbaixoDoLimiteSuperior() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(99.9f);
        paciente.setAltura(2.0f);
        assertEquals("Peso normal", paciente.classificarImc());
    }

    @Test
    void deveRetornarSobrepeso() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(100.0f);
        paciente.setAltura(2.0f);
        assertEquals("Sobrepeso", paciente.classificarImc());
    }

    @Test
    void deveRetornarInformacoes() {
        PacienteAdulto paciente = new PacienteAdulto();
        paciente.setPeso(70.0f);
        paciente.setAltura(1.75f);
        paciente.setNome("Marco");
        paciente.setProntuario(1);
        assertEquals("Paciente{prontuario=1, nome='Marco', classificacao=Peso normal}", paciente.getInfo());
    }
}
