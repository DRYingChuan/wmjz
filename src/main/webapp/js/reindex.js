var urlIndex='/webapp/index';
var urlUser='/webapp/user/';
var urlSort='/webapp/sort/';
var urlTrade="/webapp/trade/"
var err=new Object();
var jsons=null;
var contentTypeJson='application/json';
/*
* restUrl url 数据地址
* httpMethod 访问类型 GET|PSOT|PUT|DELETE
* param 数据
* contenttype Content-Type 类型
* datatype 数据交互类型
* callback 回调函数
* */
function rest(restUrl, httpMethod, param, contenttype, datatype, callback) {
    var request=$.ajax({url:restUrl,type:httpMethod,data:param,contentType:contenttype,dataType:datatype});
    request.done(function (data) {
        try {
            if (data === null || data === undefined) {
                err.type=1;
                err.NULL="null";
                err.undefined="undefiled";
                jsons = JSON.stringify(err);
                errMode(jsons);
            } else {
                callback(data);
            }
        }catch (e){
            err.e=e;
            err.type=3;
            errMode(e);
        }
    })

    request.fail(function(textStatus, errorThrown) {
        err.type=4;
        err.textStatus=textStatus.status;
        err.errorThrown=errorThrown;
        jsons = JSON.stringify(err);
        errMode(jsons)
    })
}

/*
* 错误处理MODE
* type 1 返回成功 但是data 为空 2 返回成功 数据正常 3  错误 4，拒绝执行回调函数
* */
function errMode(data) {
    alert(data)
   /* $('#example').modal('show')
    $("#example").on("show.bs.modal",function () {
        alert(1)
    })*/
}

function getIndex() {
    //月份
    var maoth=getMoth();
    //设置月份
    $('.ist').html(maoth+"月")
    rest(urlTrade+"PerfectTrades?maoth="+maoth,"GET",null,null,"json",renderGetTradetAll);
}
//GET sort
function getSort(incaexp) {
    rest(urlSort+"PerfectOneSorts?incaexp="+incaexp,"GET",null,null,"json",renderGetSortAll);
}

function getUser() {
    rest(urlUser+"PerfectUsers","GET",null,null,"json",renderGetUsertAll)
}
var saveAaddPd;
function saveTrade(index) {
    //判断保存类型
    saveAaddPd=index;
    //如果是index 直接返回首页
    if(index==3){
        publisherTradeValue();
        return;
    }


    var trade=new Object();
    var twoSortId=$('#twoSortId').val();
    var sum=$('#je').val();
    var userid=$('#userid').val();
    var executionTime=$('#datetimepicker').val();
    var tradeRemark=$('#tradeRemark').val();
    var account=$("#account").val();
    var incaexp=$('.imark').find("input").val();
    if(twoSortId==null||twoSortId==""){
        $('.waring').html("分类不能为空").show(300).delay(3000).hide(300);
        return;
    }

    if(sum==null||sum==""){
        $('.waring').html("金额不能为空").show(300).delay(3000).hide(300);
        return;
    }

    sum= sum.substring(1,sum.length);
    trade.twoSortId=twoSortId;
    trade.sum=sum*100;
    trade.userId=userid;
    trade.executionTime=executionTime;
    trade.tradeRemark=tradeRemark;
    trade.account=account;
    trade.incAexp=incaexp;
    var data=JSON.stringify(trade);
    rest(urlTrade,"POST",data,contentTypeJson,"json",publisherTradeValue)
}
/*function get() {
    
}*/
//分类函数回调
function renderGetSortAll(data) {
    var Sorthtml=$(".fl-tc").html();
  $.each(data.perfectOneSortsList.PerfectOneSort,function (index,item) {
      Sorthtml+="<div class='col-i'><h3>"+item.oneSortName+"</h3></div>"
      Sorthtml+="<div class='col-i-yc'><hr><ul>"
      $.each(item.perfectTwoSort.PerfectTwoSort,function (indexs,items){
          Sorthtml+="<li><span class='ces'><input type='hidden' value='"+items.twosortid+"'>"+items.twoSortName+"</span></li>"
      })
     Sorthtml+="</ul> </div>";
  })
    $(".fl-tc").html(Sorthtml);
    //绑定未来事件
    $('.col-i').on('click',function () {
        $(".col-i-yc").toggle(300);
    })
    $('.ces').click('click',function () {
        var dan=$(this).text();
        var sj=$(this).parent().parent().parent().prev().find("h3").text();

        var fl=sj+"-->"+dan;
        $(".fl").html(fl);
        $(".fl-tc").toggle(300);
        var input=$(this).find("input").val();
        $("#twoSortId").val(input);
        $(".fl-tc").empty();
    });
}

function renderGetUsertAll(data) {
    var userHtml=$('.mb-yc-cy').html();
    $.each(data.perfectUser,function (index,item) {
        if(index==0){
            userHtml+="<li class='mb-yc-bj'><span class='mb-yc-xz'>"+item.userName+"</span></li>"
        }else{
            userHtml+="<li><span class='mb-yc-xz'><input value='"+item.userid+"' type='hidden'>"+item.userName+"</span></li>"
        }

    })

    $('.mb-yc-cy').html(userHtml);
   $('.mb-yc-xz').on('click',function () {
       var dan=$(this).text();
       $(this).parent().parent().prev().find("span").html(dan);
       $(this).parent().parent().toggle();
       var input=$(this).find("input").val();
       $('#userid').val(input);
       $(".mb-yc-cy").empty();
   })

}
//添加成功的回调函数
function publisherTradeValue(data) {
    if(saveAaddPd==0||saveAaddPd==3){
        $(".symb").toggle(300);
        $(".tjumbotron").toggle(500);
    }
    if(saveAaddPd==1){
        $('.waring').html("数据添加成功").show(300).delay(3000).hide(300);
    }
    $('#twoSortId').val("");
    $('#je').val("");
    $('#userid').val("1");
    $('.cy span').html("本人");
    $("#sortclick").html("点击选择分类")
    $('#datetimepicker').val(getNowFormatDate());
    $('#tradeRemark').val("");
    $("#account").val("现金");
    $('.zh span').html("现金");
}
function renderGetTradetAll() {
    
}
//产生月份
function getMoth() {
    var date = new Date();
    var month = date.getMonth() + 1;
    return month;
}
//生成时间
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + date.getHours() + seperator2 + date.getMinutes()
        + seperator2 + date.getSeconds();
    return currentdate;
}
