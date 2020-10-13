// Basic showcase of java spark framework use from preexisting examples online
// Author: Matthew Rutter
// Date: 10/12/2020

import static spark.Spark.*;

public class HelloSpark {

    public static void main(String[] args) {

        // Use basic get request to respond to user with funny response
        get("/", (req, res) -> "This isn't Node! This is Spark! Java has nothing to do with Javascript! Did your bootcamp teach you anything?");

    }

}