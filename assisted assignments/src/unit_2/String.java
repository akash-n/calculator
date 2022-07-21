package unit_2;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String sl="GINGER ALE aks9s";
		java.lang.String s2="ape is monkey stringerstinger";
		System.out.println(sl.length());
		System.out.println(sl.substring(2));//substring
		System.out.println(sl.compareTo(s2));//string compare
		System.out.print(s2.isEmpty());
		System.out.println(s2.toUpperCase());
		System.out.println(sl.toLowerCase());
		java.lang.String replace=s2.replace('a', 'l');
		System.out.println(s2);
		System.out.println(sl.equals(s2));
		StringBuffer s=new StringBuffer("happyday");
		s.append("new world");
		System.out.println(s);
         s.delete(2,5);
        System.out.println(s);
             s.insert(3, "worry");
          System.out.println(s);
          StringBuilder sb1=new StringBuilder("MICKEY");
  		sb1.append("MOUSEe");
  		System.out.println(sb1);

		System.out.println(sb1.reverse());
System.out.println(sb1.delete(0, 1));
StringBuffer sbr = new StringBuffer("cat"); 
sbr.reverse(); 
System.out.println("String to StringBuffer");
System.out.println(sbr); 



	}

}
