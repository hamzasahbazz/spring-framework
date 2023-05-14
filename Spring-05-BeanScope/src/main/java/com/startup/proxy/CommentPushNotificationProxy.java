package com.startup.proxy;

import com.startup.model.*;
import org.springframework.stereotype.*;

@Component
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment : " + comment.getText());
    }
}
