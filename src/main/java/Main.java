import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            response.redirect("/index.html");
            return null;
        });
        get("/quotes", (request, response) -> {
            response.type("application/json");
            return "{\n" +
                    "  \"quotes\": [\n" +
                    "    {\n" +
                    "      \"quote\" : \"We build our computer (systems) the way we build our cities: over time, without a plan, on top of ruins.\"\n" +
                    "      \"name\" : \"-Ellen Ullman-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"What one programmer can do in one month, two programmers can do in two months.\"\n" +
                    "      \"name\" : \"-Fred Brooks-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"Every great developer you know got there by solving problems they were unqualified to solve until they actually did it.\"\n" +
                    "      \"name\" : \"-Patrick McKenzie-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"A primary cause of complexity is that software vendors uncritically adopt almost any feature that users want.\"\n" +
                    "      \"name\" : \"-Niklaus Wirth-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"No one in the brief history of computing has ever written a piece of perfect software. It's unlikely that you'll be the first.\"\n" +
                    "      \"name\" : \"-Andy Hunt-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"Java is to JavaScript as ham is to hamster.\"\n" +
                    "      \"name\" : \"-Jeremy Keith-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"One of the best programming skills you can have is knowing when to walk away for awhile\"\n" +
                    "      \"name\" : \"-Oscar Godson-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"One of the best programming skills you can have is knowing when to walk away for awhile\"\n" +
                    "      \"name\" : \"-Louis Srygley-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"A program is never less than 90% complete, and never more than 95% complete\"\n" +
                    "      \"name\" : \"-Terry Baker-\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"quote\" : \"Programming languages, like pizzas, come in only too sizes; too big and too small.\"\n" +
                    "      \"name\" : \"-Richard E. Pattis-\"\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";
        });
    }
}
