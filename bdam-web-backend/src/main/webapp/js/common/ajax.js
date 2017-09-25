var common_ajax = function() {
    /**
     *
     * @param url
     * @param data
     * @param dataType
     * @param callback
     */
    var ajaxFunc = function(url, data, dataType, callback){
        if(dataType == undefined || dataType == null){
            dataType = "html";
        }
        var result = "";
        $.ajax({
            type : "post",
            url : encodeURI(encodeURI(url)),
            data : data,
            dataType : dataType,
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            async: false,
            cache: false,
            success:function(data){
                result = data;
                //扩展回调函数
                if( callback != null ){
                    callback();
                }
            }
        });
        return result;
    };

    /**
     * ajax请求url替换主面板内容
     * @param url 请求地址
     * @param data 参数
     * @param callback 回调
     */
    var ajaxMainPanel = function(url, data, callback){
        var result = ajaxFunc(url, data, callback);
        $("#main-content").html(result);
    };
    return {
        ajaxFunc : ajaxFunc,
        ajaxMainPanel : ajaxMainPanel
    };
}();
