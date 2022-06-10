public enum Options {
    NAO(0), SIM(1);

    private int op;
    Options(int op){
        this.op = op;
    }
    public int getValue(){
        return op;
    }
}