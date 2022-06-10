import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class RegistrationCSV {
    public void salvarCSV() throws IOException {

        List<String> listaDados = new ArrayList<>();
        List<String> listaColunas = new ArrayList<>();
        List<String> listaRegistros = new ArrayList<>();

        Scanner registros = new Scanner(System.in);

        // while (true) {
            listaColunas.add("Nome");
            listaColunas.add("Login");
            listaColunas.add("Cargo");

            System.out.println("Nome: ");
            listaRegistros.add(registros.nextLine());
            System.out.println("Login: ");
            listaRegistros.add(registros.nextLine());
            System.out.println("Cargo: ");
            listaRegistros.add(registros.nextLine());
            

        //     System.out.println("Continuar? S/n");
        //     String continuar = registros.nextLine().toUpperCase(Locale.ROOT);
        //     if (continuar.equals("N")) {
        //         Path caminho = Paths.get("dadosInput.csv");
        //         Files.write(caminho, listaDados, StandardCharsets.UTF_8);
        //         break;
        //     } else {
        //         Path caminho = Paths.get("dadosInput.csv");
        //         Files.write(caminho, listaDados, StandardCharsets.UTF_8);
        //     }
        // }
        
        listaDados.add(String.valueOf(listaColunas));
        listaDados.add(String.valueOf(listaRegistros));
        Path caminho = Paths.get("dadosInput.csv");
        Files.write(caminho, listaDados, StandardCharsets.UTF_8);
        Function.sleep();
        System.out.println(FunctionsCores.colorVerde + "\tABRA O CSV E VEJA SEU LOGIN." + FunctionsCores.reset);
        Function.sleep();
        Sistema.startSystem();
    }
}

