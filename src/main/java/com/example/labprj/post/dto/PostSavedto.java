package com.example.labprj.post.dto;

import com.example.labprj.post.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@Getter
@NoArgsConstructor
public class PostSavedto {


    private String title;
    private String content;
    private String state;
    private int price;
    private Date creDate;
    private String imgUrl;
    public Post toEntity(){
        return Post.builder()
                .title(title)
                .content(content)
                .state(state)
                .price(price)
                .creDate(creDate)
                .imgUrl(imgUrl)
                .build();
    }
}
