import java.util.*;

public class Set {
    public static void main(String[] args) {

    }
    
    class ImmutalbeSet{

        private final HashSet<String> set;

        ImmutalbeSet(){
            this.set = new HashSet<>();    
        }

        public void add(String s){
            set.add(s);
        }
    }
}
