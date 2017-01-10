/**
 * Created by zhenyi on 1/10/17.
 */


import io.vertx.core.Vertx;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class CMPMain {

    public static void main(String[] args) {
        // Create an HTTP server which simply returns "Hello World!" to each request.
        Vertx.vertx().createHttpClient().getNow(80, "vertx.io", "", response -> {
            response.bodyHandler(System.out::println);
        });

        Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello World!")).listen(8080);
    }
}