
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/jspHead.jsp" %>

<!DOCTYPE html>
<html>
<head>

  <%@include file="/WEB-INF/jsp/common/htmlHead.jsp" %>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <%@include file="/WEB-INF/jsp/common/topBar.jsp" %>
    <%@include file="/WEB-INF/jsp/common/leftBar.jsp" %>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        配置中心
        <small>配置操作</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 配置管理</a></li>
        <li><a href="#">配置列表</a></li>
        <li class="active">查询</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Hover Data Table</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="dataTablesId" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>一列</th>
                  <th>一列</th>
                  <th>一列</th>
                  <th>一列</th>
                  <th>一列</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Trident</td>
                    <td>Internet
                        Explorer 4.0
                    </td>
                    <td>Win 95+</td>
                    <td> 4</td>
                    <td>X</td>
                </tr>

                </tbody>
                <%--<tfoot>--%>
                <%--<tr>--%>
                  <%--<th>Rendering engine</th>--%>
                  <%--<th>Browser</th>--%>
                  <%--<th>Platform(s)</th>--%>
                  <%--<th>Engine version</th>--%>
                  <%--<th>CSS grade</th>--%>
                <%--</tr>--%>
                <%--</tfoot>--%>
              </table>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
    <%@include file="/WEB-INF/jsp/common/footBar.jsp" %>
    <%@include file="/WEB-INF/jsp/common/controlBar.jsp" %>
</div>

<!-- jQuery 2.2.3 -->
<script src="${ctx}/common/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctx}/common/bootstrap/js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="${ctx}/common/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${ctx}/common/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="${ctx}/common/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${ctx}/common/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${ctx}/common/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${ctx}/common/js/demo.js"></script>
<script src="${ctx}/common/js/datatableUtil.js"></script>
<!-- page script -->
<script>
    $(function () {

        initDatatables({
            url: "${ctx}/login/configcenter-data",
            data: function () {
                return {key:"111"};
            },
            cols:[{data: "id"},{data: "id"},{data: "id"},{data: "id"},{data: "id"}]
        });

    });
</script>
</body>
</html>
