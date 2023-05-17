
public class ForByFor {

	public static void main(String[] args) {
		String symbol = "*";
		
		for(int i=0;i<3;i++) {//row
			System.out.print("|");
			
			for (int j=0;j<3;j++) {//column
				
				
				for(int k=0;k<3;k++) {//inside the sections
					
					if(i==1 && j==1) {
						symbol = "#";
					}else if(j==1) {
						symbol = "$";
					}else if(i==1) {
						symbol = "@";
					}else {
						symbol = "*";
					}
					
					System.out.print(symbol);
				}
				System.out.print("|");
			}
			System.out.println("");
		}

	}

}
