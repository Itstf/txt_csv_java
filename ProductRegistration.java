import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductRegistration {
    static void cadastrado() throws IOException{
        Function.limpar();
        System.out.println(Messages.BemVindo.getValue());
        Function.sleep();
                       
            Scanner input = new Scanner(System.in);

            ArrayList<String> listaLogin = new ArrayList<>();
    
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\nQual o código do produto? : ");
            String codProduto = input.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            listaLogin.add("CÓDIGO DO PRODUTO: " + codProduto);
            listaLogin.add("Data e hora da criação do txt: " + dtf.format(LocalDateTime.now()));
            
            Function.sleep();

            System.out.println("\nDigite o nome do arquivo .txt para guardar as info do produto: ");
            String nomeArquivo = input.nextLine();
            ArrayList<String> lista = new ArrayList<>();
            while (true){
                Function.sleep();
                System.out.println("\nDigite o produto a ser adicionado: ");
                lista.add("PRODUTO: " + input.nextLine());

                System.out.println("\nDigite a quantidade do produto cadastrado: ");
                lista.add("QUANTIDADE: " + input.nextLine());
                DateTimeFormatter addLogin = DateTimeFormatter.ofPattern("HH:mm:ss");
                listaLogin.add(lista + " adicionado! - " + addLogin.format(LocalDateTime.now()));
    
                Function.sleep();
                System.out.println(FunctionsCores.colorAmarelo + "\nContinuar add? S/n".toUpperCase(Locale.ROOT)+ FunctionsCores.reset );
                String continuar = input.nextLine().toUpperCase();
                if (continuar.equals("S")){
                    Function.sleep();
                    Function.limpar();
                }
                else{
                    System.out.println("\nDigite: [" + Options.NAO.getValue() + "]Para sair") ;
                    int usuarioDigitou = input.nextInt();
                    if (usuarioDigitou == Options.NAO.getValue()){
                        System.out.println("Usuário SAIU");
                        DateTimeFormatter userSair = DateTimeFormatter.ofPattern("HH:mm:ss");
                        listaLogin.add("Voltando ao menu . . - "+userSair.format(LocalDateTime.now())+ "\n\n");
                        ManipulateTxt arquivo = new ManipulateTxt();
                        arquivo.gravarTxt(nomeArquivo, lista, listaLogin);
                        Function.sleep();
                        break;
                    }
                    else {
                        System.out.println("User indeciso. " + Options.NAO.getValue() + "," + Options.SIM.getValue());
                        DateTimeFormatter error = DateTimeFormatter.ofPattern("HH:mm:ss");
                        listaLogin.add("Usuário não digitou nenhum número existente e foi expulso. - " + error.format(LocalDateTime.now()));
                        listaLogin.add("Kick. . .\n\n");
                        break;
                    }               
                    // ManipularTxt arquivo = new ManipularTxt();
                    // arquivo.gravarTxt(nomeArquivo, lista, listaLogin);
                    // Function.sleep();
                }     
            ManipulateTxt arquivo = new ManipulateTxt();
            arquivo.gravarTxt(nomeArquivo, lista, listaLogin);
            Function.sleep();
        }
    }
}