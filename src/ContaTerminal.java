import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public void Cadastrar() {
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Nome Com Sucesso : " +nome);

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Sobrenome Com Sucesso : " +sobrenome);


        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Idade Com Sucesso : " +idade);

        System.out.println("Seu Email");
        String email = scanner.next();
        System.out.println("Email Com Sucesso : " +email);

        System.out.println("Conta Criada Com Sucesso : " + nome +" "+sobrenome);
    }

}
