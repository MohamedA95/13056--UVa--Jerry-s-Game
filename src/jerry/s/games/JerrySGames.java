
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class JerrySGames {

    public static void main(String[] args) {
    Scanner input=null;
    try{input=new Scanner(Paths.get("jerry.in"));}
    catch(IOException io){System.out.println("io");}
    int t=input.nextInt();
    for(int i=1;i<=t;i++){
        int r=input.nextInt();
        int v=input.nextInt();
        System.out.println("Case "+i+": "+((r*2*Math.PI)/4)/v);
    }

        
        
        
        }
    
}
