import java.util.Arrays;
import java.util.Scanner;

public class ht1 {
	

	public static void main(String[] args) {
		// ������ �����
		String[] arrayOfStrings  = {"������", "���", "����", "����", "���", "������"};
		// ����� �����, ������� ���� ��������
		String[] selectStrings = Arrays.stream(arrayOfStrings) 	
					.filter(s -> s.length() > 3)			   
					.toArray(String[]::new);			     
			
			
			System.out.println(Arrays.toString(selectStrings));
		
	
	}

}

		// TODO Auto-generated method stub
 // ������ �������������
		//ht1.getRectangle();
	//}
//public static void getRectangle() {
	//  Scanner scanner = new Scanner(System.in);
   //   System.out.println("������� ������� - �");
    //  int a = scanner.nextInt();
     // System.out.println("������� ������� - b");
     //  int b = scanner.nextInt();

     //  String [][] sqr = new String[a][b];
     // for (int i = 0; i < a; i++){
      //    for (int j = 0; j < b ; j++){
             //  sqr[i][j] = "+";
       //   }
   // }
     //  for (int i = 1; i < a-1; i++){
      //     for (int j = 1; j < b-1 ; j++){
           //    sqr[i][j] = " ";
       //    }
     //  }
    //   for (int i = 0; i < a; i++){
       //   for (int j = 0; j < b ; j++){
         //     System.out.print(sqr[i][j]);
         // }
         //  System.out.println();
 

	    	
	    // }
	
// ������������ ����� � �������
//	int [] array= {2,7,10,26,43,55};
//int max =0;
//ht1.getMax(max, array);
//}
//public static int getMax(int max,int[] array) {
//for(int i=0; i<array.length;i++) {
//	if(array[i]>max) {
	//	max=array[i];
//	}
//}
//	System.out.println(String.valueOf(max));
//	return max;
//}



// ����������� ���������� ���� � ������ ������
//public static void main(String[] args) {
	//ht1.getWords();
//}
//public  static int getWords() {
  //  Scanner sc = new Scanner(System.in);
    //������ ����������� � �������
    //System.out.println("������� ����� ����� ������� ����� ������");
    //String input = sc.nextLine();
    //��������� ���������� ���� ����� 0
    //int count = 0;

    //���� ����� ���� �� ���� �����, ����� �������, ����� ����� ���������
    //if(input.length() != 0){
      //  count++;
        //��������� ������ ������, �� ������ �� ���
        //for (int i = 0; i < input.length(); i++) {
          //  if(input.charAt(i) == ' '){
                //���� ������ - ����������� ���������� ���� �� 1
            //    count++;
           // }
        //}
        //System.out.println("�� ����� "+count+"����");
      //}
    
       //return count;
   
//}

//}

//System.out.println(String.format("%.1f%n", Math.PI));	// 1 ����� ����� �������
//System.out.println(String.format("%.2f%n", Math.PI));	// 2 ����� ����� �������
//System.out.println(String.format("%.3f%n", Math.PI));	// 3 ����� ����� �������
//System.out.println(String.format("%.4f%n", Math.PI));	// 4 ����� ����� �������
//System.out.println(String.format("%.5f%n", Math.PI));	// 5 ����� ����� �������