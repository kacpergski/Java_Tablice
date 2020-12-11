class App {
	public static void main(String args[]) {

	
	
	//System.out.println("Reszta z dzielnia 47 przez 10 = " + rn);
	//System.out.println("Reszta z dzielnia 35.5 przez 6 = " + rm);
	char[] name = new char[5];
	char[] surname = new char[11];
	int age = 32;
	
	
	name[0] = 'K';
	name[1] = 'a';
	name[2] = 'r';
	name[3] = 'o';
	name[4] = 'l';
	surname[0] = 'M';
	surname[1] = 'i';
	surname[2] = 'c';
	surname[3] = 'h';
	surname[4] = 'n';
	surname[5] = 'i';
	surname[6] = 'e';
	surname[7] = 'w';
	surname[8] = 'i';
	surname[9] = 'c';
	surname[10] = 'z';
	
	System.out.println("--------------------------");
		System.out.print("Imię: ");
		System.out.print(name[0]);
		System.out.print(name[1]);
		System.out.print(name[2]);
		System.out.print(name[3]);
		System.out.println(name[4]);
		
		System.out.print("Nazwisko: ");
		System.out.print(surname[0]);
		System.out.print(surname[1]);
		System.out.print(surname[2]);
		System.out.print(surname[3]);
		System.out.print(surname[4]);
		System.out.print(surname[5]);
		System.out.print(surname[6]);
		System.out.print(surname[7]);
		System.out.print(surname[8]);
		System.out.print(surname[9]);
		System.out.print(surname[10]);
		System.out.println(" [" + surname.length +"]");
		System.out.println("wiek: " + age);
		
	System.out.println("--------------------------");
		
	System.out.println("---------ZADANIE 2-----------------");
	System.out.println();
	System.out.println();
	System.out.println();
		
		int a=0;
		int[] postcode = new int[5];
		postcode[0] = 7; 
		postcode[1] = 2;
		postcode[2] = 6;
		postcode[3] = 0;
		postcode[4] = 0;
		
		
		System.out.println("--------------------------");
		System.out.print(postcode[0]);
		System.out.print(postcode[1]);
		System.out.print(postcode[2]);
		System.out.print(postcode[3]);
		System.out.println(postcode[4]);
		System.out.println("--------------------------");
		
		postcode[4] = 2;
		System.out.println("--------------------------");
		System.out.print(postcode[0]);
		System.out.print(postcode[1]);
		System.out.print(postcode[2]);
		System.out.print(postcode[3]);
		System.out.println(postcode[4]);
		System.out.println("--------------------------");
		
		postcode[4] = 4;
		System.out.println("--------------------------");
		System.out.print(postcode[0]);
		System.out.print(postcode[1]);
		System.out.print(postcode[2]);
		System.out.print(postcode[3]);
		System.out.println(postcode[4]);
		System.out.println("--------------------------");
		
		postcode[4] = 5;
		System.out.println("--------------------------");
		System.out.print(postcode[0]);
		System.out.print(postcode[1]);
		System.out.print(postcode[2]);
		System.out.print(postcode[3]);
		System.out.println(postcode[4]);
		System.out.println("--------------------------");
		
		
		System.out.println("---------ZADANIE 3-----------------");
		System.out.println();
		System.out.println();
		System.out.println(); 
		
		int[] index = {2,3,4,1,2,1};
		
		
		double[] oceny = new double[6];
		oceny[0] = 5;
		oceny[1] = 1;
		oceny[2] = 3.5;
		oceny[3] = 1;
		oceny[4] = 6;
		oceny[5] = 4.5;
		
		System.out.println("-------------------------------------");
		System.out.print("Student: ");
		System.out.print(index[0]);
		System.out.print(index[1]);
		System.out.print(index[2]);
		System.out.print(index[3]);
		System.out.print(index[4]);
		System.out.print(index[5]);
		System.out.println();	
		
		//System.out.println("--------------------------");	
			
		//System.out.println("--------------------------");
		System.out.print("Oceny: ");
		System.out.print(oceny[0]+", ");
		System.out.print(oceny[1]+", ");
		System.out.print(oceny[2]+", ");
		System.out.print(oceny[3]+", ");
		System.out.print(oceny[4]+", ");
		System.out.print(oceny[5]+", ");
		System.out.println();	
		System.out.println("-------------------------------------");
	
}
}
