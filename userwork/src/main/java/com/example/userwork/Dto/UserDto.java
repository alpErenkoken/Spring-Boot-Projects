package com.example.userwork.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private int id;
    private String name;

    public UserDto(Builder builder)
    {
        this.id=builder.id;
        this.name=builder.name;
    }

    public static class Builder
    {

        private int id;
        private String name;

        Builder(){}
        public  Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public  Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public  UserDto build()
        {
            return new UserDto(this);
        }

    }

}
