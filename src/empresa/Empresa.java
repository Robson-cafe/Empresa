/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class Empresa {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /*System.out.println("Entre com nome do empregado:");
    String nomeEmpregado = input.nextLine();
    
    System.out.println("Entre com sobrenome do empregado:");
    String sobreNomeEmpregado = input.nextLine();
    
    System.out.println("Entre com o salário do empregado:");
    double salario = input.nextDouble();*/
    
    //Empregado empregado = new Empregado(nomeEmpregado, sobreNomeEmpregado, salario);
    Empregado empregado = new Empregado();
    Empregado empregado2 = new Empregado();
    
    empregado.setNome("Ze");
    empregado.setSobreNome("Silva");
    empregado.setSalario(1200.56);
    
    System.out.printf("Nome do empregado 1: %s%n!", empregado.getNome());
    System.out.printf("Sobre nome do empregado 1: %s%n!", empregado.getSobreNome());
    System.out.printf("Salario do empregado 2 %s %s: R$%.2f%n%n!", empregado.getNome(), empregado.getSobreNome(), empregado.getSalario());
    
    empregado2.setNome("Saulo Araujo");
    empregado2.setSobreNome("Ze");
    empregado2.setSalario(1604.56);
    
    System.out.printf("Nome do empregado 2: %s%n!", empregado2.getNome());
    System.out.printf("Sobre nome do empregado 2: %s%n!", empregado2.getSobreNome());
    System.out.printf("Salario do empregado 2 %s %s: R$%.2f%n!", empregado2.getNome(), empregado2.getSobreNome(), empregado2.getSalario());
  }
  
}
