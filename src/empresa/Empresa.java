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
    System.out.println("Entre com nome do cliente:");
    Scanner input = new Scanner(System.in);
    String nomeDaConta = input.nextLine();
    System.out.println("Entre com saldo cliente:");
    double saldo = input.nextDouble();
    Empregado minhaConta = new Empregado(nomeDaConta, saldo);
  
    //minhaConta.setNome(nomeDaConta);
    //minhaConta.setSaldo(1200.56);
    
    System.out.printf("Nome da conta: %s%n!", minhaConta.getNome());
    System.out.printf("Saldo da conta: %f%n!", minhaConta.getSaldo());
  }
  
}
