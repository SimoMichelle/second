package triangle;


import java.util.Scanner;



public class DessineTriangle {
	int h,i,j;
	int a;
	
	Scanner sc = new Scanner(System.in);
	
	public DessineTriangle() {
		int i =0;
		do {
			
		
		System.out.println("Entrer la taille du triangle :");
		
		h = sc.nextInt();
		if (h>3 && h<10) {
		
		System.out.println("Vous avez choisi de dessiner le triangle donc le cotè mesure " +h+ " lignes");
		System.out.println("Donne le choix de l'orientation :");
		a = sc.nextInt();
		
		if ( a== 0) {
		System.out.println("Le programme dessine un triangle orienté vers le bas");
		dessineTriangleBas(h);}
		if(a==1) {
			System.out.println("Le programme dessine un triangle orienté vers le haut");
			dessineTriangleHaut(h);
			}
		
		System.out.println("Merci d'avoir déssiné ce triangle");
		System.exit(0);
		}
		i++;
		}while(i <3);
		System.exit(0);
		
		
		
	}
	
		
	
    public void dessineTriangleBas(int m) {
    	
    	for(i = m;i>=1;i--) {
    		
    		for(j = 1;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println("\n");
    	}
    	
    }
    public void dessineTriangleHaut(int n) {
    	
        for(i = 1;i<= n;i++) {
    		
    		for(j = 1;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println("\n");
    	}
    }
}

