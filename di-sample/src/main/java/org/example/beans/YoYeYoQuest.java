package org.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("yoyeyo")
public class YoYeYoQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight sings 'YoYeYo' happily.";
    }
}
