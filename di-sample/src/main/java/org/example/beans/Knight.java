package org.example.beans;

import org.example.annotation.QuestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import static org.example.annotation.QuestType.Type.*;

@Component
public class Knight {
    @Autowired @QuestType(YoYeYo)
    private Quest quest;



//    public void setQuest(Quest quest) {
//        this.quest = quest;
//    }

    public String goQuest(){
        return quest.goQuest();
    }
}
