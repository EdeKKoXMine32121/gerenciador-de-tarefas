package com.gerenciadordetarefas.gerenciadordetarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordetarefas.gerenciadordetarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
    
}
