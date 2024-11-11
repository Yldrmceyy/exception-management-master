package com.ceylanyildirim.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {
    private  boolean result;
    private String errorMessage;
    private  T data;
}
