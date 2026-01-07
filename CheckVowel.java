import java.util.Scanner;
class CheckVowel
{
    public static void main(String args[])
	{
		System.out.print("Enter character:");
                Scanner sc=new Scanner(System.in);
		String ch;
		ch= sc.next();
		if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
		System.out.println("Entered Character is a Vowel");
		}
		else{
		System.out.println("Entered Character is a consonant");
		}

	}
}