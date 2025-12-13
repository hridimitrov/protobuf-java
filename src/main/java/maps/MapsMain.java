package maps;

import example.maps.Maps;

import java.util.Map;

public class MapsMain {

    private static Maps.IdWrapper newIdWrapper(int id) {
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }


    public static void main(String[] args) {

        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("first_id", newIdWrapper(32))
                .putAllIds(Map.of(
                        "second_id", newIdWrapper(33),
                        "third_id", newIdWrapper(34),
                        "fourth_id", newIdWrapper(35)
                ))
                .build();

        System.out.println(message);
    }
}
