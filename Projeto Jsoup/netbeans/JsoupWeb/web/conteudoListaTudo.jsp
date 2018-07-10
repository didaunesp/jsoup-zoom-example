<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="produtoAmericanas" scope="session" class="br.unesp.rc.jsoupDemo.service.AmericanasService" />
<jsp:useBean id="produtoMagalu" scope="session" class="br.unesp.rc.jsoupDemo.service.MagazineLuizaService" />
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Projeto Jsoup</title>
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.min.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/custom.css" />
    </head>
    <body>       
        <!-- TOPO DA PÁGINA-->
        <div id="topo">
            <%@include file="topo.jsp" %> 
        </div>

        <!-- CORPO DA PÁGINA -->
        <div id="conteudo">
            <div class="grid-container">
                <h1>Seja bem vindo!</h1>
                <form>
                    <table>
                        <thead>
                            <tr>
                                <th width="200"></th>
                                <th>Nome do produto</th>
                                <th width="150">Preço</th>
                                <th width="150">Loja</th>
                            </tr>
                        </thead>
                        <tbody>               
                            <%
                                for (int i = 0; i < produtoAmericanas.arrayProdutos.size(); i++) {
                            %>
                            <tr>
                                <td><img alt="imagem" src=<%= produtoAmericanas.arrayProdutos.get(i).getImagem()%>></td>
                                <td>
                                    <a href=<%= produtoAmericanas.arrayProdutos.get(i).preco.getLinkProduto()%>>
                                        <%= produtoAmericanas.arrayProdutos.get(i).getNome()%>
                                    </a>
                                </td>
                                <td><%= produtoAmericanas.arrayProdutos.get(i).preco.getPreco()%></td>
                                <td>
                                    <a href=<%= produtoAmericanas.arrayProdutos.get(i).preco.loja.getUrlLoja()%>>
                                        <img src="images/americanas.jpg" title=<%= produtoAmericanas.arrayProdutos.get(i).preco.loja.getNome()%>>
                                    </a>
                                </td>
                            </tr>
                            <%}%>
                            <%
                                for (int i = 0; i < produtoAmericanas.arrayProdutos.size(); i++) {
                            %>
                            <tr>
                                <td><img alt="imagem" src=<%= produtoMagalu.arrayProdutos.get(i).getImagem()%>></td>
                                <td>
                                    <a href=<%= produtoMagalu.arrayProdutos.get(i).preco.getLinkProduto()%>>
                                        <%= produtoMagalu.arrayProdutos.get(i).getNome()%>
                                    </a>
                                </td>
                                <td><%= produtoMagalu.arrayProdutos.get(i).preco.getPreco()%></td>
                                <td>
                                    <a href=<%= produtoMagalu.arrayProdutos.get(i).preco.loja.getUrlLoja()%>>
                                        <img src="images/americanas.jpg" title=<%= produtoMagalu.arrayProdutos.get(i).preco.loja.getNome()%>>
                                    </a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>

        <!-- RODAPÉ - DESENVOLVEDORES -->
        <div  class="fundoPreto">
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