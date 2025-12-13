package options;

import com.example.options.AnotherDummy;

public class OptionsMain {

    public static void main(String[] args) {

        /*
          When having the multiple classes option enabled we can access
          the class directly without going through the outer class
         */
        AnotherDummy message = AnotherDummy.newBuilder().build();
    }
}
