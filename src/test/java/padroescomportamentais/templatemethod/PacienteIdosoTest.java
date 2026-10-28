package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteIdosoTest {

    @Test
    void deveCalcularImc() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(108.0f);
        paciente.setAltura(2.0f);
        assertEquals(27.0f, paciente.calcularImc(), 0.001f);
    }

    @Test
    void deveRetornarAbaixoDoPeso() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(87.6f);
        paciente.setAltura(2.0f);
        assertEquals("Abaixo do peso", paciente.classificarImc());
    }

    @Test
    void deveRetornarPesoNormalNoLimiteInferior() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(88.0f);
        paciente.setAltura(2.0f);
        assertEquals("Peso normal", paciente.classificarImc());
    }

    @Test
    void deveRetornarPesoNormalNoLimiteSuperior() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(108.0f);
        paciente.setAltura(2.0f);
        assertEquals("Peso normal", paciente.classificarImc());
    }

    @Test
    void deveRetornarSobrepeso() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(108.4f);
        paciente.setAltura(2.0f);
        assertEquals("Sobrepeso", paciente.classificarImc());
    }

    @Test
    void deveClassificarDiferenteDoAdultoParaOMesmoImc() {
        PacienteIdoso idoso = new PacienteIdoso();
        idoso.setPeso(108.0f);
        idoso.setAltura(2.0f);

        PacienteAdulto adulto = new PacienteAdulto();
        adulto.setPeso(108.0f);
        adulto.setAltura(2.0f);

        assertEquals("Peso normal", idoso.classificarImc());
        assertEquals("Sobrepeso", adulto.classificarImc());
    }

    @Test
    void deveRetornarInformacoes() {
        PacienteIdoso paciente = new PacienteIdoso();
        paciente.setPeso(88.0f);
        paciente.setAltura(2.0f);
        paciente.setNome("Marcelo");
        paciente.setProntuario(2);
        assertEquals("PacienteIdoso{prontuario=2, nome='Marcelo', classificacao=Peso normal}", paciente.getInfo());
    }
}
