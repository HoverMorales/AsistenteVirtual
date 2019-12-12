
package AsistentePaquete;

import java.io.IOException;
import javax.speech.AudioException;


public class AccionesPorVoz {
    public static void main() throws InterruptedException, AudioException, IOException 
    {
        AsistentePantallaPrincipal.jTextField1.setText(recvoz.gst);
            
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "google":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Abriendo GOOGLE");
                //recvoz.recognizer.suspend();
                //ResVoz.main();
               // ResVoz.voz.speak("Abriendo GOOGLE");
            
                //recvoz.recognizer.resume();
                BusquedaWeb.Internet("http://www.google.com/");
                        }
                                    }
                
                
                
                
                
                
        }        
                
        
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "Hola":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Hola "+NombreUsuario.getNombreUsuario());
                //recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Hola "+NombreUsuario.getNombreUsuario());
               
                
                
                        }
                                    }
             
                
                
                
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "GIHOAN":
                {
                    for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Dime "+NombreUsuario.getNombreUsuario());  
                    recvoz.recognizer.suspend();
                    //ResVoz.main();
                    //ResVoz.voz.speak("Dime "+NombreUsuario.getNombreUsuario());
                   
                    recvoz.recognizer.resume();
                        }
                                    }
                    
                          
                                          
                }
                break;
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
        case "como-estas":
            for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                

                }
                if(i==1){
                    
                 AsistentePantallaPrincipal.jTextField2.setText("Bien, gracias."
                         + " ¿Tú cómo estás?");
                 recvoz.recognizer.suspend();
                 //ResVoz.main();
                 //ResVoz.voz.speak("Bien, gracias."
                  //       + " Tu como estas?");
                
                 recvoz.recognizer.resume();
                }
                
                
            }    
           break;
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "como-te-llamas":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Mi nombre es GIHOAN");
                recvoz.recognizer.suspend();
               // ResVoz.main();
               // ResVoz.voz.speak("Mi nombre es GIHOAN");
            
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;    
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "facebook":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Abriendo FACEBOOK");
                recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Abriendo FACEBOOK");
                BusquedaWeb.Internet("https://www.facebook.com/");
            
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;    
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "word":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Abriendo Word");
                recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Abriendo WORD");
                
                AbrirOffice.programaOffice="WINWORD";
                AbrirOffice.main();
                
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "excel":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Abriendo EXCEL");
                recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Abriendo EXCEL");
                AbrirOffice.programaOffice="EXCEL";
                AbrirOffice.main();
               
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "powerpoint":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Abriendo POWERPOINT");
                recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Abriendo POWERPOINT");
                
                
                AbrirOffice.programaOffice="POWERPNT";
                AbrirOffice.main();
               
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;    
        }

        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "quien-te-creo":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Me crearon tres personas."
                        +"Sus nombres son Gianella, Hover y Angel");
                recvoz.recognizer.suspend();
                //ResVoz.main();
                //ResVoz.voz.speak("Me crearon tres personas."
                //        +"Sus nombres son Gianella, Hover y Angel");
            
                recvoz.recognizer.resume();
                        }
                                    }
                
            break;    
        }
        switch(AsistentePantallaPrincipal.jTextField1.getText()){
            case "Salir":
                for(int i=0;i<2;i++){
                if(i==0){
                AsistentePantallaPrincipal.jTextField2.setText("");   
                        }
                if(i==1){  
                AsistentePantallaPrincipal.jTextField2.setText("Hasta luego");
                System.exit(0);
                        }
                                    }
                
            break;    
        }
    }
}
