package serialization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Response {

    private int userId;
    private int id;
    private String title;
    private boolean completed;



}
