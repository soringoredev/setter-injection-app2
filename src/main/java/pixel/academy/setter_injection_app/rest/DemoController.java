package pixel.academy.setter_injection_app.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection_app.common.Chef;


@RestController
public class DemoController {

    private Chef myChef;

    //constructor
    //@Autowired
    //public DemoController(Chef theChef) {
    //        myChef = theChef;
    //    }

    @Autowired
    public void setMyChef(Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}

