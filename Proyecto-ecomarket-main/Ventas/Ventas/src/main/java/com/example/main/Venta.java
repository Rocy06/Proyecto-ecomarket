package com.example.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta {

    private int id;
    private String codProducto;
    private String producto;
    private String descripcion;
    private int fechaVenta;
    private int precio;
    

}
