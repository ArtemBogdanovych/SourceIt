

public class Picture {
	public int stroki;
	public int shirina;
	
Picture (int stroki,int shirina){
	this.stroki=stroki;
	this.shirina=shirina;

}
public void getDraw() {
			switch(stroki) {
		case 1:
		//	for (int j=1;j<shirina;j++) {
				if(shirina==1) {
				System.out.print("(");
				}
				if(shirina==2) {
				System.out.print("(");
				System.out.print("|");
				}
				if(shirina==3) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				}
				if(shirina==4) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_");
				}
				if(shirina==5) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_");
				System.out.print("|");
				System.out.print(")");
				}
			
				//	}
							
			break;
		case 2:
		//	for (int j=1;j<=shirina;j++) {
				if(shirina==1) {
				System.out.print("(" + "\n");
				System.out.print("(");
				
				}
				if(shirina==2) {
				System.out.print("(");
				System.out.print("|"+"\n");
				System.out.print("(");
				System.out.print(" ");
				}
				if(shirina==3) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("=");
				}
				if(shirina==4) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("=");
				System.out.print("`");
				}
				if(shirina==5) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_");
				System.out.print("|");
				System.out.print(")"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("=");
				System.out.print("`");
				System.out.print(".");
				}
				if(shirina==6) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`");
					}
				if(shirina==7) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`");
					System.out.print("=");
					}
				if(shirina==8) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`");
					System.out.print("=");
					System.out.print(")");
					}
			//}
			break;
		case 3:
		//	for (int j=1;j<=shirina;j++) {
				if(shirina==1) {
				System.out.print("(" + "\n");
				System.out.print("(" + "\n");
				System.out.print("(" );
				
				}
				if(shirina==2) {
				System.out.print("(");
				System.out.print("|"+"\n");
				System.out.print("(");
				System.out.print(" "+"\n");
				System.out.print("(");
				System.out.print("``");
				}
				if(shirina==3) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("="+"\n");
				System.out.print("(");
				System.out.print("``");
				System.out.print(")");
				
				}
				if(shirina==4) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("=");
				System.out.print("`"+"\n");
				System.out.print("(");
				System.out.print("``");
				System.out.print(")");
				System.out.print("_");
				
				}
				if(shirina==5) {
				System.out.print("(");
				System.out.print("|");
				System.out.print("_");
				System.out.print("_");
				System.out.print("|");
				System.out.print(")"+"\n");
				System.out.print("(");
				System.out.print(" ");
				System.out.print("=");
				System.out.print("`");
				System.out.print("."+"\n");
				System.out.print("(");
				System.out.print("``");
				System.out.print(")");
				System.out.print("_");
				System.out.print("(");
				}
				if(shirina==6) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`"+"\n");
					System.out.print("(");
					System.out.print("``");
					System.out.print(")");
					System.out.print("_");
					System.out.print("(");
					System.out.print("``");
					}
				if(shirina==7) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`");
					System.out.print("="+"\n");
					System.out.print("(");
					System.out.print("``");
					System.out.print(")");
					System.out.print("_");
					System.out.print("(");
					System.out.print("``");
					System.out.print(")");
					}
				if(shirina==8) {
					System.out.print("(");
					System.out.print("|");
					System.out.print("_");
					System.out.print("_");
					System.out.print("|");
					System.out.print(")");
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(" "+"\n");
					System.out.print("(");
					System.out.print(" ");
					System.out.print("=");
					System.out.print("`");
					System.out.print(".");
					System.out.print("`");
					System.out.print("=");
					System.out.print(")"+"\n");
					System.out.print("(");
					System.out.print("``");
					System.out.print(")");
					System.out.print("_");
					System.out.print("(");
					System.out.print("``");
					System.out.print(")");
					System.out.print(" ");
					}
		//	}
			break;
		default:
			System.out.println("привышен диапазон");
			
			
			}
		}
   }

