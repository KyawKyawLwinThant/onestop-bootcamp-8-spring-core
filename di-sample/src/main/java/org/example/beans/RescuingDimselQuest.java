package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dimsel")
public class RescuingDimselQuest implements Quest{
    public String goQuest(){
        return "Knight is going to rescue the dimsel.";
    }
}
