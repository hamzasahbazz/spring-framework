package com.startup;

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

        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}
