/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 1658168
 */
public class OrdemServico {
    private int codigo;
    private String cliente, modelo, placa, data, status;
    private double valorEstimado;
    private Servico servico;
    private Box box;
    private Mecanico mecanico;
    
    public OrdemServico(int codigo, String cliente, String modelo, String placa, String data, String status, double valorEstimado, Servico servico ){
        this.codigo = codigo;
        this.cliente = cliente;
        this.modelo = modelo;
        this.placa = placa;
        this.data = data;
        this.status = status;
        this.valorEstimado = valorEstimado;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setBox(Box box){
        this.box= box;
        this.mecanico = box.getMecanico();
        
        
    }
    
    public void mostrar(){
        System.out.println(codigo);
        System.out.println(cliente);
        System.out.println(modelo);
        System.out.println(placa);
        System.out.println(data);
        System.out.println(status);
        System.out.println(valorEstimado);
        System.out.println(servico.getNome());
        
        if (box != null){
            System.out.println(box.getNumero());
            System.out.println(mecanico.getNome());
        }
    }
}
