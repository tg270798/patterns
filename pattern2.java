
public class Main
{
    static void pattern2(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		int n=5;
		pattern2(n);
	}
}
