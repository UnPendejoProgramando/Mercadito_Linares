import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import java.util.ArrayList;


class Program{
	public static void main(String[] args){
		int eleccion;
		int otro = 0;
		String union = "";
		JOptionPane.showMessageDialog(null, "Bienvenido");
		
		

		ArrayList<String> conjuntoA = new ArrayList<String>();
		Set<String> A = new HashSet();
		ArrayList<String> conjuntoB = new ArrayList<String>();
		Set<String> B = new HashSet();	
			
		boolean flag = true;
		while (flag == true){
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("1.- Ingresar conjunto A \n 2.- Ingresar conjunto B \n 3.- Mostrar el conjunto Union \n 4.- Mostrar el conjunto Interseccion \n 5.- Mostrar diferencia del conjunto A \n 6.- Mostrar diferencia del conjunto B \n 7.- Salir"));
			switch(eleccion){
				case 1:
				
					while (otro != 1){
						conjuntoA.add(JOptionPane.showInputDialog("Ingresa un valor a tu conjunto"));
						otro = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro valor?");
					
					}
					
					break;
				case 2:
					otro = 0;
					while (otro != 1){
						conjuntoB.add(JOptionPane.showInputDialog("Ingresa un valor a tu conjunto"));
						otro = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro valor?");
					}
				
					

					break;
				case 3:
					
					for(String i : conjuntoA){
						A.add(i);
					}
					for(String x : conjuntoB){
						B.add(x);
					}
					JOptionPane.showMessageDialog(null, "A = " + A + "\n" + "B = " + B + "\n");
					A.addAll(B);
					for (String i : A){
						union += i + ", ";
					}
					JOptionPane.showMessageDialog(null, "U = " + "[ " + union + " ]");
					A.clear();
					B.clear();
					break;
				case 4:
					String inter = "";
					for(String i : conjuntoA){
						A.add(i);
					}
					for(String i : conjuntoB){
						B.add(i);
					}
					JOptionPane.showMessageDialog(null, "A = " + A + "\n" + "B = " + B + "\n");
					A.retainAll(B);
					for (String x : A){
						inter += x + ", ";
					}
					JOptionPane.showMessageDialog(null, "Interseccion = " + "[" + inter + "]");
					A.clear();
					B.clear();
					break;
				case 5:
					String difA = "";
					for(String i : conjuntoA){
						A.add(i);
					}
					for(String i : conjuntoB){
						B.add(i);
					}
					JOptionPane.showMessageDialog(null, "A = " + A + "\n" + "B = " + B + "\n");
					A.removeAll(B);
					for(String a : A){
						difA += a + ", ";
					}
					
					JOptionPane.showMessageDialog(null, "Direrencia de A = " + "[" + difA + "]");
					A.clear();
					B.clear();
					break;
				case 6:
					String difB = "";
					for(String i : conjuntoA){
						A.add(i);
					}
					for(String i : conjuntoB){
						B.add(i);
					}
					JOptionPane.showMessageDialog(null, "A = " + A + "\n" + "B = " + B + "\n");
					B.removeAll(A);
					for(String b : B){
						difB += b + ", ";
					}
					
					JOptionPane.showMessageDialog(null, "Direrencia de B = " + "[" + difB + "]");
					A.clear();
					B.clear();
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "See you next time");
					flag = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion incorrecta, intenta de nuevo");
			}

		}		
		


	}
}


