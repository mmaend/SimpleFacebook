package mmaend.Simplefb.service;

import mmaend.Simplefb.domain.Comment;
import mmaend.Simplefb.domain.User;
import mmaend.Simplefb.domain.Views;
import mmaend.Simplefb.dto.EventType;
import mmaend.Simplefb.dto.ObjectType;
import mmaend.Simplefb.repo.CommentRepo;
import mmaend.Simplefb.util.WsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;

@Service
public class CommentService {
    private final CommentRepo commentRepo;
    private final BiConsumer<EventType, Comment> wsSender;

    @Autowired
    public CommentService(CommentRepo commentRepo, WsSender wsSender) {
        this.commentRepo = commentRepo;
        this.wsSender = wsSender.getSender(ObjectType.COMMENT, Views.FullComment.class);
    }

    public Comment create(Comment comment, User user) {
        comment.setAuthor(user);
        Comment commentFromDb = commentRepo.save(comment);

        wsSender.accept(EventType.CREATE, commentFromDb);

        return commentFromDb;
    }
}