package text.blocks;

import org.junit.jupiter.api.Test;

public class TextBlocksTest {

    @Test
    public void methodTest() {
        String html = """
            <html>
                <head>
                    <title>Text Blocks</title>
                </head>
                <body>
                    <h1>¡Hola, mundo!</h1>
                    <p>Java 14.</p>
                </body>
            </html>
            """;
        System.out.println(html);
    }

}
