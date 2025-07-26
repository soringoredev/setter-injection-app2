package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Lulea kebab";
    }
}
