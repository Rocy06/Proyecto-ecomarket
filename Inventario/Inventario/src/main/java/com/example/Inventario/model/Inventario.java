package com.example.Inventario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventario {

    public int id;
    public String nombre;
    public String descripcion;
    public int fechaVencimiento;
    public int precio;
}
