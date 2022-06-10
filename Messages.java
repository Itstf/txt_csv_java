public enum Messages {
    BemVindo("=-=-=-=-=-=-=-=-=-=-=" + FunctionsCores.colorAmarelo + "\nBEM VINDO AO CADASTRO DE PRODUTOS . ." + FunctionsCores.reset),
    Saida(FunctionsCores.bgRed + "Até algum dia quando precisar de mim novamente . .\n" + FunctionsCores.reset),
    RegistrationUser("=-=-=-=-=-=-=-=-=-=-=" + FunctionsCores.bgRed + "\nCADASTRO DE USUÁRIOS " + FunctionsCores.reset + "\n");

    private String msg;

    Messages(String msg){
        this.msg = msg;
    }

    public String  getValue(){
        return msg;
    }
}