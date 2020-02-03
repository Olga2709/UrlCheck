package menubar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLink extends MainPage{
    @BeforeEach
    public void gotoPage() {
        init();
    }

    @Test
    public void Portfolio() throws MalformedURLException {
       String expected= getExpectedLink("//div/a[text() = 'Portfolio']");
       String actual = currentLink();

        assertEquals( expected, actual);




    }
    @Test
    public void Servises() throws MalformedURLException {
        String expected= getExpectedLink("//div/a[text() = 'Services']");
        String actual = currentLink();

        assertEquals( expected, actual);

    }
    @Test
    public void Careers() throws MalformedURLException {
        String expected= getExpectedLink("//div/a[text() = 'Careers']");
        String actual = currentLink();

        assertEquals( expected, actual);

    }
    @Test
    public void Contact() throws MalformedURLException {
        String expected = getExpectedLink("//div/a[text() = 'Contact']");
        String actual = currentLink();

        assertEquals( expected, actual);
    }


    @AfterEach
    public void quitPage() {
        stop();
    }
}
