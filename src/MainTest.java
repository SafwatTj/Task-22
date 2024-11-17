import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    List<String> list = new ArrayList<>(List.of(
            "John",
            "Jim",
            "Jack",
            "Rick",
            "Sam"
    ));


    @Test
    void listToUpperCase() {
        List<String> expectedList = new ArrayList<>(List.of(
                "JOHN",
                "JIM",
                "JACK",
                "RICK",
                "SAM"
        ));
        List<String> actualResult = Main.stringListHandler(list, new ToUpperCaseTransformer());
        Assertions.assertIterableEquals(expectedList, actualResult);

    }

    @Test
    @DisplayName("make all elements of list surrounded by brackets")
    void allElementsOfListInBrackets() {
        List<String> expectedList = new ArrayList<>(List.of(
                "(John)",
                "(Jim)",
                "(Jack)",
                "(Rick)",
                "(Sam)"
        ));
        List<String> actualResult = Main.stringListHandler(list, new AddBracketsTransformer());
        Assertions.assertIterableEquals(expectedList, actualResult);
    }

    @Test
    @DisplayName("add to each element dollar sign")
    void addToAllElementsDollarSign() {
        List<String> expectedList = new ArrayList<>(List.of(
                "$John",
                "$Jim",
                "$Jack",
                "$Rick",
                "$Sam"
        ));
        List<String> actualResult = Main.stringListHandler(list, new AddUSDCharTransformer());
        //Assertions.assertIterableEquals(expectedList, actualResult);
    }
}
