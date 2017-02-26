<html lang="zh-CN">
<head>
    <meta charset="utf-8">
</head>
<body>
<script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
<script>
    data = {};
    data["username1"] = "haha";
    data["username2"] = "hahafdf";
    $.ajax({
        "url": "/form/submit3",
        "type": "POST",
        "data": JSON.stringify(data),
        "dataType":"json",
        "contentType":"application/json;charset=UTF-8",
        "success": function () {
            alert("success");
        },
        "error": function () {
            alert("error");
        }
    });
</script>
</body>
</html>
