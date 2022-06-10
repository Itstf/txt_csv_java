import java.io.File;
import java.util.Scanner;

public class DeleteTxt {
    static void deleteArquivo(){

        Scanner deletar = new Scanner(System.in);
        System.out.printf("Informe o nome de arquivo texto:\n");
        String nomeTxt = deletar.nextLine();

        File file = new File(nomeTxt); file.delete();
        System.out.println(FunctionsCores.colorAmarelo +"O arquivo foi limpado!" + FunctionsCores.reset);

        Function.sleep();
        Function.limpar();
    }
}
