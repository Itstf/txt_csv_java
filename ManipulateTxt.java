import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class ManipulateTxt {
    public void gravarTxt(String nomeArquivo, ArrayList<String>lista, ArrayList<String>listaLogin) throws IOException {
        Path caminho = Paths.get(nomeArquivo + ".txt");
        Path logg = Paths.get("logg.txt");
        Files.write(caminho, lista, StandardCharsets.UTF_8);
        if (Files.exists(logg)) {
            Files.write(logg, listaLogin, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } 
        else {
            Files.write(logg, listaLogin, StandardCharsets.UTF_8);
        }
    }
}
