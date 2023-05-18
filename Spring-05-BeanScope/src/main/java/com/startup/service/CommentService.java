package com.startup.service;

import com.startup.model.*;
import com.startup.proxy.*;
import com.startup.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.config.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;

@Component
//Whenever somebody requested bean for CommentService, Spring will create
//separate bean in the container
//@Scope("prototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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
