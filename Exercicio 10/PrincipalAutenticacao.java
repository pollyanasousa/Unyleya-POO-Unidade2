import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAutenticacao {
    public static void main(String[] args) {
        List<Autenticavel> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Ana", "1234"));
        listaUsuarios.add(new Administrador("Carlos", "admin"));

        Scanner entrada = new Scanner(System.in);

        for (Autenticavel usuario : listaUsuarios) {
            String tipoUsuario = (usuario instanceof Administrador) ? "Administrador" : "Usuário";

            System.out.print("Digite a senha do " + tipoUsuario + ": ");
            String senhaInformada = entrada.nextLine();

            if (usuario.autenticar(senhaInformada)) {
                System.out.println(tipoUsuario + " autenticado com sucesso!\n");
            } else {
                System.out.println("Senha incorreta!\n");
            }
        }

        entrada.close();
    }
}

