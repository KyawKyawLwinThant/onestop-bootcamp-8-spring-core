package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dragon")
public class KillDragonQuest implements Quest{
    public String goQuest(){
        return "Knight killed the dragon.";
    }
}
