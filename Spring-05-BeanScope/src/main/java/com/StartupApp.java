package com;

import com.startup.config.*;
import com.startup.model.*;
import com.startup.service.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class StartupApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //By default SPring use singleton Bean scope
        CommentService commentService = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);

        System.out.println(commentService);
        System.out.println(commentService2);

        //with default Singleton Bean scope below statement will be true
        //Whenever @Scope("prototype") added in CommentService class then result will be false
        //because with @Scope annotation Spring create new object for each call
        System.out.println(commentService2==commentService);
    }
}
