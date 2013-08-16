<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>ÜBER</title>
</head>

<body>
<g:select id="teamSelect" name="teamList" from="${teams.name}" noSelection="['null': '--Select a team']"
          size="8"></g:select>

<%--<g:select onchange="${remoteFunction(
        action:'ajaxFetchRiders',
        params:'\'teamId=\' + teamSelect.value',
        id:'groupId',
        name:'groupId',
        from:'${riders}',
        optionKey:'id',
        value:'${riders.first_name} ${riders.last_name}')}" /> --%>
</body>
</html>