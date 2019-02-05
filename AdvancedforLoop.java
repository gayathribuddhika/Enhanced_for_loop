
package advancedforloop;


public class AdvancedforLoop {

    
    public static void main(String[] args) {
        int marks[] = {2,4,7,6,9,5};
        int total = 0;
        for(int x : marks){
            total += x;
        }
        System.out.println(total);
    }
    
}
