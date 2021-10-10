
public class Main
{
    static void pattern12(int n){
        int k =0;
        for(int row = 1;row<=n;row++){
            if(k>0){
                for(int space = 1;space<=k;space++){
                    System.out.print(" ");
                }
            }
            
            for(int star = (n-row)+1;star>=1;star--){
                System.out.print("* ");
            }
            k++;
            System.out.println();
        }
        
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
		pattern12(n);
	}
}
