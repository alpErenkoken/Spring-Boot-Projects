package com.alperen.firstProject.objects;

import lombok.Data;

public class Response
{
    private Integer id;
    private Response response;

    public Response(int id, Response response)
    {
        this.id=id;
        this.response=response;
    }

    public Integer getId() {
        return id;
    }

    public Response getResponse() {
        return response;
    }
}
