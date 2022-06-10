import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class loading extends JFrame{
   
    private JProgressBar Barra_de_Carregamento = new JProgressBar();
    private JButton Iniciar = new JButton("click");
   
    // fonte
    private Font Fonte = new Font("Lucida Console", Font.PLAIN, 18);
    private JLabel Status = new JLabel();
   
    public loading(){
        super("Thaiza F. ...");
           
        // layout do JFrame
            setLayout(new FlowLayout());
       
        // propriedades da janela
        this.setSize(300,120);
        
        // localização do programa na tela
        this.setLocation(100,100);
        this.setResizable(false);
        this.setVisible(true);
     
      // percentual carregamento
      Barra_de_Carregamento.setStringPainted(true);    
      this.add(Barra_de_Carregamento);
     
      this.add(Iniciar);
      Status.setFont(Fonte);
      this.add(Status);
   
    // click no botão
    Iniciar.addActionListener(new ActionListener(){
       
        public void actionPerformed(ActionEvent event) {
            Rectangle progresso = Barra_de_Carregamento.getBounds();  
            progresso.x = 0;  
            progresso.y = 0;  
           
            Barra_de_Carregamento.setValue(0);  
            // barra de carregamento valor mínimo igual a zero
            Barra_de_Carregamento.setMinimum(0);  
            // barra de carregamento valor máximo igual a cem
            Barra_de_Carregamento.setMaximum(100);
         
          // modifica o cursor para indicar carregamento
          setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));         
         
             for(int i=0 ; i <= 100 ; i++){
                // 0,1 segundos equivale a 1% da barra de carregamento
                try {Thread.sleep(10);} catch (InterruptedException Ig) {}

                // atualizando o valor da barra de carregamento
                Barra_de_Carregamento.setValue(i);
                Barra_de_Carregamento.paintImmediately(progresso); 
             }
          // cursor forma inicial
          setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

          // mensagem fim carregamento
          Status.setText("Carregamento Concluido.");
        }
    });  
    }
    public static void main(String[] args) {
        new loading();
    }
}
