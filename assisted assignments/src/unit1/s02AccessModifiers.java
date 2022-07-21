package unit1;


	class defAccessModifer {
		
		void display() {
			System.out.println("It's Access modifier");
			
		}

	}
	public class s02AccessModifiers {
		public static void main(String[] args) {
			System.out.println("Access modifier");
			defAccessModifer obj = new defAccessModifer();
		obj.display();	
		}
	}