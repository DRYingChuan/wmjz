<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh_CN">

<head>
    <meta charset="utf-8">
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
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script src="../../js/modernizr.js"></script>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        .more{height: 600px;}
        .more .more-title{height: 50px;margin: 0 -60px;background-color: #D8D8D8;}
        .more .more-title span{font-size: 24px;display: inline-block;line-height: 50px;margin-left: 30px;}
        .more ul{display: block;height: 160px;margin: 30px -90px;}
        .more ul li{width: 180px;height: 160px;float: left;list-style: none;}
        .more ul li img{width: 80px;height: 85px;float: left;list-style: none;margin-left: 48px;margin-top: 24px;}
        .more ul li span{display: inline-block;font-size: 15px;margin-top: 20px;margin-left: 58px;}
        .more ul li:hover{background-color: #D3D3D3;}
        .sort{min-height: 600px;display: none;}
        .sort .sort-title{height: 50px;margin: 0 -60px;background-color: #D8D8D8;}
        .sort .sort-title .col-sm-8 span{font-size: 24px;color:#000;display: inline-block;line-height: 50px;margin-left: 30px;}
        .sort .sort-title .col-sm-4 ul{height: 50px;}
        .sort .sort-title .col-sm-4 ul li{list-style: none;height: 50px;width: 50px;float: right;line-height: 50px;}
        .sort .sort-title .col-sm-4 ul li span{line-height: 50px;right: 15px;}
        .sort .sort-title .col-sm-4 ul li:hover{background:#CFCFCF;}
        .sort .sort-tag{height: 45px;background-color: #7A7574;margin-right: -60px;margin-left: -60px;}
        .sort .sort-tag .inav{display: block;width: 100%;height: 45px;margin-left: -30px;}
        .sort .sort-tag .inav li{display: block;text-align: center;width: 90px;height: 30px;border: 1px solid #5D5A5A;margin-top:-4px;margin-left: 10px;background-color: #7A7574;line-height: 30px;float: left;}
        .sort .sort-tag .inav li span{color: #000;font-size: 17px;}
        .sort .sort-tag .inav .imark{background-color: #625E5D;}
        .sort .sort-tag .inav li:hover{background-color: #625E5D;}
        .sort .sort-content{margin-top: 10px;margin-left: -45px;margin-right: -40px;}
        .sort .sort-content .onesort{width:100%;height: 40px;background-color: #fff;margin-top: 10px;margin-left: 10px;}
        .sort .sort-content .onesort span{line-height: 40px;font-size: 18px;color:#000;}
        .sort .sort-content .sort-check{width:10%;height:40px;float: left;margin-top: 10px;margin-left: 10px;padding-top:8px;padding-left: 8px;display: none;}
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
                <li><a href="#"><span class="glyphicon glyphicon-file">流水</span></a></li>
                <li><a href="#"><span class="glyphicon glyphicon-pencil"></span> 统计</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-star"></span>小工具</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-th-large"></span>更多</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-cog"></span>设置</a></li>
            </ul>

        </div>
        <!-- /.navbar-collapse -->
    </div>
</nav>
<!--more面板  开始-->
<div class="container symb">
    <div class="jumbotron more">
        <div class="more-title">
            <span>更多</span>
        </div>
        <div class="more-content">
            <ul>
                <li class="more-li more-trade">
                    <img src="../../image/Accounting.png" alt="账户管理">
                    <span>账户管理</span>
                </li>
                <li class="more-li more-user"><img src="../../image/Member.png" alt="用户管理">
                    <span>用户管理</span>
                </li>
                <li class="more-li more-sort"><img src="../../image/Category.png" alt="分类管理">
                    <span>分类管理</span>
                </li>
            </ul>
        </div>
    </div>
    <div class="jumbotron sort">
        <div class="sort-title">
            <div class="row">
                <div class="col-sm-8">
                    <span>分类管理</span>
                </div>
                <div class="col-sm-4">
                    <ul class="sort-onenav" style="display: block">
                        <li class="sort-onenav"><span class="glyphicon glyphicon-pencil" style="font-size:26px;color:#000;"></span>
                        </li>
                        <li data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus" style="font-size:26px;color:#000;"></span></li>

                    </ul>
                    <ul class="sort-twonav" style="display: none">
                        <li><span class="glyphicon glyphicon-remove" style="font-size:26px;color:#000;"></span>
                        </li>
                        <li data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-trash" style="font-size:26px;color:#000;"></span></li>

                    </ul>
                </div>
            </div>
        </div>

        <div class="sort-tag">
            <ul class="inav">
                <a href="">
                    <li class="imark"><span>支出</span></li>
                </a>
                <a href="">
                    <li><span>收入</span></li>
                </a>
            </ul>
        </div>

        <div class="sort-content">
            <div class="row">
             <%-- <div class="col-md-4">
                  <div class="sort-check"><input type="checkbox" id="checkbox_a2" class="chk_1" /><label for="checkbox_a2"></label></div>
                    <div class="onesort"><span>居家物业</span></div>
                </div>
                <div class="col-md-4">
                    <div class="onesort"><span>居家物业</span></div>
                </div>
                <div class="col-md-4">
                    <div class="onesort"><span>居家物业</span></div>
                </div>--%>
            </div>

            <%--<div class="row">
                <div class="col-md-4">
                    <div class="onesort"><span>居家物业</span></div>
                </div>
                <div class="col-md-4">
                    <div class="onesort"><span>居家物业</span></div>
                </div>
                <div class="col-md-4">
                    <div class="onesort"><span>居家物业</span></div>
                </div>
            </div>--%>
        </div>
    </div>

    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width:300px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        添加分类
                    </h4>
                </div>
                <div class="modal-body" style="margin-left:40px;">

                    <div class="input-group">
                        <input type="text" id="onSort" value="" class="form-control" placeholder="分类名称">
                        <br><br>
                        <input type="text" id="twoSort" value="" class="form-control" placeholder="子分类名称">
                    </div>
                </div>
                <div class="modal-footer" style="padding-right:93px;">

                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button type="button" class="btn btn-primary">
                        提交
                    </button>

                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
            <%--<div id="resultDiv"></div>--%>
        <!--more  结束-->
        <script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
        <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script>
            function moreSort() {
                $.ajax({
                    url : '${pageContext.request.contextPath}/webapp/sort/PerfectOneSorts',
                    type : 'GET',
                    dataType : 'json',
                    success : function(data){
                        var row= $(".sort-content .row").html()
                        $.each(data.perfectOneSortsList.PerfectOneSort,function (index,item) {
                            row+="<div class='sort-check'><input type='checkbox' id='checkbox_a2' class='chk_1' /><label for='checkbox_a2'>" +
                                    "</label></div><div class='col-md-4'><div class='onesort'><span>"+item.oneSortName+"</span></div></div>"
                        })
                        $(".sort-content .row").html(row);
                    }
                });

            }
            $(function(){
                $('.more-li').click(function(){
                    $('.more').toggle(300);
                    var trade=$(this).hasClass("more-trade");
                    var user=$(this).hasClass("more-user");
                    var sort=$(this).hasClass("more-sort");
                    if(sort){
                        $('.sort').toggle(300);
                      moreSort();
                    }
                    if(user){
                        $('.user').toggle(300);
                    }
                    if(trade){
                        $('.trade').toggle(300);
                    }
                })

            })
            function rest(restUrl, httpMethod, param, contenttype, datatype, callback) {
                jQuery('#resultDiv').html("Loading...");
                var request = jQuery.ajax({type : httpMethod, url : restUrl, data : param, contentType : contenttype, dataType : datatype});
                request.done(function(data) {
                    try {
                        if (data === null || data === undefined) {
                            //jQuery('#resultDiv').html("No result from server");
                        } else {
                            callback(data);
                        }
                    } catch (e) {
                        jQuery('#resultDiv').html(e);
                    }
                });
                request.fail(function(textStatus, errorThrown) {
                    jQuery('#resultDiv').html(errorThrown + " status=" + textStatus.status);
                });
            }
           function renderPut(data) {
                //$('#resultDiv').html("DONE! id=" + data.bookId);
            }
            $(function() {
                $(".btn-primary").click(function(){
                    var  url='${pageContext.request.contextPath}/webapp/sort';
                    var contentType='application/json';
                    var oneSort=$("#onSort").val();
                    var twoSort=$("#twoSort").val();
                    var sort = new Object();
                    sort.oneSortName=oneSort;
                    sort.twoSortName=twoSort;
                    var json = JSON.stringify(sort);
                   /* rest(url, 'POST', json, contentType, 'json', renderPut);*/
                    $.ajax({
                        url: url,
                        data: json,    //参数，如果没有，可以为null
                        type: "POST",     //提交方式
                        contentType: contentType,   //内容类型
                        dataType: "json",     //类型
                        //提交的页面，方法名
                        success: function () { //如果执行成功，那么执行此方法
                            $('#myModal').modal('hide');
                            $(".sort-content .row").empty();
                            moreSort();
                        },
                        error: function (err) { //如果执行不成功，那么执行此方法
                            alert("err:" + 数据错误请检测);
                        }
                    });
                });


                $('.sort-onenav').click(function(){
                    $('.sort-onenav').hide();
                    $('.sort-twonav').show(function () {
                        $('.onesort').attr("width","85%")
                        $('.sort-check').show();
                    });
                })
            });

        </script>
</body>

</html>