public class Function {
    static void limpar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static void sleep(){
        // sleep
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}