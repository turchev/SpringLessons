package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        /*  Without using a spring

        SedanProductionLine sedanPL = new SedanProductionLine();
        HatchBackProductionLine hatchBackPL = new HatchBackProductionLine();


        AutoFactory autoFactory = new AutoFactory(5, sedanPL);
        AutoFactory autoFactory1 = new AutoFactory(3, hatchBackPL);

        autoFactory.run();
        autoFactory1.run();

         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory sedanAutoFactory = (AutoFactory) context.getBean("sedan_AutoFactory");
        AutoFactory hatchBackAutoFactory = (AutoFactory) context.getBean("hatch_back_AutoFactory");

        sedanAutoFactory.run();
        hatchBackAutoFactory.run();

        System.out.println(context.getBeanDefinitionCount());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

    }

}
