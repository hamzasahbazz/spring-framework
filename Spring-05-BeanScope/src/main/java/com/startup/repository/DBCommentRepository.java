package com.startup.repository;

import com.startup.model.*;
import org.springframework.stereotype.*;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in DB : " + comment.getText());
    }
}
