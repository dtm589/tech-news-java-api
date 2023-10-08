package repository;

import model.Comment;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
    List<Comment> findAllCommentsByPostId(int postId) throws Exception;
}
