package com.example.userwork.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProjectDto
{

    private int userId;
    private int projectId;

    public UserProjectDto(Builder builder) {
        this.userId = builder.userId;
        this.projectId =builder.projectId;
    }

    public static class Builder
    {

        private int userId;
        private int projectId;

        Builder(){}
        public UserProjectDto.Builder userId(int userId)
        {
            this.userId = userId;
            return this;
        }

        public UserProjectDto.Builder projectId(int projectId)
        {
            this.projectId = projectId;
            return this;
        }

        public  UserProjectDto build()
        {
            return new UserProjectDto(this);
        }

    }
}
