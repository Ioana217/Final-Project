package LibraryShop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Books {

        private String name;
        private String author;
        private int id;
        private String date;
}
