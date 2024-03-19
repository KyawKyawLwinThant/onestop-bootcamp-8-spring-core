package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @QuestType(QuestType.Type.Dimsel)
public class RescuingDimselQuest implements Quest{
    public String goQuest(){
        return "Knight is going to rescue the dimsel.";
    }
}
