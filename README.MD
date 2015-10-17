# doma-jaxrs

JAX-RS+CDI+Doma2で作ったREST Webサービスの学習用サンプルです。

Payara 4.1.153+MySQL 5.6.で動作確認しています。

Jerseyなどには依存していないので、WildFlyでも動くと思います（未確認）。

JDBCリソース名は"jdbc/sandbox"です。com.example.dao.config.AppConfigクラスで指定しています。

DB作成スクリプトは下記のファイルです。ご使用のDBに貼り付けてお使いください。

src/main/resources/META-INF/com/example/dao/EmployeeDao/create.script