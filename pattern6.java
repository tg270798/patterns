
public class Main
{
    static void pattern6(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n-row;col++){
                System.out.print(" ");
            }
            
            for(int star = 1;star <=row;star++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int n=8;
		pattern6(n);
	}
}
