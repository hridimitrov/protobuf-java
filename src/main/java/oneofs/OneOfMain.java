package oneofs;

import example.oneofs.Oneofs;

public class OneOfMain {

    public static void main(String[] args) {

        Oneofs.Result message = Oneofs.Result.newBuilder()
                .setMessage("Hello World")
                .build();

        System.out.println("hasMessage " + message.hasMessage());
        System.out.println("hasId " + message.hasId());
        System.out.println(message);

        Oneofs.Result message2 = Oneofs.Result.newBuilder()
                .setId(42)
                .build();

        System.out.println("hasMessage " + message2.hasMessage());
        System.out.println("hasId " + message2.hasId());
        System.out.println(message2);
    }



}
