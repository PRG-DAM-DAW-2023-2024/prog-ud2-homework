package test;

import com.mycompany.prog.ud2.homework.Activitat13;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

import static org.junit.Assert.assertTrue;

public class TestActivitat13 {

    private PrintStream oldOut;
    private InputStream oldIn;
    private ByteArrayOutputStream baos;
    
    @Before
    public void before() {
        // Redirigir salida
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        oldOut = System.out;
        System.out.flush();
        System.setOut(ps);
    }

    private void redirectInAndWriteInBuffer(String toWriteInBuffer) {
        InputStream inputStream = new ByteArrayInputStream(toWriteInBuffer.getBytes());
        BufferedInputStream in = new BufferedInputStream(inputStream);
        oldIn = System.in;
        System.setIn(in);
    }

    @Test
    public void testCircleArea() {
        // Redirigir entrada
        redirectInAndWriteInBuffer("17,43 21,45 12,32");
        Activitat13.main(null);
        String salidaSinBlancosNiSaltos = baos.toString().replaceAll("\n","").replaceAll(" ", "");
        String resultadoFinalAreaCirculo = "954,40";

        assertTrue("El área del círculo no es correcta. Revisa tus operaciones  o el número de decimales mostrados en ella",
                        salidaSinBlancosNiSaltos.contains(resultadoFinalAreaCirculo));

    }

    @Test
    public void testCirclePerimeter() {
        // Redirigir entrada
        redirectInAndWriteInBuffer("17,43 21,45 12,32");
        Activitat13.main(null);
        String salidaSinBlancosNiSaltos = baos.toString().replaceAll("\n","").replaceAll(" ", "");
        String resultadoFinalPerimetroCirculo = "109,51";

        assertTrue("El perímetro final del cículo no es correcto. Revisa tus operaciones o el número de decimales mostrados en ella",
                        salidaSinBlancosNiSaltos.contains(resultadoFinalPerimetroCirculo));

    }

    @Test
    public void testTriangleArea() {
        // Redirigir entrada
        redirectInAndWriteInBuffer("17,43 21,45 12,32");
        Activitat13.main(null);
        String salidaSinBlancosNiSaltos = baos.toString().replaceAll("\n","").replaceAll(" ", "");
        String resultadoFinalAreaTriangulo = "132,13";

        assertTrue("El área del triángulo obtenida no es correcta. Revisa tus operaciones o el número de decimales mostrados en ella",
                        salidaSinBlancosNiSaltos.contains(resultadoFinalAreaTriangulo));

    }

    @After
    public void after() {
        // Reestablecer salida
        System.setOut(oldOut);
        System.setIn(oldIn);
    }
}

