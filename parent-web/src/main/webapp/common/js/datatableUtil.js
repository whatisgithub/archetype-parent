/**
 *
 * @param param.url
 * @param param.data
 * @param param.cols
 * @param param.multSelect
 * @returns
 */
function initDatatables(param) {
    var url = param.url, data = param.data, cols = param.cols;
    var rows_selected = [], ucolumnDefs = [];

    for(var i=0;i<cols.length;i++){
        if(!cols[i]['defaultContent']){
            cols[i]['defaultContent'] = '';
        }
    }
    var dataTableObj = $('#dataTablesId').DataTable({
        "pageLength" : 25,
        "processing" : true,
        "serverSide" : true,
        "searching" : false,
        "ordering" : false,
//                "scrollX" : true,
//                "dom" : 'ftrlpi',
        "dom": 'ftr<"row"<"col-md-3"l><"col-md-5"p><"col-md-4"i>>',
        "oLanguage" : {
            sProcessing : "处理中...",
            sLengthMenu : "显示 _MENU_ 项结果",
            sZeroRecords : "没有匹配结果",
            sInfo : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
            sInfoEmpty : "显示第 0 至 0 项结果，共 0 项",
            sInfoFiltered : "(由 _MAX_ 项结果过滤)",
            sInfoPostFix : "",
            sSearch : "搜索：",
            sUrl : "",
            sEmptyTable : "表中数据为空",
            sLoadingRecords : "载入中...",
            sInfoThousands : ",",
            oPaginate : {
                sFirst : "首页",
                sPrevious : "上页",
                sNext : "下页",
                sLast : "末页"
            },
            oAria : {
                sSortAscending : ": 以升序排列此列",
                sSortDescending : ": 以降序排列此列"
            }
        },
        "ajax" : {
            "url" : url,
            "type" : "POST",
            "data" : function(d) {
                var obj = ((typeof data == undefined || data == null) ? {} : data());
                obj['pageSize'] = d.length;
                obj['startIndex'] = d.start;
                return obj;
            }
        },
        "columns" : cols,
        "rowCallback": function( row, data ) {
            if ( $.inArray(data.id, rows_selected) !== -1 ) {
                $(row).find('input[type="checkbox"]').prop('checked', true);
                $(row).addClass('selected');
            }
        },
        'columnDefs': ucolumnDefs
    });
    return dataTableObj;
}