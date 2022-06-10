import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	List<String> listaDados = new ArrayList<>();
	List<String> listaColunas = new ArrayList<>();
	List<String> listaRegistros = new ArrayList<>();

	private Scanner scanner;
	private boolean execute;
	private List<RegistrationData> dados;

	RegistrationCSV gravar = new RegistrationCSV();
	public static void main(String[] args) throws IOException {
		loading.main(args);
		new Main();
	}

	private Main() throws IOException {
		scanner = new Scanner(System.in);
		execute = true;
		dados = new ArrayList<RegistrationData>();

		Function.limpar();
		System.out.println(Messages.RegistrationUser.getValue());

		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("Q")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("J")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("K")) {
				gravar.salvarCSV();
			} else {
				System.out.println(FunctionsCores.bgRed + "\nOpção Inválida\n" + FunctionsCores.reset);
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("Q - Novo cadastro");
		System.out.println("J - Listar cadastros");
		System.out.println("K - Logar");
		return scanner.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			Function.limpar();
			Function.sleep();
			System.out.println("- Cadastro de Usuário - ");
			RegistrationData dt = new RegistrationData();
			dt.setNome(textInput("\nNome:"));
			dt.setLogin(textInput("\nLogin: "));
			dt.setCargo(textInput("\nCargo: "));
			listaColunas.add(dt.getNome());

			String cadastrar = textInput("\nAdicionar cadastro S/n ?".toUpperCase());
			if (cadastrar.equalsIgnoreCase("S")) {
				System.out.println(FunctionsCores.bgRed +"\nCadastro adicionado !!!" + FunctionsCores.reset);
				Function.sleep();
				dados.add(dt);
			} else if (cadastrar.equalsIgnoreCase("N")){
				Function.sleep();
				Function.limpar();
				System.out.println(FunctionsCores.bgRed + "\nCadastro ignorado !!!" + FunctionsCores.reset);
			} else {
				System.out.println(FunctionsCores.bgRed + "\nOpção inválida, vou ignorar o cadastro. \n" + FunctionsCores.reset);
			}

			String continua = textInput("\nContinuar cadastrando S/n ?\n".toUpperCase());
			if (continua.equalsIgnoreCase("N")) {
				Function.sleep();
				Function.limpar();
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				Function.limpar();
				// volta para o inicio do while
			} else {
				System.out.println(FunctionsCores.bgRed +"\nOpção inválida, deslogado por não colaborar !!! \n" + FunctionsCores.reset);
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (dados.size() == 0) {
			System.out.println(FunctionsCores.bgRed + "\nNão existem cadastros !!!\n" + FunctionsCores.reset);
		} else {
			System.out.println("\nCadastros: \n");
			for (int i = 0; i < dados.size(); i++) {
				RegistrationData dt = dados.get(i);
				System.out.println("Número do usuário: " + i);
				System.out.println("\tNome: " + dt.getNome());
				System.out.println("\tLogin: " + dt.getLogin());
				System.out.println("\tCargo: " + dt.getCargo() + "\n");
			}
			System.out.println("Usuários cadastrados ^\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return scanner.nextLine();
	}
}