package fop.evgeniy.dmitriev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myCoach")
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostConstruct
    public void invokePostConstructMethod() {
        System.out.println("TennisCoach bean is constructed an dependencies are injected");
    }

    @PreDestroy
    public void invokePreDestroyMethod() {
        System.out.println("TennisCoach bean is DESTROYED due to context close");
    }

    @Override
    public String doWorkout() {
        return "Take a raquet and do ur job!!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
