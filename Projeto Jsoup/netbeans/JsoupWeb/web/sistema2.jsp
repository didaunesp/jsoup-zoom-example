<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Projeto Jsoup</title>
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.min.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/custom.css" />
        <link rel="stylesheet" href="css/jsoup.css" />
    </head>
    <body>
        <!-- TOPO DA PÁGINA-->
        <div id="topo">
            <%@include file="topo.jsp" %>
        </div>
        <!-- CORPO DA PÁGINA-->
        <div id="conteudoListaTudo">
            <%@include file="conteudoListaTudo.jsp" %>
        </div>
        <!-- RODAPÉ DA PÁGINA-->
        <div id="rodape">
            <%@include file="rodape.jsp" %>
        </div>

        <script src="foundation-6.4.2/js/app.js"></script>
        <script src="foundation-6.4.2/js/vendor/jquery.js"></script>
        <script src="foundation-6.4.2/js/vendor/what-input.js"></script>
        <script src="foundation-6.4.2/js/vendor/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
    </body>
</html>
