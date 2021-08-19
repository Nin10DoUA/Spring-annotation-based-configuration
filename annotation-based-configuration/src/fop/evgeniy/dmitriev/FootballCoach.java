package fop.evgeniy.dmitriev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach() {
    }

    @Override
    public String doWorkout() {
        return "Jog the football ball";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
