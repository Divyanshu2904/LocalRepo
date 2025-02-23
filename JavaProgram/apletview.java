import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


@SuppressWarnings("removal")
class appletview extends Applet implements ActionListener {
    TextField t1=new TextField(5);
    TextField t2=new TextField(5);
    TextField t3=new TextField(5);
    Label l1=new Label("first no. :");
    Label l2=new Label("second no. :");
    Label l3=new Label("sum :");
    Button b=new Button("Add");

    public void inti(){
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            int i1=Integer.parseInt(t1.getText());
            int i2=Integer.parseInt(t2.getText());
            t3.setText(" "+(i1+i2));
        }
    }
}