package com.example.Cliente.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Cliente.model.Cliente;

@Repository
public class clienteRepository {

    private List<Cliente> listaClientes = new ArrayList<>();


    public List<Cliente> obtenerCliente() {
        return listaClientes;
    }

    public Cliente burcarRun(int run) {
        for (Cliente cliente : listaClientes){
            if (cliente.getRun()==run){
                return cliente;
            }
        }
        return null;
    }

    public Cliente guardar(Cliente cli) {
        listaClientes.add(cli);
        return cli;
    }

    public Cliente actualizarCliente(Cliente cli){
        int id = 0;
        int idPosiicion = 0;

        for (int 1 = 0; 1 < listaClientes.size()1++){
            if(listaClientes.get(i).getRun() == cli.getRun()){
                id = cli.getRun();
                idPosiicion = i;
            }
        }

        Cliente cliente1 = new Cliente();
        cliente1.setContasenia(cli.getContasenia());
        cliente1.setNombre(cli.getNombre());
        cliente1.setRun(cli.getRun());
        cliente1.setTelefono(cli.getTelefono());

        listaClientes.set(idPosiicion, cliente1);
        return cliente1;

        
    }
}

