
public class Main
{
    static void pattern10(int n){
        int k =0;
        for(int row = 1;row<=n;row++){
            for(int space = (n-row);space>=1;space--){
                System.out.print(" ");
            }
            
            for(int star = 1;star<=row;star++){
                System.out.print("* ");
            }
            //k++;
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int n=5;
		pattern10(n);
	}
}
