import org.example.JsonSerializer;
import org.example.Person;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonSerializerTest {

    @Test
    void personIsSerialized(){
        Person p = new Person("Ivan", "Ivanov", LocalDate.of(1997, 11, 2));
        JSONObject json;
        try {
            json = new JsonSerializer<>(Person.class).serialize(p);
        } catch (IllegalAccessException e) {
            assert false : "IllegalAccessException";
            return;
        }
        assertEquals("Ivan", json.get("firstName"));
        assertEquals("Ivanov", json.get("lastName"));
        assertEquals("1997-11-02", json.get("birthDate"));
    }
}
