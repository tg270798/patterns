
public class Main
{
    static void pattern11(int n){
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
    }
    
	public static void main(String[] args) {
		int n=5;
		pattern11(n);
	}
}
