<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>完美记账软件</title>
    <!-- Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <!--你自己的样式文件 -->
    <link href="../../css/your-style.css" rel="stylesheet">
    <link rel="stylesheet" href="../../css/jquery.datetimepicker.css" type="text/css">
    <!-- 以下两个插件用于在IE8以及以下版本浏览器支持HTML5元素和媒体查询，如果不需要用可以移除 -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

        <![endif]-->
    <script src="../../js/reindex.js"></script>
    <style>
        body{background-color: #C0C0C0;font-family: Microsoft YaHei, '宋体', Tahoma, Helvetica, Arial, "\5b8b\4f53", sans-serif;}
        /*首页面板 CSS*/.container .row hr{border-top: 1px solid #C0C0C0;margin-top: 0px;margin-bottom: 0px;}
        .container .row span{text-indent: 1em;display: block;color: #C0C0C0;font-size: 17px;}
        .container .row .col-dgy{height: 70px;background-color: #FFF;margin: 5px 0px 5px 0px;}
        .container .row .col-dgy .col-sm-10{font-size: 18px;color: #000;line-height: 70px;}
        .container .row .col-dgy .col-sm-2{font-size: 18px;color: #15BA89;line-height: 70px;}
        .ijumbotron{min-height: 700px;background-color: #F0F0F0;}
        .jumbotron .circle{/*border:1px solid #00F;*/width: 150px;height: 150px;background: #6B69D6;margin: 0 auto;-moz-border-radius: 75px;-webkit-border-radius: 75px;border-radius: 75px;}
        .jumbotron .jum-top{margin-bottom: 30px;margin-top: 30px;}
        .ijumbotron .irow{margin-top: 50px;}
        .ijumbotron .irow .icol{/*border:1px solid #00F;*/width: 33.2%;height: 60px;float: left;text-align: center;}
        .ijumbotron .irow .icol .ist{color: #000;font-size: 25px;display: block;padding-top: 20px;}
        .ijumbotron .irow .icol .row{text-align: center;}
        .ijumbotron .irow .icol .row .colo-sm-11{color: #7A7A7A;font-size: 18px;}
        .ijumbotron .irow .icol .row .colo-sm-12{color: #F2726C;font-size: 15px;}
        /*定位水平div垂直居中*/
        .jumbotron .jum-top .row_div{width: 60px;height: 20px;background-color: #FFF;margin-top: 63px;margin-left: 45px;display: inline-block;/* Rotate div*/transform: rotate(90deg);-ms-transform: rotate(90deg);/* Internet Explorer*/-moz-transform: rotate(90deg);/* Firefox*/-webkit-transform: rotate(90deg);/* Safari 和 Chrome*/-o-transform: rotate(90deg);/* Opera*/}
        /*定位列div水平居中*/
        .jumbotron .jum-top .clou_div{width: 60px;height: 20px;background-color: #FFFFFF;margin-left: 45px;margin-top: -25px;}
        /*添加面板 CSS*/
        .tjumbotron{min-height: 900px;background-color: #F0F0F0;margin-top: 50px;position: relative;display: none;}
        .tjumbotron .add-itop{height:60px;background-color: #E6E6E6;margin-top: 4px;margin-right: -15px;margin-left: -15px;}
        .tjumbotron .add-itop .col-sm-8{line-height: 60px;}
        .tjumbotron .add-itop .col-sm-8 .tspan{color:#000;font-size: 25px;}
        .tjumbotron .add-body{height:65px;background-color: #7A7574;margin-right: -15px;margin-left: -15px;}
        .tjumbotron .add-body .inav{display: block;width: 100%;height: 65px;margin-left: -30px;}
        .tjumbotron .add-body .inav li{display:block;text-align:center;width:90px;height: 40px;border:1px solid #5D5A5A;margin-top:13px;margin-left:10px;background-color:#7A7574;line-height: 40px;float: left;}
        .tjumbotron .add-body .inav li span{color:#000;font-size: 17px;}
        .tjumbotron .add-body .inav .imark{background-color:#625E5D;}
        .tjumbotron .add-body .inav li:hover{background-color:#625E5D;}
        .tjumbotron .add-bout{height:680px;float: left;} 
        .tjumbotron .add-bout .row .col-md-6{width:560px;height:178px;border:1px solid #00F;margin:10px 0px 0px 15px;background: rgba(0, 0, 0, 0.4);}
        .tjumbotron .add-bout .row .col-md-12{width:1135px;height:178px;border:1px solid #000;margin:10px 0px 0px 15px;background: rgba(0, 0, 0, 0.4);}
        .tjumbotron .add-bout .row .col-fl{background-image: url(../../image/Market.jpg);background-size: 560px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-zh{background-image: url(../../image/Money.jpg);background-size: 560px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-je{background-image: url(../../image/Card.jpg);background-size: 560px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-cy{background-image: url(../../image/Family.jpg);background-size: 1135px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-sj{background-image: url(../../image/Time.jpg);background-size: 1135px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-bz{background-image: url(../../image/Description.jpg);background-size: 1135px 178px;background-repeat: no-repeat;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz{width:560px;height:178px;background: rgba(0, 0, 0, 0.6);margin-left:-15px;}
        .tjumbotron .add-bout .row .col-md-12 .col-zz12{width:1135px;height:178px;background: rgba(0, 0, 0, 0.6);margin-left:-15px;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz span{color: #FFF;font-size: 30px;}
        .tjumbotron .add-bout .row .col-md-12 .col-zz12 span{color: #FFF;font-size: 30px;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz .add-input{width: 240px;height: 40px;line-height:40px;font-size:20px;color:#c4c4c4;background: rgba(255, 255, 255, 0.3);padding-left:10px;margin:20px 0px 0px 30px;-moz-user-select: none;-webkit-user-select: none;-ms-user-select: none;-khtml-user-select: none;user-select: none;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz .add-input span{display: inline-block;height: 40px;font-size:20px;color:#c4c4c4;line-height:40px;text-indent:0;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz ul{position: relative;top:-40px;left:-10px;z-index:9999;display: none;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz ul li{list-style: none;width: 240px;height:40px;background-color:#F2F2F2;padding-left: 10px;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz ul span{display: inline-block;height: 40px;font-size:20px;color:#000;line-height:40px;text-indent:0;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz ul .mb-yc-bj{background-color:#7A7574;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz ul li:hover{background-color:#DADADA;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz .add-input img{height: 40px;line-height:40px;float: right;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz input{color:#c4c4c4; font-size:20px;width: 240px;height:45px;background: rgba(255, 255, 255, 0.3);margin:20px 0px 0px 30px;padding-left:10px;line-height: 45px;}
        .tjumbotron .add-bout .row .col-md-12 .col-zz12 input{color:#c4c4c4; font-size:20px;width: 240px;height:45px;background: rgba(255, 255, 255, 0.3);margin:20px 0px 0px 30px;padding-left:10px;line-height: 45px;}
        .tjumbotron .add-bout .row .col-md-12 .col-zz12 textarea{color:#c4c4c4; font-size:20px;background: rgba(255, 255, 255, 0.3);margin:20px 0px 0px 30px;padding-left:10px;line-height: 45px;}
        .tjumbotron .add-bout .row .col-md-12 .col-zz12 .text-jine{color:#000; font-size:20px;background: #fff;margin:20px 0px 0px 30px;padding-left:10px;line-height: 45px;}
        .tjumbotron .add-bout .row .col-md-6 .col-zz .jine{border:1px solid #fc0;background:#FFFFF7;}
        #je::-webkit-input-placeholder { /* WebKit browsers */ color:#c4c4c4; font-size:20px;} 
        #je:-moz-placeholder { /* Mozilla Firefox 4 to 18 */ color: #c4c4c4; font-size:20px;} 
        #je::-moz-placeholder { /* Mozilla Firefox 19+ */ color: #c4c4c4; font-size:20px;} 
        #je:-ms-input-placeholder { /* Internet Explorer 10+ */ color: #c4c4c4; font-size:20px;} 
        /*清除浮动代码*/
        .clearfloat:after{display: block;clear: both;content: "";visibility: hidden;height: 0}
        .clearfloat{zoom: 1}
        /*隐藏属性*/
        .dispnone{display: none;}
        .fl-tc{width:300px;height:825px;background-color: #fff;position: absolute;right:-1px;bottom:12px;display: none;}
        .fl-tc .col-i{height:40px;width: 265px;padding-left: 10px;background-color:#7A7574;margin-top: 10px;margin-left:10px;line-height: 40px;}
        .fl-tc .col-i h3{color:#F0EFEF;font-size:30px;}
        .fl-tc .col-i-yc{display: none;}
        .fl-tc .col-i-yc hr{border-top: 1px solid #C0C0C0;margin-top:10px;margin-right:25px;width:265px;display: block;height:1px;}
        .fl-tc .col-i-yc ul{width: 265px;margin-left: 10px;margin-top: -20px;}
        .fl-tc .col-i-yc ul li{width: 265px;height:45px;list-style: none;margin-left:-40px;margin-top:5px;line-height: 45px;padding-left:5px;}
        .fl-tc .col-i-yc ul li:hover{background-color:#DCDCDC;}
        .fl-tc .col-i-yc ul li span{color:#252525;font-size:23px;}
        .add-itop .col-sm-4 ul li{list-style: none;height: 60px;width: 50px;float: right;line-height: 50px;}
        .add-itop .col-sm-4 ul li:hover{list-style: none;height: 60px;width: 50px;float: right;line-height: 60px;background-color:#CFCFCF;}
        .add-itop .col-sm-4 ul li span{line-height: 60px;right: 11px;}
        .waring{display:none;width:220px;height: 40px;position: relative;bottom:850px;left:1125px;z-index: 999999;background: rgba(122,117,116,0.9);color:#fff;font-size: 15px;line-height: 40px;padding-left: 20px; }
    </style>
</head>
<body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span> 
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">首页</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-file"></span>流水</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-pencil"></span> 统计</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-star"></span>小工具</a></li>
                    <li><a href="${pageContext.request.contextPath}/webapp/sort"><span class="glyphicon glyphicon-th-large"></span>更多</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-cog"></span>设置</a></li>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
    </nav>
    <!--首页面板  开始-->
    <div class="container symb">
        <div class="jumbotron ijumbotron">
            <div class="irow clearfloat">
                <div class="icol">
                    <div class="row">
                        <div class="colo-sm-11">收入额</div>
                        <div class="colo-sm-12">￥0</div>
                    </div>
                </div>
                <div class="icol">
                    <span class="ist">11月</span>
                </div>
                <div class="icol">
                    <div class="row">
                        <div class="colo-sm-11">收入额</div>
                        <div class="colo-sm-12">￥0</div>
                    </div>
                </div>
            </div>
            <div class="jum-top">
                    <div class="circle">
                        <div class="row_div"></div>
                        <div class="clou_div"></div>
                    </div>
            </div>
            <!--row 开始-->
            <div class="row">
                <span>11-24</span>
                <hr>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
            </div>
            <!--row 结束-->
            <!--row 开始-->
            <div class="row">
                <span>11-24</span>
                <hr>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
            </div>
            <!--row 结束-->
            <!--row 开始-->
            <div class="row">
                <span>11-24</span>
                <hr>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="row col-dgy">
                        <div class="col-sm-10">
                            燃气费
                        </div>
                        <div class="col-sm-2">
                            $12
                        </div>
                    </div>
                </div>
            </div>
            <!--row 结束-->
        </div>
    </div>
    <!--首页面板  结束-->

    <!--添加面板 开始-->
    <div class="container tjumbotron">
        <div class="add-itop" autocomplete="off">
            <div class="row">
                <div class="col-sm-8">
                    <span class="tspan">记一笔</span>
                </div>
                <div class="col-sm-4">
                    <ul class="nav nav-tabs" role="tablist">
                        <li role="presentation"><span class="glyphicon glyphicon-remove" style="font-size:26px;color:#000;" ></span></li>
                        <li role="presentation"><span class="glyphicon glyphicon-file" style="font-size:26px;color:#000;"></span></li>
                        <li role="presentation"><span class="glyphicon glyphicon-plus" style="font-size:26px;color:#000;"></span></li>
                         <li role="presentation"><span class="glyphicon glyphicon-floppy-disk" style="font-size:26px;color:#000;"></span></li>
                    </ul>

                </div>
            </div>
        </div>
        <div class="add-body">
                <ul class="inav">
                    <li class="imark"><span><input type="hidden" value="1">支出</span></li>
                    <li><span><input type="hidden" value="2">支出</span></li>
                     <li><span><input type="hidden" value="3">模板</span></li>
                </ul>   
        </div>

        <div class="add-bout">
            <form id="trade">
                <div class="row">
                    <div class="col-md-6 col-fl">
                        <div class="col-zz">
                            <span clas="zz-span">分类</span>
                            <div id="sortclick" class="add-input fl">
                               点击选择分类
                            </div>
                            <input type="hidden" autocomplete="off" id="twoSortId" name="twoSortId" value="">
                        </div>
                    </div>
                    <div class="col-md-6 col-zh">
                           <div class="col-zz">
                           <span clas="zz-span">账户</span>
                          
                            <div class="add-input zh">
                               <span>现金</span>
                               <img src="../../image/input-sj.png" alt="">
                            </div>
                               <ul class="mb-yc-zh">
                                 <li class="mb-yc-bj"><span class="mb-yc-xz">现金</span></li>
                                  <li><span class="mb-yc-xz">信用卡</span></li>
                               </ul>
                           <input type="hidden" autocomplete="off" name="account" id="account" value="现金">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-je">
                           <div class="col-zz">
                                 <span clas="zz-span">金额</span>
                                 <input autocomplete="off" type="text" name="sum" value="" id="je" placeholder="0.">
                        </div>
                    </div>
                    <div class="col-md-6 col-cy">
                        <div class="col-zz">
                              <span clas="zz-span">成员</span>
                            <div class="add-input cy">
                              <span>本人</span>
                               <img src="../../image/input-sj.png" alt="">
                            </div>
                              <ul class="mb-yc-cy">
                                  <%--<li class="mb-yc-bj"><span class="mb-yc-xz">点击选择分类1</span></li>
                                   <li><span class="mb-yc-xz">点击选择分类2</span></li>
                                    <li><span class="mb-yc-xz">点击选择分类3</span></li>
                                     <li><span class="mb-yc-xz">点击选择分类4</span></li>--%>
                               </ul>
                            <input type="hidden" id="userid" name="perfactUser.userId" value="1">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 col-sj">
                           <div class="col-zz12">
                                <span clas="zz-span">时间</span>
                         <input autocomplete="off" type="text" name="executionTime" id="datetimepicker" value="">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 col-bz">
                        <div class="col-zz12">
                             <span clas="zz-span">备注</span>
                             <textarea autocomplete="off" id="tradeRemark" name="tradeRemark" cols="50" rows="2" placeholder="点击添加备注。。点击右侧图标添加单据"></textarea>
                        </div>
                       
                    </div>
                </div>
            </form>
        </div>
        <div class="fl-tc">
           <%-- <div class="col-i">
                <h3>职业收入</h3>
            </div>
             <div class="col-i-yc">
                   <hr>
                   <ul>
                       <li><span class="ces">工资收入</span></li> 
                       <li><span class="ces">利息收入</span></li>
                   </ul>     
            </div>
            <div class="col-i">
                <h3>职业收入</h3>
            </div>
             <div class="col-i-yc">
                   <hr>
                   <ul>
                       <li><span class="ces">工资收入</span></li> 
                       <li><span class="ces">利息收入</span></li>
                   </ul>     
            </div>--%>
        </div>
    </div>
    <div class="waring">
        测试
    </div>
    <%--<div class="err">
        <div>--%>
    <!--添加面板 结束-->
    <!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
   <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="../../js/jquery.datetimepicker.js"></script>

    <script>
    $(function () {
        getSort(1);
        getIndex();
    })
    $(function(){
        $(".fl").mousedown(function(){
              $(".fl-tc").toggle(300,function () {
                  getSort(1);
              });
		});
        $('#je').focus(function(){
                $(this).addClass('jine');
            }).blur(function(){
                 var v=$(this).val();
                 if(v!=""&&v.indexOf("￥")==-1){
                     var va="￥"+v;
                     $(this).val(va);
                 }
                $(this).removeClass('jine');
        });
        $(".zh").mousedown(function(){
              $(".mb-yc-zh").toggle();
		});
        $(".cy").mousedown(function(){
              getUser();
              $(".mb-yc-cy").toggle();
		});

       $('.mb-yc-xz').click(function(){
                var dan=$(this).text();
                $(this).parent().parent().prev().find("span").html(dan);
                $(this).parent().parent().toggle();
                $(".col-zh").find("input").val(dan);
        })

        $('#datetimepicker').datetimepicker();
       $('#datetimepicker').datetimepicker({value:getNowFormatDate(),step:10});

      $('#datetimepicker').datetimepicker({
             lang:'ch',
             format:'Y-m-d H:i:s'
        });



      
       $('#bz').focus(function(){
            $(this).addClass('text-jine');
            }).blur(function(){
            $(this).removeClass('text-jine');
         });
        $(".circle").click(function(){
           $(".symb").toggle(300);
           $(".tjumbotron").toggle(500);
        })


        $(".glyphicon-floppy-disk").click(function () {
            saveTrade(0);
        })
        $(".glyphicon-plus").click(function () {
            saveTrade(1);
        })
        $(".glyphicon-remove").click(function () {
            saveTrade(3);
        })
        $('.inav li').click(function () {
            $(this).siblings('li').removeClass('imark');
            $(this).addClass('imark');
        })
    })
    
       

    </script>
</body>

</html>