package sample.simple;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    // 環境テスト
    public static void main(String[] args)throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
