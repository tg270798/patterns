
public class Main
{
    static void pattern7(int n){
        int k =0;
        for(int row = 1;row<=n;row++){
            if(k>0){
                for(int i=1;i<=k;i++){
                    System.out.print(" ");
                }
            }
            for(int col = k+1;col<=n;col++){
                System.out.print("*");
            }
            k++;
            
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int n=5;
		pattern7(n);
	}
}
