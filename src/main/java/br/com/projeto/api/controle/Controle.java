package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @GetMapping("")
    public String mensagem() {
        return ("Hello World!");
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return ("Seja bem vindo(a)!");
    }

    @GetMapping("/boasVindas/{nome}")
    public String mensagem(@PathVariable String nome) {
        return ("Hello World!" + nome);
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p) {
        return p;
    }
}
