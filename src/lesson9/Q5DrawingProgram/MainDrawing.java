package lesson9.Q5DrawingProgram;

import javax.swing.SwingUtilities;

public class MainDrawing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingProgramApp app = new DrawingProgramApp();
            app.setVisible(true);
        });
    }
}
