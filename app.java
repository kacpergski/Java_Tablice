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
}
}
