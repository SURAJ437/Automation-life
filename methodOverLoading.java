package basicPrograms;
// A CLASS HAVING METHOD WITH SAME NAME BUT DIFFERENT FORMAL ARGUMENTS IS KNOWN AS METHOD OVER LOADING
//appn:- mehod over loading increases the readability of the program
public class methodOverLoading {

	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
