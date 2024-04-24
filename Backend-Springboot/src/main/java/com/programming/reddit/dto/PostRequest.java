package com.programming.reddit.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private Long postId;
    private String subredditName;
    private String url;
    @NotBlank(message = "Post name cannot be empty or null")
    private String postName;
    private String description;
}
