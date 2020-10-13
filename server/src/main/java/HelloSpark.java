import static spark.Spark.*;

public class HelloSpark {
    public static void main(String[] args) {
        get("/", (req, res) -> "This isn't Node! This is Spark! Java has nothing to do with Javascript! Did your bootcamp teach you anything?");
    }
}