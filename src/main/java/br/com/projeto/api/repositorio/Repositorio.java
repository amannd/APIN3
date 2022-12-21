package br.com.projeto.api.repositorio;

import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer>{
    
}
