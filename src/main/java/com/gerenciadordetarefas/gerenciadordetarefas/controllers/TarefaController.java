package com.gerenciadordetarefas.gerenciadordetarefas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordetarefas.gerenciadordetarefas.entities.Tarefa;
import com.gerenciadordetarefas.gerenciadordetarefas.services.TarefaService;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> findAll(){
        return tarefaService.findAll();
    }

}