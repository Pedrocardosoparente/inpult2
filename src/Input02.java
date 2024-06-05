import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Oi, tudo bem?",
                "Responda",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Tudo bem?",
                "Dialog Title",
                2,
                null,
                null,
                "Responda");
        
        
        String[] acceptableValues = {"oi", "tudo bem?", "?"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "oiii",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}








                

        
        
        
                
                
    

