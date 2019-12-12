
package AsistentePaquete;

import java.io.IOException;

public class AbrirOffice {
    public static String programaOffice;
    public static void main() throws IOException{
        Process exec = Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\Office16\\"+programaOffice+".exe");
    }
}
