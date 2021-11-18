package com.example.jpa.model;

import javax.persistence.*;
/*import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.jpa.controller.PostController;


@Entity
@Table(name = "posts2021")
/* { "title":"J2","description":"JPA","content":"JPANotes"} */
public class Post {
	private static final Logger logger = LoggerFactory.getLogger(Post.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 
    private String title;

  
    private String description;

 //  @NotNull
    private String content;

    public Long getId() {  //info , warn, error, debug, trace , fatal 
    	logger.info(" entity created ===================");
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
