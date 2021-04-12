package gonza16;
import java.awt.*;
import javax.swing.*;



public class Movimiento extends JFrame {
    JButton bttar, bttab, bttiz, bttde, btr; 
    JPanel cont;
    public Movimiento(){
        JFrame v = new JFrame("Girar grafico");
        
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        
        bttar = new JButton("Arriba");
        bttar.setBounds(40, 100, 70, 30);
        cont.add(bttar);
        //bttar.addActionListener(man);
    }
    public static void main(String[] args) {
        Movimiento app = new Movimiento();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
