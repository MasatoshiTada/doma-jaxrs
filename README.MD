# doma-jaxrs

JAX-RS+CDI+Doma2で作ったREST Webサービスです。

Payara 4.1.153で動作確認しています。

Payara内包のJavaDB及びそのJDBCリソースを使っていますので、アプリケーション起動前にJavaDBを起動してください。

JavaDB起動
```
<GF-HOME>/glassfish/bin/asadmin start-database
```

JavaDB停止
```
<GF-HOME>/glassfish/bin/asadmin stop-database
```