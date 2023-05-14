package com.startup.proxy;

import com.startup.model.*;
import org.springframework.stereotype.*;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : " + comment.getText());
    }
}
