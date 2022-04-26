package Ex2;


import java.util.ArrayList;

public class main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ArrayList<Vehicule> list = new ArrayList<>();
		
		Vehicule v = new Vehicule() {
			
			@Override
			public String getProprietaire() {
				// TODO Auto-generated method stub
				return "Ismail";
			}
			
			@Override
			public String getModele() {
				// TODO Auto-generated method stub
				return "Merc";
			}
			
			@Override
			public String getMarque() {
				// TODO Auto-generated method stub
				return "amg";
			}
		};
		
		list.add(v);
		
		list.add(
			new Vehicule() {
				
				@Override
				public String getProprietaire() {
					// TODO Auto-generated method stub
					return "Aguero";
				}
				
				@Override
				public String getModele() {
					// TODO Auto-generated method stub
					return "Logan";
				}
				
				@Override
				public String getMarque() {
					// TODO Auto-generated method stub
					return "Dacia";
				}
			}
		);
		
		for(Vehicule v1 : list) {
			System.out.println(v1.toString());
		}
		
	}
}
