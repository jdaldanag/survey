package Survey;
import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable{
    private JFrame frame;
    
    public UserInterface(){ }
    
    public void run(){
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200,200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox Y = new JCheckBox("Yes!");
        JCheckBox N = new JCheckBox("No!");
        
        ButtonGroup group1 = new ButtonGroup();
        group1.add(Y);
        group1.add(N);
        
        container.add(Y);
        container.add(N);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton reason1 = new JRadioButton("No Reason.");
        JRadioButton reason2 = new JRadioButton("Because its fun!");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(reason1);
        group2.add(reason2);
        
        container.add(reason1);
        container.add(reason2);
        
        JButton button = new JButton("Done!");
        container.add(button);
    }
    
}
