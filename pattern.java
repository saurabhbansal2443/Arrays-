
public class pattern
{
	public static void main(String[] args) {
		int n=5;

        
        for(int i=1 ;i<=n;i++){

            for(int j=1 ;j<=n-i;j++){  // spaces 
                System.out.print("\t");
            }

            for(int j=1 ;j<=i;j++){  // stars
                System.out.print("*\t");
            }
            System.out.println();
        }
		
        
	}
}
