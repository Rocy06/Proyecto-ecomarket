package com.example.Cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cliente.model.Cliente;
import com.example.Cliente.service.clienteService;

@RestController
@RequestMapping("/Cliente")
public class clienteController {

    @Autowired
    private clienteService clienteService;

    @GetMapping
    public List<Cliente> listaClientes(){
        return clienteService.getClientes();
    }

    @PostMapping 
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @GetMapping
    public Cliente burcarRun (@PathVariable int id){
        return clienteService.burcarRun(id);
    }

    @GetMapping
    public Cliente burcarId (@PathVariable int id){
        return clienteService.burcarId(id);
    }

    @PutMapping
    public Cliente actualizarCliente(@PathVariable int id,@RequestBody Cliente cliente){
        return clienteService.actualizarCliente(cliente);
    }

    @DeleteMapping
    public String eliminar(@PathVariable int id){
        return clienteService.eliminar(id);
    }


}
