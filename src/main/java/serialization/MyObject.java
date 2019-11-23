package serialization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class MyObject {

    private String name;
    private int[] numbers;
    private long haLong;
    private ToSerialize[] serializes;

}
