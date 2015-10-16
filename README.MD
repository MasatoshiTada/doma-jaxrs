# doma-jaxrs

JAX-RS+CDI+Doma2で作ったREST Webサービスです。

Payara 4.1.153で動作確認しています。

JDBCリソース名は"jdbc/sandbox"です。com.example.dao.config.AppConfigクラスで指定しています。

DB作成スクリプトは下記のファイルです。ご使用のDBに貼り付けてお使いください。

src/main/resources/META-INF/com/example/dao/EmployeeDao/create.script