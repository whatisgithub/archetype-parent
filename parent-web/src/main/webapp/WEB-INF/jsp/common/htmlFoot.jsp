<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/jspHead.jsp" %>


<!-- jQuery 2.2.3 -->
<script src="${ctx}/common/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctx}/common/bootstrap/js/bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="${ctx}/common/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="${ctx}/common/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="${ctx}/common/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${ctx}/common/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="${ctx}/common/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="${ctx}/common/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="${ctx}/common/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${ctx}/common/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="${ctx}/common/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${ctx}/common/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${ctx}/common/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${ctx}/common/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${ctx}/common/js/demo.js"></script>