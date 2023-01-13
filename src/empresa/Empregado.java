/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Robson
 */
public class Empregado {
  private static String nome;
  private static Double sallarioMensal;
  
  public static void setNome (String novoNome) {
    nome = novoNome;
  }       

  public static String getNome () {
    return nome;
  }
  
  public static double getSaldo () {
    return sallarioMensal;
  }
  
  public static void setSaldo (double saldo) {
    sallarioMensal = saldo;
  }
}

