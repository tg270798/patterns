
public class Main
{
    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
                //col--;
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int n=5;
		pattern4(n);
	}
}
