package hwMovie;

import Framework.Elem;
import org.openqa.selenium.WebDriver;

public class MovieCardPage {
    private Elem titleCSS = new Elem("[data-testid=hero-title-block__title]");
    private Elem yearCSS = new Elem("span.itZqyK");
    private Elem ratingCSS = new Elem("[data-testid=hero-rating-bar__aggregate-rating__score] span:nth-child(1)");


    private WebDriver driver;

    public MovieCardPage(WebDriver driver) {
        this.driver = driver;
    }

    public Movie getCardInfo(int randValue){
        Movie movieCard = new Movie(
                titleCSS.getText(),
                Double.parseDouble(ratingCSS.getAttribute(2,"innerHTML")),
                randValue,
                Integer.parseInt(yearCSS.getAttribute(2,"innerHTML")));
        return movieCard;
        }
    }



