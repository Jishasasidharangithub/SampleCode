public class VowelsConsonants {

	public static void main(String[] args) {
String name="Edubridge";
		char[] names=name.toCharArray();
		int count=0;
		for(char ch : names)
		{
			switch(ch)
			{
			case 'a','e','i','o','u','A','E','I','O','U':
				count++;
			System.out.println(ch);
			
			
			
			}
		}
		System.out.println("the no.of.vowels "+count);
	}
}