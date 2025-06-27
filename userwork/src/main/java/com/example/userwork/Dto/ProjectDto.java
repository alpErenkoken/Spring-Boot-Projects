package com.example.userwork.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto
{
    private int id;
    private String name;

    public ProjectDto(Builder builder)
    {
        this.id=builder.id;
        this.name=builder.name;
    }

    public static class Builder
    {

        private int id;
        private String name;

        Builder(){}
        public ProjectDto.Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public ProjectDto.Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public  ProjectDto build()
        {
            return new ProjectDto(this);
        }

    }


}
