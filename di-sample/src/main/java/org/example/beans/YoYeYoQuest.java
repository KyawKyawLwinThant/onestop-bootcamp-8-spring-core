package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @QuestType(QuestType.Type.YoYeYo)
public class YoYeYoQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight sings 'YoYeYo' happily.";
    }
}
