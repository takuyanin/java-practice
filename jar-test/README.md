# jarファイル作成コマンド(メモ)

### コンパイル

```
$ javac -sourcepath src -d classes src/sample/App.java
```

### 圧縮

```
$ jar cvfm sample.jar META-INF/MANIFEST.MF -C classes .
```

### jarファイルの構成の確認

```
$ jar tf sample.jar
```

### jarファイルの実行

```
$ java -jar sample.jar
```
