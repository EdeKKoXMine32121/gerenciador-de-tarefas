package com.gerenciadordetarefas.gerenciadordetarefas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordetarefas.gerenciadordetarefas.entities.Tarefa;
import com.gerenciadordetarefas.gerenciadordetarefas.repositories.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll(){
        return tarefaRepository.findAll();
    }
}