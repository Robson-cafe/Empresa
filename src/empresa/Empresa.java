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
    System.out.println("Entre com nome do empregado:");
    String nomeEmpregado = input.nextLine();
    
    System.out.println("Entre com sobrenome do empregado:");
    String sobreNomeEmpregado = input.nextLine();
    
    System.out.println("Entre com o salário do empregado:");
    double salario = input.nextDouble();
    
    Empregado minhaConta = new Empregado(nomeEmpregado, sobreNomeEmpregado, salario);
  
    //minhaConta.setNome(nomeDaConta);
    //minhaConta.setSaldo(1200.56);
    
    System.out.printf("Nome ddo empregado: %s%n!", minhaConta.getNome());
    System.out.printf("Sobre nome do empregado: %s%n!", minhaConta.getSobreNome());
    System.out.printf("Salario do empregado %s %s: R$%.2f%n!", minhaConta.getNome(), minhaConta.getSobreNome(), minhaConta.getSalario());
  }
  
}
