package com.ceylanyildirim.model;

import jakarta.persistence.criteria.Root;
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

    public <T>RootEntity <T> ok(T data){
        RootEntity<T> rootEntity=new RootEntity<>();
        rootEntity.setData(data);
        rootEntity.setResult(true);
        rootEntity.setErrorMessage(null);

        return rootEntity;
    }


    public <T>RootEntity <T> error(String errorMessage){
        RootEntity<T> rootEntity=new RootEntity<>();
        rootEntity.setData(null);
        rootEntity.setResult(false);
        rootEntity.setErrorMessage(errorMessage);

        return rootEntity;
    }
}
