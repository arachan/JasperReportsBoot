JasperBoot 日本語
===========
JRXML TemplateからPDFを表示するためのプログラム。
Spring Bootで出来てます。
サーブレットコンテナなしでどこでも実行可能です。

## 起動方法 

1. STSにGit Clone
2. STS上でBuild and Run.
3. ブラウザーで http://localhost:8080/ にアクセス
4. index.htmlが現れるのでそこのリンクをクリック。
5. PDFが表示されます。

## Font extensions

このプログラムはFont Extensionsが含まれています。
日本語フォント、IPAex明朝とIPAexゴシックをセットしております。
Font名は　IPAex明朝: ipaexm IPAexゴシックは ipaexg としています。
 
これにより日本語のフォントを埋め込んだPDFファイルを表示作成することができます。

## どんなJRXMLファイルにも対応

1. src/main/resouces/jasperreportsに jrxmlファイルを作成して入れます。
   例えばtest.jrxmlとしましょう。
2. build and run
3. http://localhost:8080/pdf/test とアクセス
4. test.jrxmlをPDFとして表示してくれます。
