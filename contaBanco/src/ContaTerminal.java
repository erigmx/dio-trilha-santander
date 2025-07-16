import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        //Programa: "Por favor, digite o número da Agência !"
        //Usuário: 1021 (depois ENTER para o próximo campo)

        /*Atributo	Tipo	Exemplo
        Numero	Inteiro	1021
        Agencia	Texto	067-8
        Nome Cliente	Texto	MARIO ANDRADE
        Saldo	Decimal	237.48 */

        System.out.println("Por favor, insira o número da conta! ");
        int numeroConta = leitor.nextInt(); 
        leitor.nextLine();

        System.out.println("Por favor, insira o número da Agência! ");
        String numeroAgencia = leitor.nextLine();

        System.out.println("Por favor, insira o seu nome! ");
        String nomeCliente = leitor.nextLine();

        System.out.println("Por favor, insira o valor que deseja depósitar! ");
        Double saldoConta = leitor.nextDouble();

        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoConta);

    }
}
