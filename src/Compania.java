/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daaariaspa
 */

import java.util.*;

public class Compania {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private HashMap<Cliente,Asset> assets;

    public Compania(String nombre, ArrayList<Cliente> clientes, HashMap<Cliente, Asset> assets) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.assets = assets;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashMap<Cliente, Asset> getAssets() {
        return assets;
    }

    public void setAssets(HashMap<Cliente, Asset> assets) {
        this.assets = assets;
    }
    
}
