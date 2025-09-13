package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TurkishChef implements  Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt";
    }
}
