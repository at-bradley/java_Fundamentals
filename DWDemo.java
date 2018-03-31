
package dwdemo;

import java.io.IOException;

public class DWDemo {

    public static void main(String[] args) throws IOException {
        char ch;
        
        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            } while(ch != 'q');
    }
}
