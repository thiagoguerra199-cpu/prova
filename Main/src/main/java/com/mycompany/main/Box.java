/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author 1658168
 */
import java.util.ArrayList;

public class Box {
    private int numero;
    private String tipoServico;
    private int capacidade;
    private String localizacao;
    private Mecanico mecanico;
    private ArrayList<OrdemServico> ordens = new ArrayList<>();
    
    public Box(int numero, String tipoServico, int capacidade, String localizacao){
        this.numero = numero;
        this.tipoServico = tipoServico;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        
    }
     
    public int getNumero(){
        return numero;
    }
    
    public mecanico getMecanico(){
        return mecanico;
    }
    
    public void setMecanico(Mecanico mecanico){
        this.mecanico = mecanico;
        
    }
     public void addOrdem(OrdemServico ordem){
         ordens.add(ordem);
        
     }
    
     public void mostrarOrdem(){
         for (OrdemServico : ordens)
             ordem.mostrar();
         System.out.println(ordens.size);
         
     }
     
     public int contarFinalizadas(){
         int total = 0;
         for (OrdemServico ; ordens)
             if (ordem.getStatus().equal("finalizada"))
                 total++;
         
         return total;
         
     }
}
