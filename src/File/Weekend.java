package File;

import java.io.Serializable;

public class Weekend implements Serializable {
    String name;

    transient String surname; // не сериализирует, то есть не сохраняет, если пометить словом !трансиент!
}
