package cn.itcast.feign.Pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String address;
}