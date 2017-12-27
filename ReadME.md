JasperBoot
==============

This Program make PDF View Form JRXML template.
This is Spring Boot Program.
So, execute any where and nothing Servlet Container.

##　How to execute.
1. Git Clone to STS(Spring Tools Suite)
2. build it and run on STS.
3. Access http://localhost:8080/
4. show index.html and click link.
5. show PDF.

##　Font Extensions
This program include font extensions.
I set Japanese font,IPAex Mincho (Serif) and IPAex Gothic (SanSerif).
So, This Make PDF file include Japanese Font.

## Any JRXML template make PDF
For example
1. japan.jrxml file add to src/main/resouces/jasperreports  
2. build and run
3. browser access to http://localhost:8080/japan 
4. view PDF from japan.jrxml

## Prarameter?
Unn....

JasperBoot 日本語
===========
JRXML TemplateからPDFを表示するためのプログラム。
Spring Bootで出来てます。
サーブレットコンテナなしでどこでも実行可能です。

##　起動方法 
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

##　どんなJRXMLファイルにも対応
1. src/main/resouces/jasperreportsに jrxmlファイルを作成して入れます。
   例えばjapan.jrxmlとしましょう。
2. build and run
3. http://localhost:8080/japan とアクセス
4. japan.jrxmlをPDFとして表示してくれます。

## License
Apache License 2.0

Sample Program なのでご自由にお使い下さい。



