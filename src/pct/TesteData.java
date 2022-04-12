/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pct;

/**
 *
 * @author Etec
 */
public class TesteData {
    public static void main(String[] args){
    //Criação e instÂncia do objeto da classe Data
    Data data = new Data();
    
    //Contrução do objeto
    //data.dia = 42;
    data.setDia(1);
    data.setMes(12);
    data.setAno(2022);
    
    //Imprimindo a data
    System.out.println("Data: " + data.exibirData());
    
    //Testando o get
    System.out.println("Dia: " + data.getDia());
    
    System.out.println("Mes: " + data.getMes());
    
    System.out.println("Ano: " + data.getAno());
}
}
