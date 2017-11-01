package io.pivotal.pal.tracker;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    String hello ;



       public WelcomeController (@Value("${WELCOME_MESSAGE}") String str){
            hello = str;
        }

        @GetMapping("/")
        public String sayHello() {




        return this.hello;
    }
}
