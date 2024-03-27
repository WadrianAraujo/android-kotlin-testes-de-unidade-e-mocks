package br.com.alura.orgs

import br.com.alura.orgs.model.Usuario
import org.junit.Assert
import org.junit.Test

class UsuarioTests {

    @Test
    fun deveRetornarVerdadeiroQuandoOsDadosEstaoCertos() {
        val usuarioValido = Usuario(
            id = "usuario",
            email = "usuario@valido.com",
            senha = "senhaforte123"
        )

        val resultado = usuarioValido.ehValido()

        Assert.assertTrue(resultado)
    }

    @Test
    fun retornaFalsoSeASenhaDoUsuarioEstiverErradaComMenosDe6Caracteres() {
        val usuarioInvalido = Usuario(
            id = "usuario",
            email = "usuario@valido.com",
            senha = "fraca"
        )

        val resultado = usuarioInvalido.ehValido()

        Assert.assertFalse(resultado)
    }

}