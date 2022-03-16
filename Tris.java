package tris;

public class Tris {
    
    static boolean gioco = true;
    static boolean x = true;
    static boolean o = true;
        
    public static void main(String[] args) {
        
        Campo tris = new Campo();
        
        while(x==true && o==true){ 

            System.out.println("\n");
            tris.disegnaCampo();        
            String locationX = tris.coordinataX();
            tris.assegnaValore(locationX, "x");        
        
        
        x = tris.controllaCaselle();

        if (x==false){
            tris.disegnaCampo();
            System.exit(0);
        }
        

            System.out.println("\n");
            tris.disegnaCampo(); 
            String locationO = tris.coordinataO();
            tris.assegnaValore(locationO, "o");           
        
        
        o=tris.controllaCaselle();

        if (o==false){
            tris.disegnaCampo();
            System.exit(0);
        }
        }
    }
  }
 
