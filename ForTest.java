
package fortest;

import java.io.IOException;

public class ForTest {

    public static void main(String[] args) throws IOException{
        int i;
        
        /*
        System.out.println("Press S to stop.");
        
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);
*/
        for(i = 0; i < 10; i++) {
            System.out.println("Pass #" + i);
            //i++
        }
    }
}