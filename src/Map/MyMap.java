package Map;

import java.util.*;

public class MyMap<S,R> {
    private final List<S> key;
    private final List<R> value;

    public MyMap() {
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
    }
    public void put(S key, R value){
        if(!this.key.contains(key)){
            this.key.add(key);
            this.value.add(value);
        }else{
            this.value.set(this.key.indexOf(key), value);
        }
    }
    public R get(S key){
        if(this.key.contains(key)){
            return this.value.get(this.key.indexOf(key));
        }else{
            return null;
        }
    }
    public R remove(S key){
        if(this.key.contains(key)){
            R temp = this.value.get(this.key.indexOf(key));
            this.value.remove(this.key.indexOf(key));
            this.key.remove(key);
            return temp;
        }else{
            return null;
        }
    }
}
