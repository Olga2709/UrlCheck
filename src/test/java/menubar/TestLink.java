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
        clickonLinkMenu("//div/a[text() = 'Portfolio']");
        assertEquals(composeLink("/portfolio/"), currentLink());


    }
    @Test
    public void Servises() throws MalformedURLException {
        clickonLinkMenu("//div/a[text() = 'Services']");
        assertEquals(composeLink("/services/"), currentLink());
    }
    @Test
    public void Careers() throws MalformedURLException {
        clickonLinkMenu("//div/a[text() = 'Careers']");
        assertEquals(composeLink("/vacancies/"), currentLink());
    }
    @Test
    public void Contact() throws MalformedURLException {
        clickonLinkMenu("//div/a[text() = 'Contact']");
        assertEquals(composeLink("/contacts/"), currentLink());
    }


    @AfterEach
    public void quitPage() {
        stop();
    }
}
