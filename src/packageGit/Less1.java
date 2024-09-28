package packageGit;

public class Less1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sen = "My name is Shrey";
		String arr[] = sen.split(" ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

}
