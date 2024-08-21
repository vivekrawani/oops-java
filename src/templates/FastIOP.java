package templates;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastIOP {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
             StringTokenizer st = new StringTokenizer(br.readLine());
             while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                System.out.println(tmp);                
             }
            
            String str = br.readLine();
           
            System.out.println(str);


    }
}
