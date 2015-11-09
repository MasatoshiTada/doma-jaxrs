# doma-jaxrs

JAX-RS + CDI + Doma2で作ったREST Webサービスの学習用サンプルです。

Payara 4.1.1.154 + PostgreSQL 9.4で動作確認しています。

Jerseyなどには依存していないので、WildFlyでもそのまま動作します（9.0.1.Finalで確認済み）。

JDBCリソース名は"jdbc/sandbox"です。com.example.dao.config.AppConfigクラスで指定しています。

DB作成スクリプトは下記のファイルです。ご使用のDBに貼り付けてお使いください。

src/main/resources/META-INF/com/example/dao/EmployeeDao/create.script