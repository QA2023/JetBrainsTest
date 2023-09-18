import com.example.jetbrainstest.tests.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RiderTest extends BaseTest {
    private RiderPage RiderPage;
    @BeforeEach
    @Override
    Public void(){
        super.setUp();
        getDriver().get("https://www.jetbrains.com/idea/");
        RiderPage= new RiderPage(getDriver());
        @Test
                @DisplayName("Проверка, Что кнопка скачивания активна")
        public void buttjnCheck(){
            assertTrue(RiderPage.checkIfDownloadButtonIsClickable(), "Кнопкаскачивая не активна");
        }

}