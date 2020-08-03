package org.academiadecodigo.org.felinux.scum;

import org.academiadecodigo.org.felinux.scum.operation.BiOperation;
import org.academiadecodigo.org.felinux.scum.operation.MonoOperation;

public class Scum <T, V>{

    public T performing(T arg , MonoOperation <T> monoOperation){
       return monoOperation.monoOperation(arg);
    }

    public V performing(T arg1, T arg2, BiOperation <T, V> biOperation){
     return biOperation.biOperation(arg1,arg2);
    }
}
