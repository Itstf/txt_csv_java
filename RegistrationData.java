public class RegistrationData{
    private String nome;
    private String login;
    private String cargo;

    public RegistrationData(){
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String name){
        nome = name;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String log ){
        login = log;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String car){
        cargo = car;
    }
}
