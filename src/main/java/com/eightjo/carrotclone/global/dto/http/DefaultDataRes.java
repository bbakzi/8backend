package com.eightjo.carrotclone.global.dto.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefaultDataRes<T> extends DefaultRes<T> {

    private T data;


    public DefaultDataRes(String responseMessage, T data) {
        super(responseMessage);
        this.data = data;
    }
}
