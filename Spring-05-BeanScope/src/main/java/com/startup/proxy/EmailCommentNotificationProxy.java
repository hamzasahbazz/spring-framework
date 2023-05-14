package com.startup.proxy;

import com.startup.model.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Component
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : " + comment.getText());
    }
}
