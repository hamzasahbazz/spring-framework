package com.startup.service;

import com.startup.model.*;
import com.startup.proxy.*;
import com.startup.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    //if class has only one constructor then no need to put @Autowired annotation explicitly
    public CommentService(CommentRepository commentRepository,@Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
