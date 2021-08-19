package fop.evgeniy.dmitriev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.doWorkout());
        System.out.println(coach.getFortune());

        Coach coach2 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach2.doWorkout());
        System.out.println(coach2.getFortune());





        context.close();
    }
}
