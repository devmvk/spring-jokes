package com.devmvk.jokes;

import com.devmvk.jokes.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(JokesApplication.class, args);

        //JokesController jokesController = (JokesController) ctx.getBean(JokesController.BEAN_CLASS_NAME);

        //System.out.println(jokesController.showJoke());
    }

}
