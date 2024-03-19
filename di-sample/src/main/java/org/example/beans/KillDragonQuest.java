package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @QuestType(QuestType.Type.Dragon)
public class KillDragonQuest implements Quest{
    public String goQuest(){
        return "Knight killed the dragon.";
    }
}
