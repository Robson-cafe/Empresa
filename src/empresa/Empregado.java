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
  private static String sobreNome;
  private static Double salarioMensal;
  
  //public Empregado (/*String novoNome, String novoSobreNome, Double salario*/) {
    /*nome = novoNome;
    
    sobreNome = novoSobreNome;
    
    if(salario >= 0) {
      salarioMensal = salario;
    } 
    else {
      salarioMensal = 0.0;
    }
  }*/
  
  public static void setNome (String novoNome) {
    nome = novoNome;
  }       

  public static String getNome () {
    return nome;
  }
  
  public static void setSobreNome (String novosobreNome) {
    sobreNome = novosobreNome;
  }       

  public static String getSobreNome () {
    return sobreNome;
  }
  
  public static double getSalario () {
    return salarioMensal;
  }
  
  public static void setSalario (double salario) {
    salarioMensal = salario;
  }
}

