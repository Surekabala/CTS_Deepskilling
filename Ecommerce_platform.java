import java.util.*;
public class Ecommerce_platform {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
       String[] c = {"Keyboard", "Monitor", "Mouse", "CPU"};
     String search = sc.nextLine();
    boolean found = false;
        for(int i = 0; i < c.length; i++) {
            if(c[i].equals(search)) {
            found = true;
            System.out.println("Product found");
            break;
        }
    }       if(!found){
                System.out.println("Product not found");
            }
    }
}
