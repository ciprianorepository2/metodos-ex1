package exercicio;

public class Hora {
	
	public void dizHora(int hora) {
		switch(hora) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			bomDia();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			boaTarde();
			break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
			boaNoite();
			break;
		default:
			break;
		}
		
	}
	
	public void bomDia(){
		System.out.println("Bom Dia!");
	}
	public void boaTarde(){
		System.out.println("Boa Tarde!");
	}
	public void boaNoite(){
		System.out.println("Boa Noite!");
	}
	
	
	
}
