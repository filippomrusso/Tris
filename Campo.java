package tris;

import java.util.Scanner;

public class Campo {
    
    Scanner input = new Scanner(System.in);       
    String[][] campo = new String[3][3];

    // Costruttore del campo
    public Campo(){
        this.campo=campo;
        for(int i=0; i<campo.length; i++){
            for (int k=0; k<campo.length; k++){
                campo[i][k]=" ";
            }
        }
    }
    
    //  Funzione che verrà ripetuta a ogni azione dei 2 giocatori, aggiorna il campo graficamente
    public void disegnaCampo(){
           System.out.println("   A   B   C");
           for(int i=0; i<campo.length; i++){          
                System.out.println(i+1+ " " +campo[i][0] + "  | " + campo[i][1] + " | " + campo[i][2]);          
           if(i<2){
               System.out.println("  ---|---|---");
           }
        }
    }

    // Giocatore croce
    public String coordinataX(){
        System.out.println("\n Scegli dove piazzare la x");
        String coordinataX = input.nextLine();
        return coordinataX;
    }

    // Giocatore cerchio
    public String coordinataO(){
        System.out.println("\n Scegli dove piazzare la o");
        String coordinataO = input.nextLine();
        return coordinataO;
    }


    // Funzione che si occuppa di assegnare alle posizioni del campo un valore croce/cerchio
    // a seconda delle cordinate da  noi esplicitate
    public void assegnaValore(String coordinata, String giocatore){
        
        if (coordinata.equalsIgnoreCase("1a")
           || coordinata.equalsIgnoreCase("a1")){
            
            campo[0][0]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("1b")
           || coordinata.equalsIgnoreCase("b1")){
            
            campo[0][1]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("1c")
           || coordinata.equalsIgnoreCase("c1")){
            
            campo[0][2]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("2a")
           || coordinata.equalsIgnoreCase("a2")){
            
            campo[1][0]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("2b")
           || coordinata.equalsIgnoreCase("b2")){
            
            campo[1][1]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("2c")
           || coordinata.equalsIgnoreCase("c2")){
            
            campo[1][2]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("3a")
           || coordinata.equalsIgnoreCase("a3")){
            
            campo[2][0]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("3b")
           || coordinata.equalsIgnoreCase("b3")){
            
            campo[2][1]=giocatore;
        }
        
        if (coordinata.equalsIgnoreCase("3c")
           || coordinata.equalsIgnoreCase("c3")){
            
            campo[2][2]=giocatore;
        }
    }



    // Funzione che scannerizza l'intero campo in cerca di situazioni di vittoria/sconfitta, parità
    // la funzione viene richiamata dopo ogni giocata, in modo da controllare il campo di gioco dopo ogni suo cambiamento
    public boolean controllaCaselle(){
        
       
//          x  | x | x          or O
//          ---|---|---
//          _  | _ | _
//          ---|---|---
//          _  | _ | _

        if (campo[0][0].equals("x") && campo[0][1].equals("x") && campo[0][2].equals("x") ||
            campo[0][0].equals("o") && campo[0][1].equals("o") && campo[0][2].equals("o")){            
            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            
            return false;
            
        }
        
        
//          x  | _ | _          or O
//          ---|---|---
//          x  | _ | _
//          ---|---|---
//          x  | _ | _

        if (campo[0][0].equals("x") && campo[1][0].equals("x") && campo[2][0].equals("x") || 
            campo[0][0].equals("o") && campo[1][0].equals("o") && campo[2][0].equals("o")    ){            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }
        
        
//          _  | x | _          or O
//          ---|---|---
//          _  | x | _
//          ---|---|---
//          _  | x | _
        
        if (campo[0][1].equals("x") && campo[1][1].equals("x") && campo[2][1].equals("x") || 
            campo[0][1].equals("o") && campo[1][1].equals("o") && campo[2][1].equals("o")){            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }
        
        
//          _  | _ | x          or O
//          ---|---|---
//          _  | _ | x
//          ---|---|---
//          _  | _ | x

        if (campo[0][2].equals("x") && campo[1][2].equals("x") && campo[2][2].equals("x") ||
            campo[0][2].equals("o") && campo[1][2].equals("x") && campo[2][2].equals("x")){            
            System.out.println("\n");
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }


//          _  | _ | _          or O
//          ---|---|---
//          x  | x | x
//          ---|---|---
//          _  | _ | _

        if (campo[1][0].equals("x") && campo[1][1].equals("x") && campo[1][2].equals("x") ||
            campo[1][0].equals("o") && campo[1][1].equals("o") && campo[1][2].equals("o")    ){            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }  
        
        
//          _  | _ | _          or O
//          ---|---|---
//          _  | _ | _
//          ---|---|---
//          x  | x | x

        if (campo[2][0].equals("x") && campo[2][1].equals("x") && campo[2][2].equals("x") ||
            campo[2][0].equals("o") && campo[2][1].equals("o") && campo[2][2].equals("o")){            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }
        

//          _  | _ | x          or O
//          ---|---|---
//          _  | x | _
//          ---|---|---
//          x  | _ | _

        if (campo[2][0].equals("x") && campo[1][1].equals("x") && campo[0][2].equals("x") ||           
            campo[2][0].equals("o") && campo[1][1].equals("o") && campo[0][2].equals("o")){
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
            
        }
        
        
//          x  | _ | _          or O
//          ---|---|---
//          _  | x | _
//          ---|---|---
//          _  | _ | x

        if (campo[0][0].equals("x") && campo[1][1].equals("x") && campo[2][2].equals("x") ||
            campo[0][0].equals("x") && campo[1][1].equals("x") && campo[2][2].equals("x")){            
            System.out.println("\n");
            System.out.println(" _______________");
            System.out.println("|___GAME OVER___|");
            System.out.println("\n");
            return false;
        }
     
        return true;
    }
    
    
    
    

    public String[][] getCampo(){
        return campo;
    }


    public void setCampo(String[][] campo) {
        this.campo = campo;
    }
    
}
