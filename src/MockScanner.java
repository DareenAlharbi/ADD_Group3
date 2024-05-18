
import java.util.List;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ffaat
 */
import java.io.InputStream;


public class MockScanner extends InputStream {
    private final List<String> inputs;
    private int currentIndex;

    public MockScanner(List<String> inputs) {
        this.inputs = inputs;
        this.currentIndex = 0;
    }

    @Override
    public int read() {
        if (currentIndex < inputs.size()) {
            String input = inputs.get(currentIndex);
            currentIndex++;
            return input.getBytes()[0];
        }
        return -1;  // End of stream
    }
}