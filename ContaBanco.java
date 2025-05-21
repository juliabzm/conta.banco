import java.util.Locale; 
import java.util.Scanner;


public class ContaBanco {
  public static void main(String args[]) {
      Locale localeBR = new Locale("pt", "BR");
      Scanner scanner = new Scanner(System.in).useLocale(localeBR); 
      
      System.out.println("Informe o número da sua conta: ");
      int conta = scanner.nextInt(); 
      
      System.out.println("Informe sua agencia: ");
      String agencia = scanner.next();
      
      System.out.println("Informe seu nome completo: ");
      String nome = scanner.next();
      
      System.out.println("Informe seu saldo bancário: ");
      double saldo = scanner.nextDouble();
      
        
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n", 
    nome, agencia, conta, saldo);
  }
}
  
  