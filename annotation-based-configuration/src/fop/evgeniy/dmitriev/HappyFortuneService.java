package fop.evgeniy.dmitriev;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "My happy fortune!";
    }
}
