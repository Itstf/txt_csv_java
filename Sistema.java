import java.io.IOException;
import java.util.Scanner;

public class Sistema {
    static void startSystem() throws IOException{
        while(true){
            // limpa console
            Function.limpar();

            int inputHome;
            Scanner entrada = new Scanner(System.in);
            System.out.println("HOME\n\t(1) Cadastrar Produtos\n\t(2) Alterar a quantidade de produtos\n\t(3) Remover produtos\n\t(4) Verificar produtos cadastrador\n\t(5) Sair do Sistema.");
            System.out.println("\nDigite sua opcao: ");
            inputHome = entrada.nextInt();
            System.out.println("----------------------------------");

            Function.sleep();

            if (inputHome == 1){
                ProductRegistration.cadastrado();
            }
            else if(inputHome == 3){
                DeleteTxt.deleteArquivo();
            }
            else if (inputHome == 4){
                Function.sleep();
                Function.limpar();
                ReadFileTxt.listarTxt();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Function.limpar();
            }
            else if (inputHome == 5){
                System.out.println(Messages.Saida.getValue());
                System.exit(0);
            }
        }
    }
}