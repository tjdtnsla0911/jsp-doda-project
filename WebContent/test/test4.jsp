<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div { text-align: center; }

</style>
</head>


<%@ include file="/include/nav.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<body style="background-color: #F2FBFF;">
<br/>
<br/>
<br/>
<br/>

<div>
<c:choose>
<c:when test="${tensu.page eq 0}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>1/10</b><br/><b>仕事関連動向を抑えるために定期的に情報を収集する</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 1}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>2/10</b><br/><b>複雑な情報やデータを評価・分析する</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 2}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>3/10</b><br/><b>新しい商品・技術・仕事のやり方を考える</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 3}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>4/10</b><br/><b>最終的なゴールに向けて効果的なシナリオを描く</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 4}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>5/10</b><br/><b>課題の優先順位をつけ、具体的な実行計画を立てる</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 5}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>6/10</b><br/><b>品質基準・納期を厳守しながら、業務を確実に遂行する</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 6}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>7/10</b><br/><b>強いプレッシャーの中で、達成基準をクリアする</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 7}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>8/10</b><br/><b>日々の判断を自分で行い、その結果責任をおう</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 8}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>9/10</b><br/><b>仕事関連動向を抑えるために定期的に情報を収集する</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 9}">
<img alt="" src="/doda/image/dodayubi.png" width="960">
<div>
<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>10/10</b><br/><b>予期しない状況の変化に直面しても臨機応変に対応する</b>
<br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="test1(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton7.png"></a>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" onclick="test2(${sessionScope.tensu.ok},${sessionScope.tensu.sum},${sessionScope.tensu.page},${sessionScope.tensu.prs})"><img alt="" src="/doda/image/okbutton6.png"></a>
</div>
</c:when>
<c:when test="${tensu.page eq 10 && tensu.sum >=0 && tensu.sum <= 30}">


<h2><b>結果発表</b></h2><br/><br/>
<b>あなたの職業点数は</b><p style="color: blue; font-size: 20px;"><b>${sessionScope.tensu.sum}点</b>です!</p><br/>
<pre>
<b>
皆さん、こんにちは。小生は、ノルウェイに有る世界遺産について発表致したいと

思います。

ピオールに対しては皆さんもよくご存じだと思われますが、ピオールとは、山脈の

渓谷に雪が積もっては堆積しては重力に依り移動する河川になるのですが、この状態を

氷河と呼ぶようになります。この氷河が重力に依り渓谷に沿って移動すると、地表の

斜面が削られてUの字型の渓谷が形成されるのですが、後日海水面が上昇するにつれて

海水が入り込み、過去氷河が流れていた渓谷を埋めるようになると、狭くて長い峡湾が

生成されるのです。

＂内陸に深く食い込んだ湾＂と云う意味でノルウェイ語で＂パオルと呼ぶのです。

ノルウェイの南西部べルゲンの北東部から120キロ程離れている＂エイランエルと

ネレイピオルは、南方のスタバンエルからオンダルスネス迄北東へ５００ｋｍ迄に

拡がるノルウェイの西部ピオール風景の一部を形成して、この風景は、世界でも一番

長くて深い、最も美しい景観としてもピオールはよく知られております。

エイランエルピエルは、大きくて広く拡がっている様子が印象的だとすれば、逆に

ネレイパオルは世界で最も幅の狭いパオールで有名であります。

この優れた景観を見るため沢山の展望台が設けられていますが、一般的に最も代表的

方法は、船にのって移動しながら直接パオールの上で気色を見るのですが、普通は

自動車でパオール迄移動するので、このような乗客と車両を運搬するフェーリが

運営されております。

フェーリとは、船のことです。パオール迄行き来するフェーリは、夏場は5月から

10月までのみ運営し、一日少ないときには4～8回ほど運行されますが、夏場のみに

運行されるのは、冬には雪が積もりパオールへ行き来する道路が閉鎖されるので

運営されないとのことです。

以外にも地域を移動しながら旅行をするクルース船も余程見付かります。

エイランエルパオールとネレイピオール地域は、地球上で最も景観が優れている

ピオール地域を指折る事ができますが、この地域の優れた自然美はノルウエー海

から１400メートルまで聳えており、海水面下500メートルも伸びた、狭くて

険しい、水晶の様に美しい岩壁から出てきます。

自由自在に流れる川が、落葉、闊葉樹林や針葉樹林を通じてでこぼこ山脈まで

昇る間にパオールの透明な壁に沿って、数多くの瀑布が落下する壮観を成します。

このような風景でユネスコ世界遺産搭載基準を二つを持つようになりました。

基準（vii)と、基準（viii)を受けました。最高の自然現象と重要性（vii)を受け、

地質学的重要研究資料や、地理学的側面の重要特性を含み、地球の歴史上重要段階を

立証する代表的事例として選ばれ,viii を受ける迄にいたりました。又、パオル

周辺のノルウェイの色色な文化の足跡が残され、歴史上の価値や関心を引き集める

文化的観光地としても高く名乗る大変優れた所であります。
</b>
</pre>
</c:when>
<c:when test="${tensu.page eq 10 && tensu.sum >=31 && tensu.sum <= 59}">


<h2><b>結果発表</b></h2><br/><br/>
<b>あなたの職業点数は</b><p style="color: blue; font-size: 20px;"><b>${sessionScope.tensu.sum}点</b>です!</p><br/>
<b>
<pre>
特に訓練兵に化生放ということをすることとなるが、ガス室で数分間本当に持ちこたえるのが一番記憶に残りますね。

そして訓練兵が終わったら身体等級とランダムに自分が行く部隊が決まります。

この時が一番緊張される瞬間です。

私もずっとお祈りをしましたが、結局、神は私を捨てました。

韓国軍隊は陸軍、海軍、空軍、特殊部隊に分けられています。

以上は陸軍に志願したところは韓国で、ソウル、京畿道地域でよく行く訓練所なのに。

ここは普通韓国全域に広がるようになりますが、普通、北朝鮮とつながっているところに配置されることになります。

一応、北朝鮮と近いから緊張感がひどいですよね?2番目のこの地域はすごく寒いです。

私がいた所じゃないけど聞いてみると冬には零下30~40度まで行くと言いますね。

以上の風邪に気をつけてください

私がいたところを簡略に紹介すると私は特殊部隊で2年間生活しました

うん。別に特別なことがあったらパラシュートを使ったりもして訓練が多いというぐらい?

そしてダイエットするには最高だと思います。以上もここにいったらいいですね。。

そして2年後にまた会おうねます..あ..見ないよね...私たちは卒業だったでしょうね。こんにちは
</pre>
</b>
</c:when>
<c:when test="${tensu.page eq 10 && tensu.sum >=60 && tensu.sum <= 79}">


<h2><b>結果発表</b></h2><br/><br/>
<b>あなたの職業点数は</b><p style="color: blue; font-size: 20px;"><b>${sessionScope.tensu.sum}点</b>です!</p><br/>
<b>
<pre>
皆さん、こんにちは。小生は、ノルウェイに有る世界遺産について発表致したいと

思います。

ピオールに対しては皆さんもよくご存じだと思われますが、ピオールとは、山脈の

渓谷に雪が積もっては堆積しては重力に依り移動する河川になるのですが、この状態を

氷河と呼ぶようになります。この氷河が重力に依り渓谷に沿って移動すると、地表の

斜面が削られてUの字型の渓谷が形成されるのですが、後日海水面が上昇するにつれて

海水が入り込み、過去氷河が流れていた渓谷を埋めるようになると、狭くて長い峡湾が

生成されるのです。

＂内陸に深く食い込んだ湾＂と云う意味でノルウェイ語で＂パオルと呼ぶのです。

ノルウェイの南西部べルゲンの北東部から120キロ程離れている＂エイランエルと

ネレイピオルは、南方のスタバンエルからオンダルスネス迄北東へ５００ｋｍ迄に

拡がるノルウェイの西部ピオール風景の一部を形成して、この風景は、世界でも一番

長くて深い、最も美しい景観としてもピオールはよく知られております。

エイランエルピエルは、大きくて広く拡がっている様子が印象的だとすれば、逆に

ネレイパオルは世界で最も幅の狭いパオールで有名であります。

この優れた景観を見るため沢山の展望台が設けられていますが、一般的に最も代表的

方法は、船にのって移動しながら直接パオールの上で気色を見るのですが、普通は

自動車でパオール迄移動するので、このような乗客と車両を運搬するフェーリが

運営されております。

フェーリとは、船のことです。パオール迄行き来するフェーリは、夏場は5月から

10月までのみ運営し、一日少ないときには4～8回ほど運行されますが、夏場のみに

運行されるのは、冬には雪が積もりパオールへ行き来する道路が閉鎖されるので

運営されないとのことです。

以外にも地域を移動しながら旅行をするクルース船も余程見付かります。

エイランエルパオールとネレイピオール地域は、地球上で最も景観が優れている

ピオール地域を指折る事ができますが、この地域の優れた自然美はノルウエー海

から１400メートルまで聳えており、海水面下500メートルも伸びた、狭くて

険しい、水晶の様に美しい岩壁から出てきます。

自由自在に流れる川が、落葉、闊葉樹林や針葉樹林を通じてでこぼこ山脈まで

昇る間にパオールの透明な壁に沿って、数多くの瀑布が落下する壮観を成します。

このような風景でユネスコ世界遺産搭載基準を二つを持つようになりました。

基準（vii)と、基準（viii)を受けました。最高の自然現象と重要性（vii)を受け、

地質学的重要研究資料や、地理学的側面の重要特性を含み、地球の歴史上重要段階を

立証する代表的事例として選ばれ,viii を受ける迄にいたりました。又、パオル

周辺のノルウェイの色色な文化の足跡が残され、歴史上の価値や関心を引き集める

文化的観光地としても高く名乗る大変優れた所であります。
</pre>
</b>
</c:when>
<c:when test="${tensu.page eq 10 && tensu.sum >=80}">


<h2><b>結果発表</b></h2><br/><br/>
<b>あなたの職業点数は</b><p style="color: blue; font-size: 20px;"><b>${sessionScope.tensu.sum}点</b>です!</p><br/>
<b>
<pre>
日本ってさ、なぁんか「限定品」多いんですよね。

私はその中でもっとも、食べ物の「限定」に弱くて。
飲み物も水飲まなきゃいけないレコーディングの前とかに
いつも紅茶の季節限定の味選んだりして結局喉乾かすんですよ。
キットカットなんかは四季節色んな味が出てるからつい買ってしまう。

「うん。そうだよね、きっと。きっとカット！」

なんてクダンナイだじゃれをよく台詞に使いながら。んん、すみま
へん。（’ー’；）汗
ん、周りは「ユンナも、まぁ。。。外人だからな」って思って
許してくれるらしいけど。


とにかく、今回は「大学いも」のキットカット買ってしまいました。
私、コンビニでどんだっけ騒いだか。バカな。

「うあああ、これ期間限定なんだ！すごい！季節限定でもない、期
間限定なんて！めずらしぃ！箱とっとかなきゃ！！」
</pre>
</b>
</c:when>
</c:choose>
</div>

</body>

<script src="/doda/js/reply.js"></script>
</html>